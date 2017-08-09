package cc.chli.vc.common.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import cc.chli.vc.common.constants.ShiroConstant;
import cc.chli.vc.common.shiro.exception.IncorrectCaptchaException;
import cc.chli.vc.common.shiro.token.CaptchaAuthenticationToken;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {

    private String captchaParam = "captcha";

    public String getCaptchaParam() {
        return captchaParam;
    }

    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }

    @Override
    protected AuthenticationToken createToken(ServletRequest request,
            ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);
        return new CaptchaAuthenticationToken(username, password, rememberMe,
                host, captcha);
    }

   // 验证码校验
    protected void doCaptchaValidate(HttpServletRequest request, CaptchaAuthenticationToken token) {
        String captcha = (String) request.getSession().getAttribute(ShiroConstant.CAPTCHA_SESSION_KEY);

        if (StringUtils.isEmpty(token.getCaptcha()) || !token.getCaptcha().equalsIgnoreCase(captcha)) {
            /* 定义IncorrectCaptchaException，shiro显示Exception class name作为error信息 */
            throw new IncorrectCaptchaException("验证码错误！");
        }
    }

  
    // 认证
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        CaptchaAuthenticationToken token = (CaptchaAuthenticationToken) createToken(request, response);

        try {
            doCaptchaValidate((HttpServletRequest) request, token);

            Subject subject = getSubject(request, response);
            subject.login(token);

            return onLoginSuccess(token, subject, request, response);
        } catch (AuthenticationException e) {
            return onLoginFailure(token, e, request, response);
        }
    }
}
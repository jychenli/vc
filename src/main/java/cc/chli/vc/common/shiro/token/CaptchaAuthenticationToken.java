package cc.chli.vc.common.shiro.token;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CaptchaAuthenticationToken extends UsernamePasswordToken{  

    private String captcha;  

    public CaptchaAuthenticationToken (){}  

    public CaptchaAuthenticationToken (String username, String password,
            boolean rememberMe, String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    } 

    public void setCaptcha(String kaptcha){  
        this.captcha= kaptcha;  
    }  

    public String getCaptcha(){  
        return this.captcha;  
    }  
  }
package cc.chli.vc.controller.sys;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;

import cc.chli.vc.controller.BaseController;

@Controller
@RequestMapping("/sys")
public class LoginController  extends BaseController{
	
	
	@Autowired
	private  DefaultManageableImageCaptchaService captchaService;
	  
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	
	
	 @RequestMapping(value = "/jCaptcha.jpg", method = RequestMethod.GET)
	    public void ValidationCode(HttpServletRequest request, HttpServletResponse response) {
	        response.setDateHeader("Expires", 0L);
	        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
	        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
	        response.setHeader("Pragma", "no-cache");
	        response.setContentType("image/jpeg");
	        String id = request.getRequestedSessionId();

	        BufferedImage bi = captchaService.getImageChallengeForID(id);
	        ServletOutputStream out = null;
	        try {
	            out = response.getOutputStream();
	            ImageIO.write(bi, "jpg", out);
	            out.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                out.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }

}

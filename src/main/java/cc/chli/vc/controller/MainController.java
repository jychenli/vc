package cc.chli.vc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController extends  BaseController{

	@RequestMapping("/main")
	public String main(Model model) {
		return "main";
	}
	
	/**
	 * 管理登录
	 * @throws IOException 
	 *//*
	@RequestMapping(value = "${adminPath}/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Principal principal = UserUtils.getPrincipal();
		// 如果已经登录，则跳转到管理首页
		if(principal != null){
			UserUtils.getSubject().logout();
			
		}
	   // 如果是手机客户端退出跳转到login，则返回JSON字符串
			String ajax = request.getParameter("__ajax");
			if(	ajax!=null){
				model.addAttribute("success", "1");
				model.addAttribute("msg", "退出成功");
				return renderString(response, model);
			}
		 return "redirect:" + adminPath+"/login";
	}*/
}

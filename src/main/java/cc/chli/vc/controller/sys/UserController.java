package cc.chli.vc.controller.sys;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cc.chli.vc.controller.BaseController;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{


	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public String checkLogin(Model model) {
		System.out.println("sss");
		return "main";
	}
}

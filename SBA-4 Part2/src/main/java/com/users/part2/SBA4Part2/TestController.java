package com.users.part2.SBA4Part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.users.part2.SBA4Part2.Model.dxc_users;
import com.users.part2.SBA4Part2.dao.Testdao;

@Controller
public class TestController {
	@Autowired
	Testdao dao;
	
	@RequestMapping(value="/")
	public String go() {
		return "home";
	}
	
	@RequestMapping(value="user")
	public String validate(@RequestParam("userId")String userId,@RequestParam("password")String password,Model model){
		
		String val=dao.Validate(userId, password);
		model.addAttribute("val",val);
		System.out.println(val);
		if(val.equals("valid")) {
			return "display";
		}
		else {
		return "home";
		}
				
	}
	@RequestMapping(value="ok")
	public String OK(Model model,@ModelAttribute dxc_users users) {
		String reg=dao.saveusers(users);
		System.out.println(reg);
		model.addAttribute("reg",reg);
		return "reg";
	}
	
	@RequestMapping(value="fi")
	public String fi() {
		return "Forgotpassword";
	}
	String user_id=null;
	@RequestMapping(value="forgot")
	public String pass(Model model,@RequestParam("id")String id,@RequestParam("qs")String qs,
			@RequestParam("answer")String answer) {
		this.user_id=id;
		String value=dao.forgotpassword(id,qs,answer);
		System.out.println(value);
		model.addAttribute("value",value);
		model.addAttribute("user_id",user_id);
		if(value.equals("valid")) {
			return "change";
		}
		else {
			return "Forgotpassword";
		}
	}
	@RequestMapping(value="update")
	public String update(Model model,@RequestParam("pass")String pass)
	{
		String up=dao.updateuser(user_id, pass);
		model.addAttribute("up",up);
		return "update";
	}
	@RequestMapping(value="reg")
	public String reg() {
		
		return "Register";
	}
	
}

package com.myserv.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myserv.app.Model.Scientist;
import com.myserv.app.dao.ScientistDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(df,false));
	}
	@Autowired
	ScientistDao dao;
		@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
		
		
		@RequestMapping(value="save")
		public String datasave(Model model,@ModelAttribute Scientist scientist){
			
			String status=dao.saveScientist(scientist);
			System.out.println(status);
			System.out.println("out");
			model.addAttribute("status",status);
			return "disp";
		}
		
		@RequestMapping(value="/updatePage")
		public String update()
		{
		return "updatePage";
		}
		String sid=null;

		@RequestMapping(value="/searchforUpdate")
		public String searchForUpdate(Model model,@RequestParam("sid") String Sid)
		{
		
		this.sid=Sid;
		Scientist scientist=dao.getScientistById(Sid);
		System.out.println(scientist);
		model.addAttribute(scientist);
		return "updatePage";
		}


		@RequestMapping(value="/updatedata")
		public String updateData(Model model,@ModelAttribute Scientist scientist)
		{
		scientist.setSid(sid);
		System.out.println(sid);
		String update=dao.updateScientistById(scientist);
		model.addAttribute("update",update);
		return "Udisp";
		}
		@RequestMapping(value="delete")
		public String deletedata(Model model,@RequestParam("sname")String sname) {
			String so=dao.DeleteScientistByName(sname);
			model.addAttribute("sna",so);
			return "dele";
		}
		@RequestMapping(value="/Search")
		public String Search()
		{
		return "Search";
		}
		@RequestMapping(value="Searchbyname")
		public String searchname(Model model,@RequestParam("sname")String sname){
			Scientist st=dao.getScientistByName(sname);
			model.addAttribute("stt",st);
			return "searchdisp";
		}
		@RequestMapping(value="searchid")
		public String searchid(Model model,@RequestParam("sid")String sid) {
			Scientist sti=dao.getScientistById(sid);
			System.out.println(sti);
			model.addAttribute("stti",sti);
			return "searchdispi";
		}
		@RequestMapping(value="SearchAll")
		public String SearchAll(Model model) {
			ArrayList<Scientist>sc=dao.getAll();
			model.addAttribute("sci",sc);
			return "searchall";
		}
		
		

	
}

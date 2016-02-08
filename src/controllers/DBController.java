package controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import database.EmployeeDAO;

@Controller
public class DBController {
	@Autowired
	private EmployeeDAO test;

	@RequestMapping("process.do")
	public ModelAndView processData(@RequestParam("data") String s) throws ClassNotFoundException, SQLException {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("view.jsp");
		mv.addObject("result", test.databaseconnection(s));
		return mv;
	}
	
	@RequestMapping("update.do")
	public ModelAndView updateData(@RequestParam("data") String s) throws ClassNotFoundException, SQLException {
		int num = test.getUpdate(s);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	

}

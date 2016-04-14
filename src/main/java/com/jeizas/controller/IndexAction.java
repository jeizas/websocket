package com.jeizas.controller;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexAction implements Serializable{

	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger(IndexAction.class);
	
	
	/**
	 * 默认页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("pageType", "index");
		return "index";
	}
	
}

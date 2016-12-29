package com.cn.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.cn.test.service.IPerformanceService;

@Controller//声明一个控制器
public class HomeController {

	@Autowired
	private IPerformanceService performanceService;
	
	@RequestMapping(value="/home/test/{param3}",method=RequestMethod.GET)//处理对/web/home/test的请求
	public String home(Model model,
			@RequestParam("param1") String param1,
			@RequestParam("param2") Integer param2,
			@PathVariable("param3") String param3){
		model.addAttribute("model", "我是一个填充的参数");
		return "test";//返回的试图名称
	}
	
	@RequestMapping(value="/home/file",method=RequestMethod.POST)//处理对/web/home/test的请求
	public String home_file(Model model,@RequestPart("file") MultipartFile file){
		model.addAttribute("model", "我是一个填充的参数");
		return "test";//返回的试图名称
	}
	
	@RequestMapping(value="/home/testH",method=RequestMethod.GET)
	public String testHibiernate(Model model){
		performanceService.testHibernate();
		model.addAttribute("model", "我是一个填充的参数");
		return "test";//返回的试图名称
	}
}

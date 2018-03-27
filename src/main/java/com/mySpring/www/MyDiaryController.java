package com.mySpring.www;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myService.MyDiaryService;

@Controller
public class MyDiaryController {
	@Inject
	MyDiaryService myDiaryService;

	@RequestMapping(value = "/diary/insertdiary")
	public String insertDiary(HttpServletRequest request) {

		myDiaryService.writeDiary(request);

		return "home";
	}

	@RequestMapping(value = "/diary/writeDiary")
	public String writeDiary() {

		return "diary/writeDiary";
	}
}

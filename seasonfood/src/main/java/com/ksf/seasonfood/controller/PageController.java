package com.ksf.seasonfood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("seasonfood")
public class PageController {
	@GetMapping("index")
	public void showIndex() {
		;
	}
}

package com.ksf.seasonfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksf.seasonfood.servicexml.ParsingXmlService;

@RestController
@RequestMapping("api")
public class DataParsing {
	@Autowired
	ParsingXmlService parsingXmlService;

	@GetMapping("opendata")
	public void parsingToDb() {
		parsingXmlService.insertApiData();
	}
}

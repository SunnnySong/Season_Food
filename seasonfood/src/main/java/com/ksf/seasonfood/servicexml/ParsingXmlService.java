package com.ksf.seasonfood.servicexml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksf.seasonfood.daoxml.ParsingXmlDao;

@Service
public class ParsingXmlService {
	@Autowired
	ParsingXmlDao parsingXmlDao;

	public void insertApiData() {
		String xmlData = "";

		parsingXmlDao.insertApiData(xmlData);
	}
}

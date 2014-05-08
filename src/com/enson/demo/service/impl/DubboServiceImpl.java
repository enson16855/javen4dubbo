package com.enson.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.enson.demo.service.DubboService;

public class DubboServiceImpl implements DubboService{

	@Override
	public String printWord(String word) {
		String outWord = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss ]")
			.format(new Date()) + word;
		System.err.println(outWord);
		return outWord;
	}

}

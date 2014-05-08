package com.enson.custom.action;

import com.enson.demo.service.DubboService;

public class DubboAction {
	public DubboService dubboService ;

	//Spring 方法注入
	public void setDubboService(DubboService dubboService) {
		this.dubboService = dubboService;
	}
	
	public String printWord(){
		System.out.println("action printWord被执行！");
		return this.dubboService.printWord("Hello World");// 执行远程方法
	}
}

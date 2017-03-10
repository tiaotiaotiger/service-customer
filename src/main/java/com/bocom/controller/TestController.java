package com.bocom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocom.service.DataAreaTypeClient;

/**
 * ClassName:TestController
 * Function: 
 * Date:     2017年3月10日 下午1:45:29
 * @author   chenzz
 * @since    JDK 1.7
 */

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	DataAreaTypeClient client;

	@GetMapping("/listDataByParam")
	public String listDataByParam(String areaName) {
		String str = client.listDataByParam(areaName);
		System.out.println("======" + str);
		return str;
	}
	
	@GetMapping("/aaa")
	public String aaa() {
		String str = client.aaa();
		System.out.println("======" + str);
		return str;
	}
}

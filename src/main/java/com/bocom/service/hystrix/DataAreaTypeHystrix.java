package com.bocom.service.hystrix;

import org.springframework.stereotype.Component;

import com.bocom.service.DataAreaTypeClient;

/**
 * ClassName:DataAreaTypeHystrix
 * Function: 
 * Date:     2017年3月10日 下午1:44:10
 * @author   chenzz
 * @since    JDK 1.7
 */

@Component
public class DataAreaTypeHystrix implements DataAreaTypeClient{

	public String listDataByGet(String areaName) {
		
		return "listDataByGet error";
	}

	@Override
	public String listDataByPost(String areaName) {
		return "listDataByPost error";
	}

}


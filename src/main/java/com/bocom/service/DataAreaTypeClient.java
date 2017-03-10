package com.bocom.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bocom.service.hystrix.DataAreaTypeHystrix;

/**
 * ClassName:DataAreaTypeClient
 * Function: 
 * Date:     2017年3月10日 下午1:36:54
 * @author   chenzz
 * @since    JDK 1.7
 */

@FeignClient("service-provider")
public interface DataAreaTypeClient {

	@RequestMapping(value="listDataByParam",method=RequestMethod.GET)
	public String listDataByParam(String areaName);
	
	@RequestMapping(value="/aaa",method=RequestMethod.GET)
	public String aaa();
}

package com.bocom.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bocom.service.hystrix.DataAreaTypeHystrix;

/**
 * ClassName:DataAreaTypeClient
 * Function: 
 * Date:     2017年3月10日 下午1:36:54
 * @author   chenzz
 * @since    JDK 1.7
 */

@FeignClient(value = "service-provider" ,fallback=DataAreaTypeHystrix.class )
public interface DataAreaTypeClient {

	@RequestMapping(value = "/listDataByGet", method = RequestMethod.GET)
	public String listDataByGet(@RequestParam("areaName") String areaName);

	@RequestMapping(value = "/listDataByPost", method = RequestMethod.POST)
	public String listDataByPost(String areaName);
}

package com.joyin.cloud.controller;

import com.joyin.cloud.model.Module;
import com.joyin.cloud.service.ModuleService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModuleController
{
	@Autowired
	private ModuleService service;

	@RequestMapping(value = "/module/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Module module)
	{
		return service.add(module);
	}

	@RequestMapping(value = "/module/get/{dbid}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "fllbackGet" )
	public Module get(@PathVariable("dbid") Integer dbid)
	{
		Module md = service.get(dbid);
		if(null ==md){
			throw new RuntimeException("抛出运行时异常，测试hystrix是否触发");
		}
		return md;
	}

	@RequestMapping(value = "/module/list", method = RequestMethod.GET)
	public List<Module> list()
	{
		return service.list();
	}

	public Module fllbackGet(@PathVariable("dbid") Integer dbid){
		Module md = new Module();
		md.setDbid(dbid);
		md.setModulename("触发hystrix熔断机制");
		md.setDbsource("触发hystrix熔断机制");
		return md;
	}

}

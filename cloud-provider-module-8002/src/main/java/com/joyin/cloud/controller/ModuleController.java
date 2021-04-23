package com.joyin.cloud.controller;

import com.joyin.cloud.service.ModuleService;
import com.joyin.cloud.model.Module;
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
	public Module get(@PathVariable("dbid") Integer dbid)
	{
		return service.get(dbid);
	}

	@RequestMapping(value = "/module/list", method = RequestMethod.GET)
	public List<Module> list()
	{
		return service.list();
	}

}

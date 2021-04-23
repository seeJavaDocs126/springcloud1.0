package com.joyin.cloud.controller;

import com.joyin.cloud.model.Module;
import  com.joyin.cloud.service.ModuleClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ModuleController_Consumer
{

	@Autowired
	private ModuleClientService clientService;

	@RequestMapping(value = "/consumer/module/add")
	public boolean add(Module module)
	{
		return clientService.add(module);
	}

	@RequestMapping(value = "/consumer/module/get/{id}")
	public Module get(@PathVariable("id") Integer id)
	{
		return clientService.get(id);
	}

	@RequestMapping(value = "/consumer/module/list")
	public List<Module> list()
	{
		return clientService.list();
	}

}

package com.joyin.cloud.service;


import com.joyin.model.Module;

import java.util.List;

public interface ModuleService
{
	public boolean add(Module dept);

	public Module get(Integer id);

	public List<Module> list();
}
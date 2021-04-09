package com.joyin.cloud.service.impl;

import java.util.List;

import com.joyin.cloud.dao.ModuleDao;
import com.joyin.cloud.service.ModuleService;
import com.joyin.model.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl implements ModuleService
{
	@Autowired
	private ModuleDao moduleDao;
	
	@Override
	public boolean add(Module dept)
	{
		return moduleDao.addModule(dept);
	}

	@Override
	public Module get(Integer id)
	{
		return moduleDao.findById(id);
	}

	@Override
	public List<Module> list()
	{
		return moduleDao.findAll();
	}

}

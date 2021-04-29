package com.joyin.cloud.service.impl;

import com.joyin.cloud.dao.ModuleDao;
import com.joyin.cloud.model.Module;
import com.joyin.cloud.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
	public Module get(Integer dbid)
	{
		return moduleDao.findById(dbid);
	}

	@Override
	public List<Module> list()
	{
		return moduleDao.findAll();
	}

}

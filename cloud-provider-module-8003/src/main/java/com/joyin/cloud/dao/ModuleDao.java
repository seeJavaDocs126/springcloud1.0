package com.joyin.cloud.dao;

import com.joyin.model.Module;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ModuleDao
{
	public boolean addModule(Module dept);

	public Module findById(Integer id);

	public List<Module> findAll();
}

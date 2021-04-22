package com.joyin.cloud.controller;

import java.util.List;

import com.joyin.model.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ModuleController_Consumer
{

	private static final String REST_URL_PREFIX = "http://CLOUD-MODULE";

	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/module/add")
	public boolean add(Module module)
	{
		return restTemplate.postForObject(REST_URL_PREFIX + "/module/add", module, Boolean.class);
	}

	@RequestMapping(value = "/consumer/module/get/{id}")
	public Module get(@PathVariable("id") Long id)
	{
		return restTemplate.getForObject(REST_URL_PREFIX + "/module/get/" + id, Module.class);
	}

	@RequestMapping(value = "/consumer/module/list")
	public List<Module> list()
	{
		return restTemplate.getForObject(REST_URL_PREFIX + "/module/list", List.class);
	}

}

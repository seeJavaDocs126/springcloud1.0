package com.joyin.cloud.service;

/**
 * @author wd
 * @Classname ModuleClientService
 * @Description TODO
 * @Date 2021-04-23 12:15
 * @Version V1.0
 */

import com.joyin.cloud.model.Module;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wd
 * @Classname ModuleClientService
 * @Description 定义Feign客户端接口
 * @Date 2021-04-23 9:57
 * @Version V1.0
 */
@FeignClient(value="CLOUD-MODULE",fallbackFactory = ModuleClientServiceFallbackFactory.class)
public interface ModuleClientService {

    @RequestMapping(value = "/module/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Module module);

    @RequestMapping(value = "/module/get/{dbid}", method = RequestMethod.GET)
    public Module get(@PathVariable("dbid") Integer dbid);

    @RequestMapping(value = "/module/list", method = RequestMethod.GET)
    public List<Module> list();
}


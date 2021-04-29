package com.joyin.cloud.service;

import com.joyin.cloud.model.Module;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wd
 * @Classname ModuleClientServiceFallbackFactory
 * @Description TODO
 * @Date 2021-04-25 8:14
 * @Version V1.0
 */
@Component
public class ModuleClientServiceFallbackFactory implements FallbackFactory<ModuleClientService> {
    @Override
    public ModuleClientService create(Throwable throwable) {
        return new ModuleClientService() {
            @Override
            public boolean add(Module module) {
                return false;
            }

            @Override
            public Module get(Integer dbid) {
               return new Module().setModulename("测试客户端服务降级");
            }

            @Override
            public List<Module> list() {
                return null;
            }
        };
    }
}

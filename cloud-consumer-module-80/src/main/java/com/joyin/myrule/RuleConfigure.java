package com.joyin.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wd
 * @Classname RuleConfigure
 * @Description
 *  * 该类为Ribbon的配置类
 *  * 该类不能被@ComponentScan扫描到,即不能放在主启动类同一个包以及子包下
 * @Date 2021-04-22 14:47
 * @Version V1.0
 */
@Configuration
public class RuleConfigure {
    @Bean
    public IRule myDefRule(){
        return new MyDefRule();
    }
}

package com.abc.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  // 生命周期交由spring容器管理
@PropertySource(value = "classpath:custom.properties", encoding = "UTF-8")      // 指定要读取的配置文件名称
@ConfigurationProperties("def.country")                 // 指定要读取的属性的前缀
@Data                                               // lombok
public class Country {
    private List<String> cities;
}

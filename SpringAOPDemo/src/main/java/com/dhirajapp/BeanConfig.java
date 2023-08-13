package com.dhirajapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.dhirajapp")
@EnableAspectJAutoProxy
public class BeanConfig {

}

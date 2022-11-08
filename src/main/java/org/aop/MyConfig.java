package org.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


// creating SpringContainer
// JavaContainer + @Annotation in work classes
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class MyConfig {


}

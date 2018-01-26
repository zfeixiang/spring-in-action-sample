package com.example.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 1、使用自动配置，只需打开ComponentScan注解，取消xml导入
 * 2、使用Java配置，需使用 bean 注解的方法
 * 3、当前为使用 xml 方式的样例
 */
@Configuration
//@ImportResource(locations="classpath:spring-beans.xml")
//@ComponentScan("com.example.soundsystem")
@PropertySource("classpath:/soundsystem.properties")
public class CDPlayerConfig {
	
	@Autowired
	Environment env;
	
/*
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
	*/
	@Bean
	public MediaPlayer cdPlayer( CompactDisc cd ) {
		return new CDPlayer(cd);
		//使用 JavaConfig 装配的类属性名要与此方法名一致
	}
	
	/*@Bean
	public BlankDisc compactDisc() {
		return new BlankDisc(
				//如果文件中属性值为空，则第二个参数作为默认
			env.getProperty("disc.title","Rattle and Hum"),
			env.getProperty("disc.artist","U2"));
		
	}*/
	
}

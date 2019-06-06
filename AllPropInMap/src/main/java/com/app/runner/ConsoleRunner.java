package com.app.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties
@Component
public class ConsoleRunner implements CommandLineRunner {
private Map<String,String> my;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(my);
	}
	public ConsoleRunner() {
		super();
	}
	public Map<String, String> getMy() {
		return my;
	}
	public void setMy(Map<String, String> my) {
		this.my = my;
	}
	@Override
	public String toString() {
		return "ConsoleRunner [my=" + my + "]";
	}

}

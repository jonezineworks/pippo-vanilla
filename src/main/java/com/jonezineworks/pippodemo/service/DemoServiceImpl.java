package com.jonezineworks.pippodemo.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

	@Override
	public String helloWorld() {
		return "HelloWorld";
	}

	@Override
	public List<String> helloWorldList() {
		List<String> helloList = new ArrayList<>();
		helloList.add("Hello");
		helloList.add("World");
		helloList.add("!");
		return helloList;
	}

	@Override
	public LocalDateTime timestamp() {
		return LocalDateTime.now();
	}

}

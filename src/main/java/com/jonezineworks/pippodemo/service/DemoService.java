package com.jonezineworks.pippodemo.service;

import java.time.LocalDateTime;
import java.util.List;

public interface DemoService {

	String helloWorld();
	List<String> helloWorldList();
	LocalDateTime timestamp();
}

package com.jonezineworks.pippodemo;

import com.jonezineworks.pippodemo.controller.DemoController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.pippo.controller.ControllerApplication;
import ro.pippo.spring.SpringControllerFactory;

public class MyApplication extends ControllerApplication {

	@Override
	protected void onInit() {

		// create spring application context
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		// registering SpringControllerFactory
		setControllerFactory(new SpringControllerFactory(applicationContext));

		// add controller(s)
		addControllers(DemoController.class); // one instance for EACH request

	}
}

package com.jonezineworks.pippodemo.controller;

import com.jonezineworks.pippodemo.service.DemoService;
import ro.pippo.controller.Controller;
import ro.pippo.controller.GET;
import ro.pippo.controller.Path;
import ro.pippo.controller.Produces;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

@Path("/demo" )
@Produces(Produces.JSON)
public class DemoController extends Controller {

	private final DemoService demoService;

	@Inject
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}

	@GET("/helloWorld")
	public String helloWorld() {
		return demoService.helloWorld();
	}

	@GET("/helloWorldList")
	public List<String> helloWorldList() {
		return demoService.helloWorldList();
	}

	@GET("/timestamp")
	public LocalDateTime timestamp() {
		return demoService.timestamp();
	}

}

package com.hp.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {
	@RequestMapping("/view")
	public String view() {
		return "view the app";

	}

}

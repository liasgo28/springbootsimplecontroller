package br.com.diego.springbootsimplecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello I'm a Simple Controller";
	}
}

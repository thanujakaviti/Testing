package in.jt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	
	public String wecomeMsg() {
		return "Welcome To Java Techniques..!!!";
	}
}

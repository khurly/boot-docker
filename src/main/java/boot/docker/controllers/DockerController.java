package boot.docker.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@RequestMapping(path = "/", method = GET)
	public String helloDocker() {
		return "hello from docker";
	}
}

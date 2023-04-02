package top.openbian.OpenBianAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.openbian.OpenBianAPI.v1.Result;
import top.openbian.OpenBianAPI.v1.ResultGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class OpenBianApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenBianApiApplication.class, args);
	}
	@RequestMapping("/")
	public Result root(){
		return ResultGenerator.getSuccessResult("Welcome to the OpenBian API!");
	}
}

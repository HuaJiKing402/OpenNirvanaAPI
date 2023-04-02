package top.bianstudio.OpenNirvanaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.bianstudio.OpenNirvanaAPI.v1.Result;
import top.bianstudio.OpenNirvanaAPI.v1.ResultGenerator;

@SpringBootApplication
@RestController
public class OpenNirvanaApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenNirvanaApiApplication.class, args);
	}
	@RequestMapping("/")
	public Result root(){
		return ResultGenerator.getSuccessResult("Welcome to the OpenBian API!");
	}
}

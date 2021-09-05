package com.cos.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		// component-scan == IoC(나 스프링이 heap 객체 관리하겠다.) 
		// com.cos.blog 부터 하위로 스캔을하기때문에 다음 패키지만들때  com.cos.test 이런식으로 blog 상위로 하면 안됨
		SpringApplication.run(BlogApplication.class, args);
	}

}

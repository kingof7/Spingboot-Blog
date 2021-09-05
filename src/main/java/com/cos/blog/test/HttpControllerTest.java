package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(Data)

@RestController
public class HttpControllerTest {
	
	// http://localhost:8081/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) { // @RequestParam int id, @RequestParam String id은 개별적으로 받을때
		return "get 요청:" + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
	}
	
//	// http://localhost:8081/http/post (insert)
//	@PostMapping("/http/post") // application/json
//	public String postTest(@RequestBody String text) {
//		return "post 요청 : "+text;
//	}
	
	// http://localhost:8081/http/post (insert)
		@PostMapping("/http/post") // application/json
		public String postTest(@RequestBody String text) {
			return "post 요청 : "+text;
		}
	
	// http://localhost:8081/http/put (update)
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	
	// http://localhost:8081/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	

}

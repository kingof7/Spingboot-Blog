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
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		//Member m = new Member(1, "ssar", "1234", "email");
		Member m = Member.builder().username("ssar").password("1234").email("vlfl0@naver.com").build(); // 1.생성자 순서안지켜도됨 2.set할때 순서 기억안해도됨
		System.out.println(TAG+"getter : " + m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG+"setter : " + m.getUsername());		
		return "lombok test 완료";
	}
	
	private static final String TAG = "HttpController Test : ";
	
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
	
//	@PostMapping("/http/post") // application/json
//	public String postTest(@RequestBody Member m) {
//		return "post 요청 : " + m.getId() +", " + m.getUsername() +", " + m.getPassword() + ", " + m.getEmail();
//	}
	
	// http://localhost:8081/http/post (insert)
		@PostMapping("/http/post") // application/json
		public String postTest(@RequestBody Member m) { //MessageConverter (springboot) -- json으로 요청했을 시
			return "post 요청 : " + m.getId() +", " + m.getUsername() +", " + m.getPassword() + ", " + m.getEmail();
		}
	
	// http://localhost:8081/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청 : " + m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	// http://localhost:8081/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	

}

package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@Getter
//@Setter
//@AllArgsConstructor // 생성자
//@RequiredArgsConstructor // final 붙여야함

@Data //getter + setter
@NoArgsConstructor // 빈생성자
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
	
	@Builder // 파라미터 갯수 자동조절
	public Member(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
		

}

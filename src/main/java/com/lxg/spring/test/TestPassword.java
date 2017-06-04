package com.lxg.spring.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class TestPassword {
	public static void main(String[] args) {
		 String encodePassword = new Md5PasswordEncoder().encodePassword("doc", null);
		 System.out.println(encodePassword);
	}

}

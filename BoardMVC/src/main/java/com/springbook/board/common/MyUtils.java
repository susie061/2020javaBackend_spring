package com.springbook.board.common;

import org.mindrot.jbcrypt.BCrypt;

public class MyUtils {
	
	public static String gensalt() {
		return BCrypt.gensalt();
	}
	
	public static String hashPassword(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
	}
	
	
	//len:길이 (0~9사이의 숫자)
	
	public static String makeRandomNumber(int len) {
		String result = null;
		
		return result;
	}
}

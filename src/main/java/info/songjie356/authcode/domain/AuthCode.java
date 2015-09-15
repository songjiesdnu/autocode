package info.songjie356.authcode.domain;

import java.util.Date;

public class AuthCode {
	//唯一
	private String id;
	
	//验证码
	private String authCode;
	
	
	
	private long timeStamp = new Date().getTime();
	
	//
	private String ip;
}

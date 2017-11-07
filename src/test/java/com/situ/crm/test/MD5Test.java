package com.situ.crm.test;

import org.junit.Test;

import com.situ.crm.util.MD5Util;

public class MD5Test {

	@Test
	public void test1() {
	String md5EncodeUtf8 = MD5Util.EncodeUtf8("123abc");
		System.out.println(md5EncodeUtf8);
		//900150983CD24FB0D6963F7D28E17F72
		//900150983CD24FB0D6963F7D28E17F72
	}
	
	@Test
	public void test2() {
		String md5EncodeUtf8 = MD5Util.EncodeUtf8AddSalt("abc");
		System.out.println(md5EncodeUtf8);
	}
}

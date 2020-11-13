package com.xworkz.online;

public class SearchTester {

	public static void main(String[] args) {
		System.out.println("jvm invoked");
		System.out.println("total items:"+Amazon.totalItems());
		Amazon.search("mirror");
		System.out.println("main exit");
	}

}

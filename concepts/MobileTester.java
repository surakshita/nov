package com.xworkz.concepts;

import com.xworkz.concepts.obj.mobile.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		
		Mobile.ram="12GB";
		
		Mobile mobile=new Mobile();
		mobile.brand="samsung";
		mobile.price="22999";
		mobile.color="red";
		mobile.model="Galaxy A51";
		mobile.info();
		
		System.out.println(("###############################"));
		
		Mobile mobile2=new Mobile();
		mobile2.brand="xiaomi";
		mobile2.price="9999";
		mobile2.color="blue";
		mobile2.model="Redmi 9";
		mobile2.info();
		
		System.out.println(("###############################"));
		
		Mobile mobile3=new Mobile();
		mobile3.brand="LG";
		mobile3.price="32999";
		mobile3.color="black";
		mobile3.model="LG K5OS";
		mobile3.info();
		
		System.out.println(("###############################"));
		
		Mobile mobile4=new Mobile();
		mobile4.brand="OPPO";
		mobile4.price="45000";
		mobile4.color="blue";
		mobile4.model="oppo reno 3";
		mobile4.info();
		
		System.out.println(("###############################"));
		
		Mobile mobile5=new Mobile();
		mobile5.brand="vivo";
		mobile5.price="40000";
		mobile5.color="red";
		mobile5.model="vivo x50";
		mobile5.info();
		System.out.println(("###############################"));
		
		Mobile mobile6=new Mobile();
		mobile6.brand="nokia";
		mobile6.price="50000";
		mobile6.color="blue";
		mobile6.model="nokia 10";
		mobile6.info();
		System.out.println(("###############################"));
		
		Mobile mobile7=new Mobile();
		mobile7.brand="apple";
		mobile7.price="60000";
		mobile7.color="silver";
		mobile7.model="iphone 12";
		mobile7.info();
		System.out.println(("###############################"));
		
		Mobile mobile8=new Mobile();
		mobile8.brand="oneplus";
		mobile8.price="35000";
		mobile8.color="blue";
		mobile8.model="oneplus 7";
		mobile8.info();
		System.out.println(("###############################"));
		
		Mobile mobile9=new Mobile();
		mobile9.brand="google";
		mobile9.price="90000";
		mobile9.color="white";
		mobile9.model="pixel 3a";
		mobile9.info();
		System.out.println(("###############################"));
		
		Mobile mobile10=new Mobile();
		mobile10.brand="huawei";
		mobile10.price="79999";
		mobile10.color="green";
		mobile10.model="huawei p40";
		mobile10.info();
		System.out.println(("###############################"));
	}

}

package com.xworkz.copies;

import com.xworkz.copies.camera.Camera;

public class CameraTester {

	public static void main(String[] args) {
		
		Camera.autoFocus="automatic";
		Camera.displayType="LCD";
		
		Camera camera1=new Camera();
		camera1.brand="nikon";
		camera1.connectivity="wifi";
		camera1.battery="rechargeable";
		camera1.color="black";
		camera1.price="39990";
		camera1.detail();
		
		System.out.println("**********************************");
		
		Camera camera2=new Camera();
		camera2.brand="canon";
		camera2.connectivity="usb";
		camera2.battery="rechargeable";
		camera2.color="silver";
		camera2.price="49999";
		camera2.detail();
		
		
		System.out.println("**********************************");
		
		
		Camera camera3=new Camera();
		camera3.brand="GoPro";
		camera3.connectivity="wifi";
		camera3.battery="usb";
		camera3.color="blue";
		camera3.price="55000";
		camera3.detail();
		
		System.out.println("**********************************");
		
		
	
	}

}

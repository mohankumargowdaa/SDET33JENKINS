package com.jenkins.practice;

import org.testng.annotations.Test;

public class class3Test {
	
	@Test
	public void testStep1() {
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		System.out.println(browser+" "+url);
		System.out.println("Step1 in class3");
	}DFLKJASLKJDFSLK

}

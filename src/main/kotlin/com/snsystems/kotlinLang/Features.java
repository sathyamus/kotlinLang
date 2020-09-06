package com.snsystems.kotlinLang;

public class Features {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting + " World");

        DealJavaDTO dealJavaDTO = new DealJavaDTO(1, "PRIME", "Premium Deal", "Active");
        System.out.println("Deal Code : " + dealJavaDTO.getDealCode());
        System.out.println("Deal Name : " + dealJavaDTO.getDealName());
        System.out.println("Status: " + dealJavaDTO.getStatus());
		
		
		if (greeting != null) {
			System.out.println(greeting);
		}
    }
}

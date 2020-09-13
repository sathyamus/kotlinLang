package com.snsystems.kotlinLang;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Functions {

    public static void main(String[] args) {
        Functions func = new Functions();
        func.display("Hello");
        System.out.println(func.sum(10, 20));
    }

    public void display(String text) {
        System.out.println("Displaying {text}");
    }

    public int sum(int a, int b) {
        return a+b;
    }
}

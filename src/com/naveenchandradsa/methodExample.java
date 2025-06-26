package com.naveenchandradsa;

import java.util.*;

public class methodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        //pass by value in Java
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name) {
        name="Captain America";
        System.out.println("Hello " +name);
    }
}

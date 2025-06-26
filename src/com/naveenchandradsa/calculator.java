package com.naveenchandradsa;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter operation you want to perform:");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b == 0) {
                        System.out.println("Cannot be divided by 0");
                        continue;
                    }
                    else{
                        ans = a/b;
                    }
                }
                if (op == '%') {
                    if (b == 0) {
                        System.out.println("Cannot be divided by 0");
                        continue;
                    }
                    else{
                        ans = a%b;
                    }
                }
                System.out.println(ans);
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}

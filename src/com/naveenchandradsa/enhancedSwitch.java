package com.naveenchandradsa;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekdays");
            case "Saturday", "Sunday" -> System.out.println("Weekends");
            default -> System.out.println("Enter correct day");
        }
    }
}

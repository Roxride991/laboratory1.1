package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("введите x: ");
        int x = sc.nextInt();
        System.out.println("введите y: ");
        int y = sc.nextInt();

        if (x > 0 & y > 0) {
            System.out.println(" 1 четверть");
        }
        if (x < 0 & y > 0) {
            System.out.println(" 2 четверть");
        }
        if (x < 0 & y < 0) {
            System.out.println(" 3 четверть");
        }
        if (x > 0 & y < 0) {
            System.out.println(" 4 четверть");
        }
    }
}
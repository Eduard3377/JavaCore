package main;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input full name ");

        String fullName = scanner.nextLine();
        System.out.println("Welcome " + fullName);
    }
}

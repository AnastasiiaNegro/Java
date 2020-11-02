package com.anastasiia;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter count potatoes:");
        int countPotatoes = scanner.nextInt();
        System.out.println("Enter count package:");
        int countPackage = scanner.nextInt();
        int countPotatoesinPackage;
        countPotatoesinPackage = countPotatoes/countPackage;
        System.out.println("Count potatoes in package:" + countPotatoesinPackage);
        System.out.println("Remainder potatoes:" + (countPotatoes - (countPackage * countPotatoesinPackage)));

    }
}


package com.anastasiia;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter count potatoes:");
        int countPotatos = scanner.nextInt();
        System.out.println("Enter count package:");
        int countPackage = scanner.nextInt();
        int countPotatosinPackage;
        countPotatosinPackage = countPotatos/countPackage;
        System.out.println("Count potatoes in package:" + countPotatosinPackage);
        System.out.println("Remainder potatoes:" + (countPotatos - (countPackage * countPotatosinPackage)));

    }
}


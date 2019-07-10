package com.anastasiia;

import java.util.Scanner;

public class Dz1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter count potatos:");
        int countPotatos = scanner.nextInt();
        System.out.println("Enter count package:");
        int countPackage = scanner.nextInt();
        int countPotatosinPackage;
        countPotatosinPackage = countPotatos/countPackage;
        System.out.println("Count potatos in package:" + countPotatosinPackage);
        System.out.println("Remainder potatos:" + (countPotatos - (countPackage * countPotatosinPackage)));

    }
}
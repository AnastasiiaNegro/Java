package com.anastasiia;

public class Main {

    public static void main(String[] args) {
        IBuilding HouseInTheVillage = new HouseInTheVillage();
        System.out.println(HouseInTheVillage.toString());
        IBuilding CountryHouse = new CountryHouse();
        System.out.println(CountryHouse.toString());
        IBuilding CityHouse = new CityHouse();
        System.out.println(CityHouse.toString());
        IBuilding Garage = new Garage();
        System.out.println(Garage.toString());
        IBuilding Shed = new Shed();
        System.out.println(Shed.toString());
        IBuilding Magazine = new Magazine();
        System.out.println(Magazine.toString());

    }
}

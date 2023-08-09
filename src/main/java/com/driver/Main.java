package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();

//        r.name = "Ashish";
//        System.out.println(r.name);
//        java: name has private access in com.driver.RWOnly
//        returns this error because name has private access modifier

        r.setName("Kulbir");
        System.out.println(r.getName());
    }
}

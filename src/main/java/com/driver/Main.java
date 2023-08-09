package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
//        r.name = "Ashish";
//        System.out.println(r.name);
        r.setter("Kulbir");
        System.out.println(r.getter());
//        java: name has private access in com.driver.RWOnly
    }
}

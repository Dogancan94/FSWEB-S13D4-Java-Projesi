package com.workintech.encapsulation;

public class Console {
    public static void main(String[] args) {
        Player dogancan = new Player("Dogancan", -100, Weapon.SWORD);
        Player ali = new Player("Ali", 1000, Weapon.AXE);

        System.out.println(dogancan);
        System.out.println(ali);

        System.out.println("*************************");

        dogancan.restoreHealth(100);
        dogancan.loseHealth(50);
        System.out.println(dogancan.healthRemaining());

        dogancan.loseHealth(60);
        System.out.println(dogancan.healthRemaining());

        dogancan.email = "dk@test.com";


    }
}

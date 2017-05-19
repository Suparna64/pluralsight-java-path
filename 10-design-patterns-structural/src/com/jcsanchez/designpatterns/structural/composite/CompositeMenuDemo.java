package com.jcsanchez.designpatterns.structural.composite;

/**
 * Created by jsssn on 19-May-17.
 */
public class CompositeMenuDemo {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}

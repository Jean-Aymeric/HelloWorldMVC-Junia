package com.jad.helloworldmvc;

import java.util.Scanner;

public class View implements IView {
    @Override
    public void showMessage(final String message) {
        System.out.println("**************************************");
        System.out.println(message);
        System.out.println("**************************************");
    }

    @Override
    public Country askCountry() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose a country: ");
            for (Country country : Country.values()) {
                System.out.println(country.ordinal() + " - " + country.name());
            }
            choice = scanner.nextInt();
        } while (choice < 0 || choice >= Country.values().length);
        return Country.values()[choice];
    }
}

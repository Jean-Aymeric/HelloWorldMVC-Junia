package com.jad.helloworldmvc;

public class Model implements IModel {
    @Override
    public String getHelloWorld() {
        return "Hello world!";
    }

    public String getHelloWorldByCountry(Country country) {
        return switch (country) {
            case UNITED_KINGDOM -> "Hello world!";
            case FRANCE -> "Bonjour le monde !";
            case SPAIN -> "¡Hola mundo !";
            case GERMANY -> "Gutentag das Welt !";
            case INDONESIA -> "Salamat pagi dunia !";
        };
    }
}

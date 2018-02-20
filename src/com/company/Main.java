package com.company;

public class Main {

    public static void main(String[] args) {
        Adress rew = new Adress();
        rew.setIndex(" 65532");
        rew.setCountry(" Ukraine");
        rew.setCity(" Odessa");
        rew.setStreet(" Tolstogo");
        rew.setHouse(12);
        rew.setApart(56);
        System.out.println( " Index:" + rew.getIndex());
        System.out.println(" Country:" + rew.getCountry());
        System.out.println(" City:" + rew.getCity());
        System.out.println( " Street:" + rew.getStreet());
        System.out.println(" House: " + rew.getHouse());
        System.out.println( " Apartem: " + rew.getApart());

    }
}

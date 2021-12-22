package ru.praktikum.yandex;

public class Praktikum {

    public static void main(String[] args) {

       String cardholdersName = "Ramamba Haramamburu";
       Account cardCredentials = new Account(cardholdersName);
       cardCredentials.checkNameToEmboss();

    }
}

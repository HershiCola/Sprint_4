package ru.praktikum.yandex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String cardholdersName;

    private static final String CARDHOLDERS_NAME_PATTERN = "(?=.{3,19}$)[а-яА-Яa-zA-Z]+\\s{1}[а-яА-Яa-zA-Z]+";
    private static final Pattern pattern = Pattern.compile(CARDHOLDERS_NAME_PATTERN);

    public Account(String name) {
        cardholdersName = name;
    }

    public boolean checkNameToEmboss() {
        Matcher matcher = pattern.matcher(cardholdersName);
        return matcher.matches();
    }
}



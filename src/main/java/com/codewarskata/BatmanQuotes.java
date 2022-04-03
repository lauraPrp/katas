package com.codewarskata;

public class BatmanQuotes {

    public static String getQuote(String[] quotes, String hero) {
        int quoteindex = getIndex(hero);
        String returnString = getName(hero) + quotes[quoteindex];
        return returnString;
    }

    public static int getIndex(String hero) {
        char[] heroCharName = hero.toCharArray();
        for (char c : heroCharName) {
            if (Character.isDigit(c)) {
                return Integer.parseInt(String.valueOf(c));
            }
        }
        return 9;
    }

    public static String getName(String hero) {
        String heroName = "";
        if (hero.length() == 6)
            heroName = "Batman: ";
        else if (hero.length() == 5) {
            //it might be Robin or Joker
            if (hero.startsWith("R")) {
                heroName = "Robin: ";
            } else if (hero.startsWith("J")) {
                heroName = "Joker: ";
            }

        } else {
            return "hero doesnt exists!";
        }

        return heroName;
    }
}

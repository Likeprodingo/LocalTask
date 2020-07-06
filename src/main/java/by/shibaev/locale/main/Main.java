package by.shibaev.locale.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws IOException {
        String language = "";
        String country = "";
        String input = "";

        System.out.println("enter: 1 - eng/ 2 - rus");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if ("1".equals(input)) {
            language = "EN";
            country = "US";
        }
        Locale locale = new Locale(language, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("text", locale);
        String s1 = resourceBundle.getString("str1");
        System.out.println(s1);
        String s2 = resourceBundle.getString("str2");
        System.out.println(s2);
    }
}

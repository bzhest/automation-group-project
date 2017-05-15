package com.company.infrastructure.utils.urlBuilder;

import java.util.Random;

import static com.company.infrastructure.utils.urlBuilder.Utils.Mode.NUMER;

/**
 * Created by Andrey on 14.05.2017.
 */
public class Utils {
    public static void main(String[] args) {
        System.out.println(randomString(NUMER,20));
    }
    public enum Mode {
        ALPHA,
        NUMER,
        ALPHANUMERIC
    }


    public static String randomString(Mode mode, int number) {

        char arr[] = new char[number];
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String n = "1234567890";
        String an = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rand = new Random();

        switch(mode){
            case ALPHA:
                for (int x = 0; x < number; x++) {
                    arr[x] = s.charAt(rand.nextInt(s.length()));
                }
                break;
            case NUMER:
                for (int x = 0; x < number; x++) {
                    arr[x] = n.charAt(rand.nextInt(n.length()));
                }
                break;
            case ALPHANUMERIC:
                for (int x = 0; x < number; x++) {
                    arr[x] = an.charAt(rand.nextInt(an.length()));
                }
                break;
        }
        return String.valueOf(arr);

    }
}


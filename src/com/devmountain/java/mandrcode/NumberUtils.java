package com.devmountain.java.mandrcode;

import java.util.Random;

public class NumberUtils {
    public static int generateRandomNumberBetween(int low, int high){
        return new Random().nextInt(high-low) + low;
    }
}

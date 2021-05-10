package com.homework.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

    public class CharGenerator {
        Map <String, String> pairKeyValue = new HashMap<>();
        final int MAX_CHAR_CODE = 126;
        final int MIN_CHAR_CODE = 33;
        Random randString = new Random();
        StringBuilder randKey = new StringBuilder("");
        StringBuilder randValue = new StringBuilder("");
        int k = 0;
        int m = 0;
        int keyHolder = 0;
        int valueHolder = 0;
        String key;
        String value;
        int asciiRange = ((MAX_CHAR_CODE - MIN_CHAR_CODE) + 1) + MIN_CHAR_CODE;
    
        public void generateChar(){
            while (k < 3 && m < 3) {
                keyHolder = randString.nextInt(asciiRange);
                valueHolder = randString.nextInt(asciiRange);
                randKey.append((char)(keyHolder));
                k++;
                randValue.append((char)(valueHolder));
                m++;
            }
            key = randKey.toString();
            value = randValue.toString();
            pairKeyValue.put(key, value);
    
    //        for (Map.Entry<String, String> e : pairKeyValue.entrySet()) {
    //            System.out.print(e.getKey() + "," + e.getValue()+"\t\t");
    //        }
        }
    }

package com.mycompany.app;

import java.util.ArrayList;

public class App 
{

    public static String StringManipulation(String string1, ArrayList<Integer> list1, String string2, ArrayList<Integer> list2 ) {
        
        for(int i = 0; i < list1.size(); i++) {
            if((int)string1.charAt(list1.get(i)) >= 65 && (int)string1.charAt(list1.get(i)) <= 90) {
                string1 = string1.substring(0, list1.get(i)) + (char)(string1.charAt(list1.get(i)) + 32) + string1.substring(list1.get(i) + 1);
            }
            else if((int)string1.charAt(list1.get(i)) >= 97 && (int)string1.charAt(list1.get(i)) <= 122) {
                string1 = string1.substring(0, list1.get(i)) + (char)(string1.charAt(list1.get(i)) - 32) + string1.substring(list1.get(i) + 1);
            }
        }

        for(int i = 0; i < list2.size(); i++) {
            if((int)string2.charAt(list2.get(i)) >= 65 && (int)string2.charAt(list2.get(i)) <= 90) {
                string2 = string2.substring(0, list2.get(i)) + (char)(string2.charAt(list2.get(i)) + 32) + string2.substring(list2.get(i) + 1);
            }
            else if((int)string2.charAt(list2.get(i)) >= 97 && (int)string2.charAt(list2.get(i)) <= 122) {
                string2 = string2.substring(0, list2.get(i)) + (char)(string2.charAt(list2.get(i)) - 32) + string2.substring(list2.get(i) + 1);
            }
        }
        
        return string1 + "\n" + string2;

    }


    
}

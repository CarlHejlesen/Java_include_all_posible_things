package medium_functionalities;

import java.util.Arrays;

public class return_methods {
    public void void_method(int number) {
        if (number == 2) {
            System.out.println("Hello world!");
        }
    }

    public String how_to_return_a_string(boolean bool) {
        if (bool == false) {
            String myString = "string indehold!";
            return myString;
        }
        return "textstring";
    }

    public int how_to_return_a_int(int number) {
        int double_of_number = number + number;
        return double_of_number;
    }

    public int[] how_to_return_a_array() {
        int[] myIntArray = { 1, 2, 3 };
        return myIntArray;
    }

    public String[] how_to_return_a_string_array() {
        String[] myStringArray = { "Yes", "This", "how", "you", "do", "it!" };
        return myStringArray;
    }

    public boolean how_to_return_a_bool() {
        boolean mybool = false;
        return mybool;
    }
}

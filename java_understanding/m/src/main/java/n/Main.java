package n;


import java.util.Arrays;

import package_1.class_1;

public class Main {
    public static void main(String[] args) {// Her eksikvere vi vores kode fra. ALtså her starter vores kode.
        // System.out.println("Hello world!");

        class_1 class_1 = new class_1();
        class_1.void_method();

        String how_to_recive_string = class_1.how_to_return_a_string();
        System.out.println(how_to_recive_string);

        int how_to_recive_int = class_1.how_to_return_a_int();
        System.out.println(how_to_recive_int);

        int[] how_to_recive_int_array = class_1.how_to_return_a_array();
        System.out.println(Arrays.toString(how_to_recive_int_array));
        // vi skal sige at den skal lave det om til print før vi printer, ellers printer
        // den kun addresen på array´en
        String[] how_to_recive_string_array = class_1.how_to_return_a_string_array();
        System.out.println(Arrays.toString(how_to_recive_string_array));

    }
}
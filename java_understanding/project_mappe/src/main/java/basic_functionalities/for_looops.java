package basic_functionalities;

public class for_looops {
    public void forloops() {

        int count = 0;
        while (count < 5) {
            System.out.println("Nummer: " + count);
            count++;
        }

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // basicly javas for each loop
        int[] numbers2 = { 1, 2, 3, 4, 5 };
        for (int num : numbers2) {
            System.out.println(num);
        }
    }
    
}

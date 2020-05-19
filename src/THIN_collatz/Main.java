package THIN_collatz;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 100; i <= 1000000; i++) {
            int value = i;
            numbers.add(value);
            int counter = 0;
            while (counter < 12) {
                value = calc(value);
                numbers.add(value);
                counter++;
            }
            if(value == 1) {
                System.out.println(numbers);
            }
            numbers.clear();
        }
    }
    private static int calc(int value) {
        if(value % 2 == 0) {
            return value/2;
        }else {
            return value * 3 + 1;
        }
    }
}

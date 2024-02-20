package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Test_001_Lambda {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int result1 = 0;

        /**
         * 기존 명령형
         */
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int number : list) {
            if (number % 2 == 0) {
                result1 += number;
            }
        }

        System.out.println(result1);


        /**
         * 선언형
         */
        int result2 = list.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(filterNumber -> filterNumber.intValue())
                .sum();

        System.out.println(result2);



    }
}

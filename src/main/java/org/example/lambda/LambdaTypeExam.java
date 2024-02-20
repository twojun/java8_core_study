package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTypeExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("TypeScript");
        list.add("Python");

        list.stream().
                forEach(System.out::println);  // lambda expression
    }
}

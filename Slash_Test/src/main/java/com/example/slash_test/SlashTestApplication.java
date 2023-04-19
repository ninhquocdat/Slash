package com.example.slash_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class SlashTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlashTestApplication.class, args);
        Integer input = 348597;
        List<Integer> out = revert(input);
        System.out.print(out);
    }

    static List revert (int input) {
        String temp = Integer.toString(input);
        int[] intArr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            intArr[i] = temp.charAt(i) - '0';
        }
        IntStream integerStream = Arrays.stream(intArr);
        LinkedList stack = new LinkedList<>();
        integerStream.forEach(stack::push);
        return stack;
    }

}

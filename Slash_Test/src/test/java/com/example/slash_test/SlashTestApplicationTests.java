package com.example.slash_test;


import org.junit.Assert;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static com.example.slash_test.SlashTestApplication.revert;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class SlashTestApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void test1 (){
        int input = 348597;
        Integer [] inputArr = {7, 9, 5, 8, 4, 3};
        List<Integer> list = Arrays.asList(inputArr);
        Assert.assertEquals(list, revert(input));
    }

}

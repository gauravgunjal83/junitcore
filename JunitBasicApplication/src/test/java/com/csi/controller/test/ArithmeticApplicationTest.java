package com.csi.controller.test;

import com.csi.controller.ArithmeticApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArithmeticApplicationTest {

    @Autowired
    ArithmeticApplication arithmeticApplication;

    @Test
    public void additionTest(){

        Assert.assertEquals(9 , arithmeticApplication.addtion(4,5));

    }

    @Test
    public void substractionTest(){
        Assert.assertEquals(10,arithmeticApplication.substraction(50,40));
    }

    @Test
    public void multiplicationTest(){
        Assert.assertEquals(200,arithmeticApplication.multiplication(50,4));
    }

    @Test
    public void divisionTest(){
        Assert.assertEquals(2,arithmeticApplication.division(50,25));
    }
}

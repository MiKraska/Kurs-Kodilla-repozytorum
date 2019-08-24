package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] intList = {2,15,15,145,654,73,254,3245,26,6,25,6,15,161,67,57,62,16,36,234};

        double average = 0;
        for (int value : intList) {
            average += value;
        }
        average /= intList.length;
        double average2 = ArrayOperations.getAverage(intList);

        Assert.assertEquals(average,average2,0);
    }
}
package com.nanofaroque.arraylib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayLibTest {
    @Test
    public void isAscendingTest(){
        Assertions.assertEquals(true,ArrayLib.isAscendingOrder(new int[]{1,2,3,4}));
        Assertions.assertEquals(false,ArrayLib.isDescendingOrder(new int[]{1,2,3,4}));
    }

    @Test
    public void isDescendingTest(){
        Assertions.assertEquals(true,ArrayLib.isDescendingOrder(new int[]{4,3,2,0}));
        Assertions.assertEquals(false,ArrayLib.isAscendingOrder(new int[]{4,3,2,0}));
    }

    @Test
    public void isSortedTest(){
        Assertions.assertEquals(true,ArrayLib.isSorted(new int[]{1,2,3,4}));
        Assertions.assertEquals(false,ArrayLib.isSorted(new int[]{4,3,82,0}));
    }

}

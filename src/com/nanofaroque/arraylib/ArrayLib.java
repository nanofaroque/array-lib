package com.nanofaroque.arraylib;

public class ArrayLib {
    public static boolean isSorted(int[] array) {
        if (array.length <= 1)
            return true;

        return isAscendingOrder(array) || isDescendingOrder(array);
    }

    /**
     * Helper function to check an array is ascending ordered or not
     *
     * @param array An integer array.
     * @return boolean
     */
    public static boolean isAscendingOrder(int[] array) {
        if (array.length <= 1)
            return true;
        int checker = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= checker)
                checker = array[i];
            else
                return false;
        }
        return true;
    }

    /**
     * Helper function to check an array is descending ordered or not
     *
     * @param array An integer array.
     * @return boolean
     */
    public static boolean isDescendingOrder(int[] array) {
        if (array.length <= 1)
            return true;
        int checker = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= checker)
                checker = array[i];
            else
                return false;
        }
        return true;
    }
}

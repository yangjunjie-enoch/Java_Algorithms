package com.enoch;

import com.thealgorithms.sorts.BubbleSort;
import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] arrays = {3, 1, 2, 5, 6, 0, 4};
        System.out.printf("原始数组为："+Arrays.toString(arrays));
        BubbleSort a = new BubbleSort();
        a.sort(arrays);
        System.out.printf("排序后数组为："+Arrays.toString(arrays));
    }
}

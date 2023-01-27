package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class HW5 {
    // Дан массив строк, необходимо удалить из него все дубли,
    // оставшиеся строки объединить в одну в порядке следования в массиве.
    public static void main(String[] args) {
        String[] arr = {"aaa", "bb", "ccc", "aaa", "bb"};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr = ArrayUtils.remove(arr, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

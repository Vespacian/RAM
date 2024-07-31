// recursive quiz question for students on practice quiz 3 -> fractals!!!
// my own creation >:D

import java.util.*;

public class CantorSet {
    public static void main(String[] args) {
        List<int[]> sets = new ArrayList<>();
        // sets.add(null); // IAE
        // sets.add(new int[] {}); // IAE
        sets.add(new int[] {0, 0, 0}); // false
        sets.add(new int[] {1, 0, 1}); // true
        sets.add(new int[] {1, 0, 1, 0, 0, 0, 1, 0, 1}); // true
        sets.add(new int[] {1, 1, 1, 1, 1, 0, 1, 0, 1}); // false (0, 0, 1)
        sets.add(new int[] {
            1, 0, 1, 0, 0, 0, 1, 0, 1, 
            1, 0, 1, 0, 0, 0, 1, 0, 1, 
            1, 0, 1, 0, 0, 0, 1, 0, 1
        }); // false
        sets.add(new int[] {
            1, 0, 1, 0, 0, 0, 1, 0, 1, 
            0, 0, 0, 0, 0, 0, 0, 0, 0, 
            1, 0, 1, 0, 0, 0, 1, 0, 1
        }); // true

        for (int[] set : sets) {
            System.out.println(Arrays.toString(set) + ": " + isCantorSet(set));
        }
    }

    public static boolean isCantorSet(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can't be null or empty!");
        }
        return isCantorSet(arr, 0, arr.length);
    }

    private static boolean isCantorSet(int[] arr, int start, int length) {
        // (base case) checking the left and right of [1 0 1] since 
        // the left and right are checked recursively
        if (length == 1) {
            return arr[start] == 1;
        }
        // subdivide into three segments
        int divider = length/3;

        // check left and right thirds recursively
        // returns false if not cantor
        if (!isCantorSet(arr, start, divider) || !isCantorSet(arr, start + 2 * divider, divider)) {
            return false;
        }
        
        // check middle third to ensure all are 0
        for (int i = start + divider; i < start + 2 * divider; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }


}

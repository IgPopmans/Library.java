package Lesson09;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] scores = {30, 40, 50, 70, 85, 90, 100, 120, 130, 200, 260, 300, 460, 780};

        int searchValue = 120;
        int position = binarySearch(scores, searchValue);
        System.out.println(searchValue + " position:" + position);

        System.out.println("-----------------------------");

        searchValue = 125;
        position = binarySearch(scores, searchValue);
        System.out.println(searchValue + " position:" + position);
    }

    public static int binarySearch(int[] arrays, int searchValue) {
        if (searchValue < arrays[0] || searchValue > arrays[arrays.length - 1])
            return -1;
        System.out.println("search begin");
        int low = 0;
        int high = arrays.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arrays[mid] == searchValue) {
                return mid;
            } else if (arrays[mid] < searchValue) {
                low = mid + 1;
            } else if (arrays[mid] > searchValue) {
                high = mid - 1;
            }
        }
        return -1;
    }
}








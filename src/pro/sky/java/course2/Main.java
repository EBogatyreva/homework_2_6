package pro.sky.java.course2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Задание 1,2
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        MyListService.printOddNumbers(nums);
        MyListService.printOvenNumbers(nums1);

        //задание 3,4
        List<String> poem = new ArrayList<>(Arrays.asList(
                "cherry", "blossom",
                "different", "copy",
                "blossom", "cherry", "copy"));

        MyListService.findUnique(poem);
        MyListService.findNotUnique(poem);
    }
}
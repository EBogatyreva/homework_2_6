package pro.sky.java.course2;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyListService {

    public static void printOddNumbers(List<Integer> list) {
        for (Integer integer : list) {
            Integer a = integer;
            if (a % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println(" ");
    }

    public static void printOvenNumbers(List<Integer> list) {
        for (Integer integer : list) {
            Integer a = integer;
            if (a % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println(" ");
    }

    public static void findNotUnique(List<String> list) {
        int count = 0;
        Set<String> uniqueStrings = new HashSet<>(list);

        if ((list.size() - uniqueStrings.size()) > 0) {
            count = (list.size() - uniqueStrings.size());
            System.out.println("Число повторяющихся записей - " + count);
        } else System.out.println("Все значения уникальны");
    }

    public static void findUnique(List<String> list) {
        Set<String> uniqueStrings1 = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) > 1) {
                uniqueStrings1.add(list.get(i));
            }
        }
        System.out.println(uniqueStrings1);
    }
}

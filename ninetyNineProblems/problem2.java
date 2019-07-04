package ninetyNineProblems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @auther zengbo on 2019/7/4
 */
public class problem2 {


    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 11, 4, 5, 8, 10, 6);

        LinkedList<Integer> numbers2 = CollectionUtils.linkedList(1, 2, 11, 4, 5, 8, 10, 6);

        System.out.println(seconDlast(numbers1));

    }

    private static <T> T seconDlast (List<T> list) {

        if (list == null || list.size() <= 1) {
            throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements");
        }

        int length = list.size();
        return list.get(length - 2);
    }

    //递归
    private static <T> T secondLastRecursion (LinkedList<T> linkedList) {

        if (linkedList == null || linkedList.size() <= 1) {
            throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements");
        }

        if (linkedList.size() == 2) {
            return linkedList.getFirst();
        }

        return secondLastRecursion((LinkedList<T>) linkedList.subList(1, linkedList.size()));
    }

}

package ninetyNineProblems;

import java.util.*;

/**
 * @auther zengbo on 2019/6/26
 * 操作list，list继承自Collection，有序可重复，set无序不可重复
 */
public class problem1 {

    //demo tail gives you everything except the first element
    public static <T> List<T> tail(LinkedList<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 1) {
            return Collections.emptyList();
        }
        return elements.subList(1, elements.size());
    }

    public static void main(String[] args) {

        List l1 = Arrays.asList("a", "b", "c", "d");
        LinkedList<String> l2 = new LinkedList();
        l2.add("a");
        l2.add("b");
        l2.add("c");
        l2.add("d");

        System.out.println(last1(l1));
        System.out.println(last2(l2));
    }

    private static <T> T last1 (List<T> list) {

        if (list == null || list.isEmpty()) {
            throw new NoSuchElementException();
        }

        int length = list.size();
        return list.get(length - 1);
    }

    private static <T> T last2 (LinkedList<T> linkedList) {

        if (linkedList == null || linkedList.isEmpty()) {
            throw new NoSuchElementException();
        }

        return linkedList.getLast();
    }
}

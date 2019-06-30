package ninetyNineProblems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

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
}

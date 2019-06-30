package ninetyNineProblems;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther zengbo on 2019/6/27
 * 进行list的学习
 */
public class tsetList {

    public static void main(String[] args) {
        List list = new LinkedList();
        int defaultsize = list.size();
        System.out.println(defaultsize); //0

        list.add("s1");
        list.add("s1");
        System.out.println(list.size()); //2

        list.add(null);
        System.out.println(list.size()); //2

    }

}

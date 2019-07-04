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

        System.out.println(list); //[s1,s1,null]
        System.out.println(list.toString()); //[s1,s1,null]

        //subList(int fromIndex, int toIndex)
        //返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。

        System.out.println(list.subList(1,3)); //[s1,s1,null]
    }

}

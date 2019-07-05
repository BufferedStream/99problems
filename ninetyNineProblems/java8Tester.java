package ninetyNineProblems;

import java.util.*;

/**
 * @auther zengbo on 2019/7/5
 * 测试java8的新语法
 */
public class java8Tester {

    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("Goolgle", "Tencent", "Baidu", "Alibaba", "Microsoft");
        List<String> names2 = Arrays.asList("Goolgle", "Tencent", "Baidu", "Alibaba", "Microsoft");

        LinkedList l = CollectionUtils.linkedList("a", "b", "c", "d");

        System.out.println(names1 instanceof List); //true
        System.out.println(names1 instanceof ArrayList); //false
        System.out.println(l instanceof List); //true
        System.out.println(l instanceof LinkedList); //true
        System.out.println(names1.getClass()); //class java.util.Arrays$ArrayList $内部类，不能add remove
        System.out.println(names1.getClass().toString()); //class java.util.Arrays$ArrayList
        System.out.println(names1.getClass().getName()); //java.util.Arrays$ArrayList

        sortUsingJava7(names1);
        sortUsingJava8(names2);

        System.out.println(names1); //class java.util.Arrays$ArrayList
        System.out.println(names2); //java.util.Arrays$ArrayList
    }

    // 使用 java 7 排序
    private static void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            //-1,0,1 s1<=>s2
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    // 使用 java 8 排序
    private static void sortUsingJava8(List<String> names){
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}

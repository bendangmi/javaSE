package FunctionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 本当迷
 * @Description 根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
 * @date 2022/7/3-23:35
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("帅帅的本当迷", "大聪明本当迷", "大聪明", "小鼠学JAVA");
        final List<String> list1 = filterList(list, "本当迷",  s -> s.contains(s));
        System.out.println(list1);
    }

    public static List<String> filterList(List<String> list, String s, Predicate<String> predicate){
        final ArrayList<String> arrayList = new ArrayList<>();

        for (String s1 :
             list) {
            if(s1.contains(s)){
                arrayList.add(s1);
            }

        }
        return arrayList;
    }
}

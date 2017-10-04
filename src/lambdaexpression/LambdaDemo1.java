package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("list:"+list);
        System.out.println("using lambda expression 1:");
        list.forEach(i-> System.out.println(i));
        System.out.println("using lambda expression 2:");
        list.forEach(System.out::println);
    }
}

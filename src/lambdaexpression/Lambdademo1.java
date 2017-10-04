package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Lambdademo1 {

    String[] p={"dhoni","virat","yuvraj","raina","rohit"};
    List<String> list1= Arrays.asList(p);

    void getdatawithoutlambda(){
        System.out.println("list without lambda :");
        for (String player :list1) {
            System.out.println(list1);
        }
        System.out.println(" ");
    }

    void getdatawithlambda1() {
        System.out.println("list with lambda : ");
        list1.forEach((player1) -> System.out.println(player1));
       // list1.forEach(System.out::println);
    }


    public static void main(String[] args) {
        Lambdademo1 ld1=new Lambdademo1();
        ld1.getdatawithoutlambda();
        ld1.getdatawithlambda1();
    }
}

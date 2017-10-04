import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachdemo1 {

    void mapmethod(){
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"sonal");
        map1.put(2,"ruapli");
        map1.put(3,"amruta");
        System.out.println("foreach method(without lambda):");
        for (Map.Entry<Integer,String> entry:map1.entrySet()){
            System.out.println("id : "+entry.getKey()+ "  name : "+entry.getValue());
        }

        System.out.println("");
        System.out.println("forEach and lambda expression : ");
        map1.forEach((K,V)-> System.out.println("id : "+K+"  name: "+V));
    }

    void listmethod(){
        List<String> list1= new ArrayList<>();
        list1.add("sonal");
        list1.add("pooja");
        list1.add("amruta");
        list1.add("diksha");

        System.out.println("list1 is : "+list1);
        System.out.println("");

        System.out.println("lambda expression 1 :");
        list1.forEach((i-> System.out.println(i)));
        System.out.println("");

        System.out.println("method reference :");
        list1.forEach(System.out::println);
        System.out.println("");

        System.out.println("check condition in lambda expresions : ");
        list1.forEach(i->{
            if ("sonal".equals(i)){
                System.out.println(i);
            }
        });
    }



    public static void main(String[] args) {
    ForEachdemo1 fd1=new ForEachdemo1();
    //fd1.mapmethod();
    fd1.listmethod();

    }
}

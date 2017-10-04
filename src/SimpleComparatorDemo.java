import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleComparatorDemo {
    public static void main(String[] args) {
        List<Student> list1=new ArrayList<Student>();

        Student s1=new Student();
        s1.setId(1);
        s1.setName("pooja");   int age;
        String name;

        s1.setAge(21);
        s1.setCity("delhi");

        Student s2=new Student();
        s2.setId(2);
        s2.setName("raj");
        s2.setAge(23);
        s2.setCity("mumbai");

        Student s3=new Student();
        s3.setId(3);
        s3.setName("sonal");
        s3.setAge(20);
        s3.setCity("pune");

        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        System.out.println("list is :");
        System.out.println(list1);
        System.out.println("");

        System.out.println("sorting by age :");
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("After Sort : ");
        System.out.println(list1);
        System.out.println("");


        System.out.println("sorting by name : ");
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list1);
        System.out.println("");

        System.out.println("sorting by city : ");
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        });
        System.out.println(list1);
    }
}

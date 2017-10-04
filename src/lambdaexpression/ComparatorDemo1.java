package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo1 {
    List<Student> getlist(){
        List<Student> list1 = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("sonal");
        s1.setAge(21);
        s1.setCity("pune");

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("pooja");
        s2.setAge(22);
        s2.setCity("mumbai");

        Student s3=new Student();
        s3.setId(3);
        s3.setName("rashmi");
        s3.setAge(20);
        s3.setCity("delhi");

        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        return list1;

    }

    void getdatawithoutlambda(){
        List<Student> liststudent = getlist();

        System.out.println("Before sort(age) without lambda: ");
        for (Student student : liststudent) {
            System.out.println(student);
        }

        //sort by age
        Collections.sort(liststudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();

            }
        });

        System.out.println("After sort(age)  without lambda :");
        for (Student student : liststudent) {
            System.out.println(student);
        }
        System.out.println("");
    }

    void getdatausinglambda(){
        List<Student> studentList=getlist();

        System.out.println("before sort(age) : ");
        for (Student student : studentList) {
            System.out.println(student);
        }
        //sort using lambda
        studentList.sort((Student o1, Student o2)->o1.getAge()-o2.getAge());

        System.out.println("after sort(age) : ");
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("");
    }

    void getdatausinglambda1(){
        List<Student> studentList=getlist();

        System.out.println("before sort(city) : ");
        for (Student student : studentList) {
            System.out.println(student);
        }
        //sort using lambda
       studentList.sort((o11,o22)->o11.getCity().compareTo(o22.getCity()));

        System.out.println("after sort(city) : ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    void getdatausinglambda2(){
        List<Student> studentList=getlist();

        System.out.println("before sort(name) : ");
        studentList.forEach((stud)-> System.out.println(stud));

        studentList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));

        System.out.println("after sort(name) : ");
        studentList.forEach((stud)-> System.out.println(stud));

    }


    public static void main(String[] args) {
        ComparatorDemo1 cd1=new ComparatorDemo1();
//            cd1.getdatawithoutlambda();
//            cd1.getdatausinglambda();
//            cd1.getdatausinglambda1();
            cd1.getdatausinglambda2();


    }
}


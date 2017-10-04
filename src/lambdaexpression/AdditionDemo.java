package lambdaexpression;

/**
 * Created by sonal on 15/9/17.
 */
interface addition{
    int add(int a,int b);
   // int addd(int a1,int b1,int c1);
}
interface msg{
    void writestring(String str);
        }

public class AdditionDemo {
    public static void main(String[] args) {

        addition a1=(a,b)->(a+b);//without type declaration
        System.out.println("lambdaexpression.addition is:"+a1.add(10,10));

        addition a2=(int a,int b)->(a-b);//with type declaration
        System.out.println("subtraction is:"+a2.add(20,10));

        addition a3=(int a,int b)->{return a*b;};//with return statement along with curly braces
        System.out.println("multiplication is:"+a3.add(10,10));

//        lambdaexpression.addition a4=(a1,b1,c1)->(a1+b1+c1);
//        System.out.println(a4.addd(10,10,10));

        msg m1=str-> System.out.println("hello " +str);//without parenthesis
        m1.writestring("java");

        msg m2=(str)-> System.out.println("hello "+str);//with parenthesis
        m2.writestring("codekul");

        msg m3=(str -> System.out.println("good "+str));
        m3.writestring("morning");

        msg m4=str->{System.out.println("good " +str);};
        m4.writestring("night");
    }
}

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo1 {

    //get todays date
    void getlocaldate(){
        LocalDate today=LocalDate.now();
        System.out.println("today's date : "+today);
    }
    //get current date,month,year
    void getdate(){
        LocalDate today=LocalDate.now();
        int year=today.getYear();
        int month=today.getMonthValue();
        int day=today.getDayOfMonth();
        System.out.println("today's date is:"+today+ "  year:"+year+ " month:"+month+ " day:"+day);
    }
    //get particular date
    void getparticulardate(){
        LocalDate dateofbirth=LocalDate.of(2015,8,11);
        System.out.println("birthdate is:"+dateofbirth);
    }
    //check two date equals or not
    void checkdate(){
        LocalDate date1=LocalDate.of(2016,8,9);
        LocalDate date2=LocalDate.of(2016,8,9);
        System.out.println("date1 is:"+date1);
        System.out.println("date2 is:"+date2);
        if(date1.equals(date2)){
            System.out.println("date1  date2  are same..");
        }else {
            System.out.println("date1 and date 2 are not same...");
        }
    }
    //get current time
    void gettime(){
        LocalTime time=LocalTime.now();
        System.out.println("current time is:"+time);
    }

    void getnextdate(){

    }

    public static void main(String[] args) {
        DateDemo1 d1=new DateDemo1();
        d1.getlocaldate();
        d1.getdate();
        d1.getparticulardate();
        d1.checkdate();
        d1.gettime();
    }
}

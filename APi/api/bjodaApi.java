import java.time.*;
public class bjodaApi {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        int day= d.getDayOfMonth();
        int month=d.getMonthValue();
        int year= d.getYear();
        System.out.println(day+"/"+month);
        LocalTime t= LocalTime.now();
        System.out.println(t);
        int hour =t.getMinute();
        int  sec=t.getSecond();
        System.out.println(hour+"/"+sec);

    }
}

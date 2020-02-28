import ir.huri.jcal.JalaliCalendar;
/**
 * this class show today date
 * @auther Erfan
 *
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JalaliCalendar j = new JalaliCalendar();
        System.out.println(j.getYear() +"/" + j.getMonth() + "/" + j.getDay());

    }

}

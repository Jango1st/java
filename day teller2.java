import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "please enter youre date of birth in AC in yyyy-mm-dd format:");

        // تبدیل رشته ورودی به یک شیء از کلاس LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate date = LocalDate.parse(input, formatter);

        // محاسبه روز تاریخ میلادی
        int dayOfYear = date.getDayOfYear();

        JOptionPane.showMessageDialog(null, "youre conseared date is " + dayOfYear + "of the year");
    }
}/
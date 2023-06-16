import java.util.Calendar;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    
        Scanner scanner=new Scanner(System.in);
        System.out.println("concerned year?");
        int year=scanner.nextInt();

        System.out.println("the date is" + year + "in solar calendar:");
        System.out.println("--------------------");

        for (int month = 0; month < 12; month++) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, 1);
            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String monthName = getMonthName(month);

            System.out.println(monthName + ":");

            for (int i = 1; i < firstDayOfWeek; i++) {
                System.out.print("   ");
            }

            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%2d ", day);

                if ((day + firstDayOfWeek - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("--------------------");
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"farvardin","ordibehesht", "khordad", "tir", "mordad", "shahrivar", "mehr","aban", "azzar", "dei", "bahman", "esfand"};
        return monthNames[month];
    }
}

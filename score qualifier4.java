import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String countString = JOptionPane.showInputDialog(null, "please enter the quantity of the scores:");
        int count = Integer.parseInt(countString);

        int excellentCount = 0;
        int passCount = 0;
        int failCount = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            String gradeString = JOptionPane.showInputDialog(null, "please enter the" + (i+1) + "score:");
            int grade = Integer.parseInt(gradeString);

            if (grade >= 90 && grade <= 100) {
                excellentCount++;
            } else if (grade >= 60 && grade <= 89) {
                passCount++;
            } else {
                failCount++;
            }

            sum += grade;

            if (grade < min) {
                min = grade;
            }

            if (grade > max) {
                max = grade;
            }
        }

        double average = (double) sum / count;

        String message = "quantity of good scores: " + excellentCount + "\n" +
                "quantity of scores who pass: " + passCount + "\n" +
                "quantity of scores who fail: " + failCount + "\n" +
                "average of scores: " + average + "\n" +
                "highest score: " + max + "\n" +
                "lowest score: " + min;

        JOptionPane.showMessageDialog(null, message);
    }
}
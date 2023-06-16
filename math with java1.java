import static java.lang.Math.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int m= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter m:"));
        int n= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter n:"));
        Math math;
        double side1=abs(pow(m,2)-pow(n,2));
        double side2=m*n*2;
        double hypotenuse=pow(m,2)+pow(n,2);
        JOptionPane.showMessageDialog(null,"side1:"+side1+"\n"+"side2:"+side2+"\n"+"hypotenuse:"+hypotenuse);
    }
}
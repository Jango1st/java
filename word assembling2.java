import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        
        String[] words = new String[4];
        for (int i = 0; i < 4; i++) {
            words[i] = JOptionPane.showInputDialog(null, "please enter the" + (i+1) + "word");
        }

        
        Arrays.sort(words, Collections.reverseOrder());
        String sortedDescending = "assembling words in descending order: " + String.join(" ", words);
        JOptionPane.showMessageDialog(null, sortedDescending);

        
        Arrays.sort(words);
        String sortedAscending = "assembling words in ascending order: " + String.join(" ", words);
        JOptionPane.showMessageDialog(null, sortedAscending);
    }
}
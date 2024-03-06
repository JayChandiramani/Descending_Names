import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main (String[] args){
        descendingnames();
    }
    public static void descendingnames(){

        String name1 = JOptionPane.showInputDialog("Enter name #1");
        String name2 = JOptionPane.showInputDialog("Enter name #2");
        String name3 = JOptionPane.showInputDialog("Enter name #3");
        String[] arr ={ name1, name2, name3};

        Arrays.sort(arr, Collections.reverseOrder());
        String FinalNames = String.join(", ", arr);

        JOptionPane.showMessageDialog(null, FinalNames,"Final Output",JOptionPane.INFORMATION_MESSAGE);

        //Descending Order Names
        //Write a program that prompts the user to enter three names. Your program should display the names in descending order.

    }
}

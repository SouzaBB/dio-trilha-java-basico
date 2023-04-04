
import java.awt.*;
import javax.swing.*;


class FirstGUI {
    public static void main(String args[]){
        
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        
        JButton pressButton = new JButton("Press");
        pressButton.setPreferredSize(new Dimension(100,100));

        frame.add(pressButton);
        frame.getContentPane().add(pressButton);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
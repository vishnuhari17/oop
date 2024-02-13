import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class window1 implements ActionListener
{
    JFrame jf;
    JLabel jl,jtc,jtk;
    JTextField jt;
    JButton jb;
    window1()
    {
        jf = new JFrame("Temperature conversion");
        jl = new JLabel("Enter the temperature to be converted");
        jt = new JTextField(5);
        jb = new JButton("Convert");
        jtc = new JLabel();
        jtk = new JLabel();
        jb.addActionListener(this);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(new GridLayout(10,1));
        jf.add(jl);
        jf.add(jt);
        jf.add(jb);
        jf.add(jtc);
        jf.add(jtk);
        jtc.setVisible(false);
        jtk.setVisible(false);
    }

    public void actionPerformed(ActionEvent ae)
    {
        float temp = Float.parseFloat(jt.getText());
        float far = temp*((float) 9 /5)+35;
        float kel = temp + 273;
        jtc.setVisible(true);
        jtk.setVisible(true);
        jtc.setText("The temperature in Fahrenheit is : "+far);
        jtk.setText("The temperature in Kelvin is : "+kel);

    }
}


public class temp {
    public static void main(String[] args) {
        new window1();
    }

}

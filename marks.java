import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class qn1 implements ActionListener{
    JFrame jf;
    JCheckBox c1;
    JTextField t1;
    JCheckBox c2;
    JTextField t2;
    JCheckBox c3;
    JTextField t3;
    JCheckBox c4;
    JTextField t4;
    JButton jb;
    JLabel l;
    JLabel out;

    qn1() {
        jf = new JFrame("Marks entering portal");
        jf.setSize(700,800);
        jf.setLayout(null); // Set layout to null
        jf.setVisible(true);

        c1 = new JCheckBox("Maths");
        c2 = new JCheckBox("Physics");
        c3 = new JCheckBox("Chemistry");
        c4 = new JCheckBox("Biology");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        t3 = new JTextField(30);
        t4 = new JTextField(30);
        l = new JLabel("Enter the marks");
        jb = new JButton("Submit");
        out = new JLabel();

        l.setBounds(50, 20, 150, 20);
        c1.setBounds(50, 50, 100, 20);
        t1.setBounds(200, 50, 100, 20);
        c2.setBounds(50, 80, 100, 20);
        t2.setBounds(200, 80, 100, 20);
        c3.setBounds(50, 110, 100, 20);
        t3.setBounds(200, 110, 100, 20);
        c4.setBounds(50, 140, 100, 20);
        t4.setBounds(200, 140, 100, 20);
        jb.setBounds(50, 180, 100, 30);
        out.setBounds(50, 220, 300, 20);

        jf.add(l);
        jf.add(c1);
        jf.add(t1);
        jf.add(c2);
        jf.add(t2);
        jf.add(c3);
        jf.add(t3);
        jf.add(c4);
        jf.add(t4);
        jf.add(jb);
        jf.add(out);

        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        int sum=0;
        int selected=0;
        if(source == c1) {
            t1.setVisible(c1.isSelected());
        }
        if(source == c2) {
            t2.setVisible(c2.isSelected());
        }
        if(source == c3) {
            t3.setVisible(c3.isSelected());
        }
        if(source == c4) {
            t4.setVisible(c4.isSelected());
        }
        if(source ==jb) {
            if(c1.isSelected()) {
                sum += Integer.parseInt(t1.getText());
                selected += 1;
            }
            if(c2.isSelected()) {
                sum += Integer.parseInt(t2.getText());
                selected += 1;
            }
            if(c3.isSelected()) {
                sum += Integer.parseInt(t3.getText());
                selected += 1;
            }
            if(c4.isSelected()) {
                sum += Integer.parseInt(t4.getText());
                selected += 1;
            }
            if(sum/selected > 80) {
                out.setText("The student is eligible for admission!!!");
            }
            if(sum/selected < 80) {
                out.setText("The student is not eligible for admission!!!");
            }
        }
    }
}

public class marks {
    public static void main(String[] args) {
        new qn();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.*;

class window implements ActionListener {
    JFrame jf;
    JTextField jtf;
    JButton jb;
    JLabel jl;
    window() {
        jf = new JFrame("Write to file");
        jtf = new JTextField("Enter the data to be written",30);
        jl = new JLabel("Please press Submit to write the contents");
        jb = new JButton("Submit");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.add(jl);
        jf.add(jtf);
        jf.add(jb);
        jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String message = jtf.getText();
        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            fout.write(message.getBytes());;
        } catch (Exception e) {}

    }
}







public class gui {
    public static void main(String[] args) {
        new window();
    }
}

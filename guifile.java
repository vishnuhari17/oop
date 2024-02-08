import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class gui1 implements ActionListener
{
    JFrame jf;
    JTextField jtf;
    JLabel jl;
    JButton jb;
    gui1()
    {
        jf=new JFrame("write to a file");
        jtf=new JTextField("enter the data to be written",20);
        jl=new JLabel("press submit to write the contents");
        jb=new JButton("submit");
        FlowLayout f =new FlowLayout();
        jf.setLayout(f);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.add(jtf);
        jf.add(jl);
        jf.add(jb);
        jb.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String msg = jtf.getText();
        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            fout.write(msg.getBytes());
            ;
        } catch (Exception e) {
        }
    }

    }

    class guifile
    {
        public static void main(String a[])
        {
            gui1 g=new gui1();
        }
    }
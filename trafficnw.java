import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class traffic implements ActionListener
{
    JFrame jf;
    JLabel jl;
    JRadioButton jrbred,jrbyellow,jrbgreen;
    ButtonGroup btngroup;
    traffic()
    {
        jf=new JFrame("traffic light");
        jl=new JLabel("SELECT LIGHT");
        jrbred=new JRadioButton("Red");
        jrbyellow=new JRadioButton("Yellow");
        jrbgreen=new JRadioButton("Green");
        FlowLayout f=new FlowLayout();
        jf.setLayout(f);
        jf.setSize(500,500);
        jf.setVisible(true);

        jrbred.setForeground(Color.RED);
        jrbyellow.setForeground(Color.YELLOW);
        jrbgreen.setForeground(Color.GREEN);

        btngroup = new ButtonGroup();

        btngroup.add(jrbred);
        btngroup.add(jrbyellow);
        btngroup.add(jrbgreen);

        jf.add(jrbred);
        jf.add(jrbyellow);
        jf.add(jrbgreen);
        jf.add(jl);

        jrbred.addActionListener(this);
        jrbyellow.addActionListener(this);
        jrbgreen.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String s1=ae.getActionCommand();
        if(s1.equals("Red"))
        {
            jl.setForeground(Color.RED);
            jl.setText("STOP");
        }
        else if(s1.equals("Yellow"))
        {
            jl.setForeground(Color.YELLOW);
            jl.setText("READY");
        }
        else if(s1.equals("Green"))
        {
            jl.setForeground(Color.GREEN);
            jl.setText("GO");
        }
    }
}

class trafficnw
{
    public static void main(String arg[]) {
        new traffic();
    }
}
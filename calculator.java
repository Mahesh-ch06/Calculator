import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame implements ActionListener{
    JTextField display;
    double num1,num2,result;
    char operator;

    public Calculator(){
        JFrame f1=new JFrame();

        display = new JTextField();
        display.setBounds(60,50,200,25);
        f1.add(display);

        JLabel l1=new JLabel("Calculator",JLabel.CENTER);
        l1.setBounds(60,20,200,25);
        f1.add(l1);

       JButton b1=new JButton("%");
       JButton b2=new JButton("E");
       JButton b3=new JButton("C");
        JButton b4=new JButton("<");
        JButton b5=new JButton("1/x");
        JButton b6=new JButton("x²");
        JButton b7= new JButton("√x");
        JButton b8= new JButton("/");
        JButton b9= new JButton("7");
       JButton b0=new JButton("8");
       JButton B1= new JButton("9");
        JButton B2= new JButton("*");
       JButton B3=new JButton("4");
        JButton B4=new JButton("5");
        JButton B5=new JButton("6");
       JButton B6=new JButton("-");
       JButton B7=new JButton("1");
       JButton B8=new JButton("2");
       JButton B9=new JButton("3");
        JButton B0=new JButton("+");
        JButton B11=new JButton("+/-");
        JButton B12=new JButton("0");
        JButton B13=new JButton(".");
        JButton B14=new JButton("=");

        f1.setSize(400,500);
        b1.setBounds(50,100,50,30);
        b2.setBounds(110,100,50,30);
        b3.setBounds(170,100,50,30);
        b4.setBounds(230,100,50,30);
        b5.setBounds(50,150,50,30);
        b6.setBounds(110,150,50,30);
        b7.setBounds(170,150,51,30);
        b8.setBounds(230,150,50,30);
        b9.setBounds(50,200,50,30);
        b0.setBounds(110,200,50,30);
        B1.setBounds(170,200,50,30);
        B2.setBounds(230,200,50,30);
        B3.setBounds(50,250,50,30);
        B4.setBounds(110,250,50,30);
        B5.setBounds(170,250,50,30);
        B6.setBounds(230,250,50,30);
        B7.setBounds(50,300,50,30);
        B8.setBounds(110,300,50,30);
        B9.setBounds(170,300,50,30);
        B0.setBounds(230,300,50,30);
        B11.setBounds(50,350,50,30);
        B12.setBounds(110,350,50,30);
        B13.setBounds(170,350,50,30);
        B14.setBounds(230,350,50,30);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.add(b0);
        f1.add(B1);
        f1.add(B2);
        f1.add(B3);
        f1.add(B4);
        f1.add(B5);
        f1.add(B6);
        f1.add(B7);
        f1.add(B8);
        f1.add(B9);
        f1.add(B0);
        f1.add(B11);
        f1.add(B12);
        f1.add(B13);
        f1.add(B14);



        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B0.addActionListener(this);
        B11.addActionListener(this);
        B12.addActionListener(this);
        B13.addActionListener(this);
        B14.addActionListener(this);

        f1.setLayout(null);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String text = source.getText();

        if (text.equals("CE")) {
            display.setText("");
        } else if (text.equals("x²")) {
            double r = num1*num1;
            display.setText(String.valueOf(r));
        } else if (text.equals("C")) {
            display.setText("");
        } else if (text.equals("<")) {
            display.setText("");
        }
        else if (text.equals("=")) {
            num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case '+':
                        result=num1+num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                    case '*':
                        result=num1*num2;
                        break;
                    case '/':
                            result=num1/num2;
                            break;
                }

                display.setText(String.valueOf(result));

            }
        else if (text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")) {
                num1 = Double.parseDouble(display.getText());
                operator = text.charAt(0);
                display.setText("");
            } else {
                display.setText(display.getText() + text);
            }
        }

    public static void main(String[] args){
        new Calculator();
    }
}

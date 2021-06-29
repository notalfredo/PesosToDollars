import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;



public class Currency {
  

    public static void currency_converter()
    {
 
        // we are creating 3 buttons
        JButton button1, button2, button3;
     

        JFrame frame = new JFrame("Currency_Converter");
        // will create 2 text fiels one for Us dollars and Mexican pesos

        JTextField text1, text2;

        // will create 2 labels 
        JLabel label1, label2;
  

  

        label1 = new JLabel("Pesos : ");
        label1.setBounds(40, 40, 80, 30);
        label2 = new JLabel("Dollars : ");
        label2.setBounds(170, 40, 60, 30);
  
        //text field where we will display values of Pesos and Dollars
        text1 = new JTextField("0");
        text1.setBounds(80, 40, 70, 30);
        text2 = new JTextField("0");
        text2.setBounds(220, 40, 70, 30);
  
 
        button1 = new JButton("Pesos");
        button1.setBounds(50, 75, 100, 15);
        button2 = new JButton("Dollar");
        button2.setBounds(190, 75, 100, 15);

        button3 = new JButton("exit");
        button3.setBounds(150, 150, 60, 30);
  
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // This will convert the text to a double value
                double d
                    = Double.parseDouble(text1.getText());
  
                // Converting pesos to dollars
                double d1 = (d / 20);

                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                text2.setText(str1);
            }
        });
  
        // Adding action listener
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                    = Double.parseDouble(text2.getText());
  
                // converting Dollars to pesos
                double d3 = (d2 * 19.82);
  
                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);
  
                
                text1.setText(str2);
            }
        });
  
        // Closes application
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
            }
        });
  
        // will close application
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding objects
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
  
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        currency_converter();
    }
}
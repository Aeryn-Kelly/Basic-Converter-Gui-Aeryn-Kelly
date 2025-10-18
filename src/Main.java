import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Gui Interface");

        JFrame window = new JFrame("Weevil Weevil Weevil");
        window.setSize(900, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //makes a window

        JPanel FControls = new JPanel();
        JPanel CControls = new JPanel();
        JTextField FField = new JTextField(20);
        JTextField CField = new JTextField(20);
        JLabel FOutput = new JLabel("Enter a number");
        JLabel COutput = new JLabel("Enter a number");

        JLabel label = new JLabel("Celsius to Fahrenheit or vise versa");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        ImageIcon FImage = new ImageIcon("C:\\Users\\aeryn\\IdeaProjects\\Basic-Converter-Gui-Aeryn-Kelly\\src\\img.png");
        ImageIcon CImage = new ImageIcon("C:\\Users\\aeryn\\IdeaProjects\\Basic-Converter-Gui-Aeryn-Kelly\\src\\img_1.png");

        //Creates everything block of code

        // F button F to C

        JButton FButton = new JButton("F to C");
        FButton.addActionListener(e -> {


            System.out.println("Your F to C Conversion is");
            label.setText("");
            label.setIcon(FImage);


            String FInput = FField.getText();
            try {
                double fahrenheit = Double.parseDouble(FInput);
                double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
                System.out.println(fahrenheit + " to " + celsius);
                label.setText("");

            } catch (NumberFormatException j) {
                FOutput.setText("Enter a number");
                JOptionPane.showMessageDialog(window, "Please enter a number");

            }

        //MAKES A BUTTON AND WHEN IT IS PRESSED DOES CONVERSION AND PRINTS THE IMAGE

        });
        FButton.setPreferredSize(new Dimension(100, 20));

        FControls.add(FButton);
        window.add(FControls, BorderLayout.NORTH);

        FControls.add(FField);


        // C button C to F

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        //Prints label in the middle of Gui

        JButton CButton = new JButton("C to F");
        CButton.addActionListener(e -> {

            System.out.println("Your C to F Conversion is");
            label.setText("");
            label.setIcon(CImage);

            String FInput = CField.getText();
            try {
                double celsius = Double.parseDouble(FInput);
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.println(celsius + " to " + fahrenheit);
                label.setText("");

            } catch (NumberFormatException j) {
                COutput.setText("Enter a number");
                JOptionPane.showMessageDialog(window, "Please enter a number");

            }

            //MAKES A BUTTON AND WHEN IT IS PRESSED DOES CONVERSION AND PRINTS THE IMAGE

        });

        CButton.setPreferredSize(new Dimension(100, 20));

        CControls.add(CButton);
        window.add(CControls, BorderLayout.SOUTH);

        CControls.add(CField);

        window.add(label);
        window.setVisible(true);

    }
}

//makes the window visible
// Don't ask about the weevils, I am tired
//Can not enter anything but a number

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Gui Interface");

        JFrame window = new JFrame("I hope you know that this is a window");
        window.setSize(900, 900);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel FControls = new JPanel();
        JPanel CControls = new JPanel();
        JTextField FField;
        JTextField CField;
        JLabel FOutput;
        JLabel COutput;

        JLabel label = new JLabel("This is a label");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        // ImageIcon FImage = new ImageIcon();
        // ImageIcon CImage = new ImageIcon();


        // F button F to C

        JButton FButton = new JButton("F to C");
        FButton.addActionListener(e -> {

            System.out.println("Your F to C Conversion is");
            label.setText("");
            // label.setIcon();
        });
        FButton.setPreferredSize(new Dimension(100, 20));

        FControls.add(FButton);
        window.add(FControls, BorderLayout.NORTH);

        JTextField inputField = new JTextField(20);
        inputField.setText(">");

        inputField.addActionListener();


        // C button C to F

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        // ImageIcon Image = new ImageIcon();

        JButton CButton = new JButton("C to F");
        CButton.addActionListener(e -> {

            System.out.println("Your C to F Conversion is");
            label.setText("");
            // label.setIcon();
        });
        CButton.setPreferredSize(new Dimension(100, 20));

        CControls.add(CButton);
        window.add(CControls, BorderLayout.SOUTH);

        window.add(label);
        window.setVisible(true);


    }
}
import javax.swing.*;
import java.awt.*;

public class LatihanCalculatorUI extends JFrame {
    LatihanCalculatorUI(){
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setResizable(false);
    }
    void calcUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        panel.add(new JLabel("Masukkan Angka Pertama:"));
        JTextField input1 = new JTextField(15);
        panel.add(input1);

        panel.add(new JLabel("Masukkan Angka Kedua:"));
        JTextField input2 = new JTextField(15);
        panel.add(input2);

        panel.add(new JLabel("Masukkan Angka Ketiga:"));
        JTextField input3 = new JTextField(15);
        panel.add(input3);
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(new JButton("+"));
        buttonPanel.add(new JButton("-"));
        buttonPanel.add(new JButton("*"));
        buttonPanel.add(new JButton("/"));
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        LatihanCalculatorUI calc = new LatihanCalculatorUI();
        calc.calcUI();
    }
}

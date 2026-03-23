package Bai4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculatorApp extends JFrame {

    private JTextField display;
    private String firstNumber = "";
    private String operator = "";
    private boolean startNewNumber = true;

    public CalculatorApp() {
        setTitle("Calculator");
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.PLAIN, 28));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "C", "⌫", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "=", "√"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener((ActionEvent e) -> handleButtonClick(text));
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout(5, 5));
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private void handleButtonClick(String text) {
        switch (text) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                if (startNewNumber || display.getText().equals("0")) {
                    display.setText(text);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + text);
                }
                break;

            case ".":
                if (startNewNumber) {
                    display.setText("0.");
                    startNewNumber = false;
                } else if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
                break;

            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                firstNumber = display.getText();
                operator = text;
                startNewNumber = true;
                break;

            case "=":
                calculateResult();
                break;

            case "C":
                display.setText("0");
                firstNumber = "";
                operator = "";
                startNewNumber = true;
                break;

            case "⌫":
                String current = display.getText();
                if (!startNewNumber && current.length() > 1) {
                    display.setText(current.substring(0, current.length() - 1));
                } else {
                    display.setText("0");
                    startNewNumber = true;
                }
                break;

            case "√":
                try {
                    double value = Double.parseDouble(display.getText());
                    if (value < 0) {
                        display.setText("Lỗi");
                    } else {
                        display.setText(String.valueOf(Math.sqrt(value)));
                    }
                    startNewNumber = true;
                } catch (NumberFormatException ex) {
                    display.setText("Lỗi");
                }
                break;
        }
    }

    private void calculateResult() {
        try {
            double num1 = Double.parseDouble(firstNumber);
            double num2 = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        display.setText("Không chia 0");
                        startNewNumber = true;
                        return;
                    }
                    result = num1 / num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                default:
                    return;
            }

            if (result == (long) result) {
                display.setText(String.valueOf((long) result));
            } else {
                display.setText(String.valueOf(result));
            }

            startNewNumber = true;
        } catch (NumberFormatException ex) {
            display.setText("Lỗi");
            startNewNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorApp().setVisible(true);
        });
    }
}

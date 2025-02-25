package java_0225;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("四則運算");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        
        JLabel label1 = new JLabel("數字1:");
        JTextField text1 = new JTextField(10); // 增加列數
        JLabel label2 = new JLabel("數字2:");
        JTextField text2 = new JTextField(10); // 增加列數
        
        String[] operations = {"加 (+)", "減 (-)", "乘 (*)", "除 (/)"};
        JComboBox<String> operationBox = new JComboBox<>(operations);
        
        JButton calculateButton = new JButton("計算");
        JLabel resultLabel = new JLabel("結果: ");
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double i = Double.parseDouble(text1.getText());
                    double j = Double.parseDouble(text2.getText());
                    double result = 0;
                    String selectedOperation = (String) operationBox.getSelectedItem();
                    
                    switch (selectedOperation) {
                        case "加 (+)": result = i + j; break;
                        case "減 (-)": result = i - j; break;
                        case "乘 (*)": result = i * j; break;
                        case "除 (/)": 
                            if (j != 0) {
                                result = i / j;
                            } else {
                                resultLabel.setText("錯誤: 除數不能為零");
                                return;
                            }
                            break;
                    }
                    
                    resultLabel.setText("結果: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("請輸入有效數字");
                }
            }
        });
        
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(operationBox);
        frame.add(calculateButton);
        frame.add(resultLabel);
        
        frame.setVisible(true);
    }
}

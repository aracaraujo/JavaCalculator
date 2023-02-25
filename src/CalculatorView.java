import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculatorView extends JFrame implements ActionListener{

    JButton plusButton;
    JButton minusButton;
    JButton multiplicationButton;
    JButton divisionButton;
    JButton equalButton;
    JButton percentageButton;
    JButton negativePositiveButton;
    JButton cleanButton;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button0;
    JButton buttonPeriod;
    JTextField numberField;
    Font font1 = new Font("SansSerif", Font.BOLD, 40);

    public CalculatorView(){

        // Buttons dimension 70/70
        // Add button.
        this.plusButton = new JButton();
        this.plusButton.setText("+");
        this.plusButton.addActionListener(this);
        this.plusButton.setBounds(210,210,70,70);

        // Minus button.
        this.minusButton = new JButton();
        this.minusButton.setText("-");
        this.minusButton.addActionListener(this);
        this.minusButton.setBounds(210,140,70,70);

        // Multiplication Button.
        this.multiplicationButton = new JButton();
        this.multiplicationButton.setText("*");
        this.multiplicationButton.addActionListener(this);
        this.multiplicationButton.setBounds(210,70,70,70);

        // Division Button.
        this.divisionButton = new JButton();
        this.divisionButton.setText("/");
        this.divisionButton.addActionListener(this);
        this.divisionButton.setBounds(210,0,70,70);

        // Equal Button.
        this.equalButton = new JButton();
        this.equalButton.setText("=");
        this.equalButton.addActionListener(this);
        this.equalButton.setBounds(210,280,70,70);

        // Percentage Button.
        this.percentageButton = new JButton();
        this.percentageButton.setText("%");
        this.percentageButton.addActionListener(this);
        this.percentageButton.setBounds(140,0,70,70);

        // Negative/positive Button.
        this.negativePositiveButton = new JButton();
        this.negativePositiveButton.setText("+/-");
        this.negativePositiveButton.addActionListener(this);
        this.negativePositiveButton.setBounds(70,0,70,70);

        // Clean Button.
        this.cleanButton = new JButton();
        this.cleanButton.setText("AC");
        this.cleanButton.addActionListener(this);
        this.cleanButton.setBounds(0,0,70,70);

        // Button 7.
        this.button7 = new JButton();
        this.button7.setText("7");
        this.button7.addActionListener(this);
        this.button7.setBounds(0,70,70,70);

        // Button 8.
        this.button8 = new JButton();
        this.button8.setText("8");
        this.button8.addActionListener(this);
        this.button8.setBounds(70,70,70,70);

        // Button 9.
        this.button9 = new JButton();
        this.button9.setText("9");
        this.button9.addActionListener(this);
        this.button9.setBounds(140,70,70,70);

        // Button 4.
        this.button4 = new JButton();
        this.button4.setText("4");
        this.button4.addActionListener(this);
        this.button4.setBounds(0,140,70,70);

        // Button 5.
        this.button5 = new JButton();
        this.button5.setText("5");
        this.button5.addActionListener(this);
        this.button5.setBounds(70,140,70,70);

        // Button 6.
        this.button6 = new JButton();
        this.button6.setText("6");
        this.button6.addActionListener(this);
        this.button6.setBounds(140,140,70,70);

        // Button 1.
        this.button1 = new JButton();
        this.button1.setText("1");
        this.button1.addActionListener(this);
        this.button1.setBounds(0,210,70,70);

        // Button 2.
        this.button2 = new JButton();
        this.button2.setText("2");
        this.button2.addActionListener(this);
        this.button2.setBounds(70,210,70,70);

        // Button 3.
        this.button3 = new JButton();
        this.button3.setText("3");
        this.button3.addActionListener(this);
        this.button3.setBounds(140,210,70,70);

        // Button 0.
        this.button0 = new JButton();
        this.button0.setText("0");
        this.button0.addActionListener(this);
        this.button0.setBounds(0,280,140,70);

        // Button Period.
        this.buttonPeriod = new JButton();
        this.buttonPeriod.setText(".");
        this.buttonPeriod.addActionListener(this);
        this.buttonPeriod.setBounds(140,280,70,70);

        // Text field for the number.
        this.numberField = new JTextField();
        this.numberField.setBounds(10,10,260,130);
        this.numberField.setBorder(null);
        this.numberField.setHorizontalAlignment(JTextField.RIGHT);
        this.numberField.setText("0");
        this.numberField.setFont(this.font1);
        this.numberField.setFocusable(false);

        JPanel textPanel = new JPanel();
        textPanel.setBounds(0,0,280,150);
        textPanel.setBackground(Color.white);
        this.setLayout(null);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.lightGray);
        buttonsPanel.setBounds(0,150,280,380);
        this.setLayout(null);

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(280,530);
        this.setVisible(true);
        textPanel.add(numberField);
        buttonsPanel.add(plusButton);
        buttonsPanel.add(minusButton);
        buttonsPanel.add(divisionButton);
        buttonsPanel.add(multiplicationButton);
        buttonsPanel.add(equalButton);
        buttonsPanel.add(percentageButton);
        buttonsPanel.add(negativePositiveButton);
        buttonsPanel.add(cleanButton);
        buttonsPanel.add(button7);
        buttonsPanel.add(button8);
        buttonsPanel.add(button9);
        buttonsPanel.add(button4);
        buttonsPanel.add(button5);
        buttonsPanel.add(button6);
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);
        buttonsPanel.add(button0);
        buttonsPanel.add(buttonPeriod);
        this.add(textPanel);
        this.add(buttonsPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==plusButton){
            System.out.println("Adding button");
        } else if (e.getSource()==minusButton){
            System.out.println("Minus button");
        } else if (e.getSource()==multiplicationButton){
            System.out.println("Multiplication button");
        } else if (e.getSource()==divisionButton){
            System.out.println("Division button");
        } else if (e.getSource()==equalButton){
            System.out.println("Equal button");
        } else if (e.getSource()==percentageButton){
            System.out.println("Percentage button");
        } else if (e.getSource()==negativePositiveButton){
            System.out.println("Negative/positive button");
        } else if(e.getSource()==cleanButton){
            this.numberField.setText("");
        } else if(e.getSource()==button7){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"7");
        } else if(e.getSource()==button8){
                if (Objects.equals(this.numberField.getText(), "0")){
                    this.numberField.setText("");}
                this.numberField.setText(this.numberField.getText()+"8");
        } else if(e.getSource()==button9){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"9");
        } else if(e.getSource()==button4){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"4");
        } else if(e.getSource()==button5){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"5");
        } else if(e.getSource()==button6){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"6");
        } else if(e.getSource()==button1){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"1");
        } else if(e.getSource()==button2){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"2");
        } else if(e.getSource()==button3){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"3");
        } else if(e.getSource()==button0){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+"0");
        } else if(e.getSource()==buttonPeriod){
            if (Objects.equals(this.numberField.getText(), "0")){
                this.numberField.setText("");}
            this.numberField.setText(this.numberField.getText()+".");
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame implements ActionListener{

    JButton plusButton;
    JButton minusButton;
    JButton multiplicationButton;
    JButton divisionButton;
    JButton equalButton;
    JButton percentageButton;
    JButton negativePositiveButton;
    JButton cleanButton;

    public CalculatorView(){

        // Buttons dimension 100/90
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

        JPanel textPanel = new JPanel();
        textPanel.setBounds(0,0,280,150);
        this.setLayout(null);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.gray);
        buttonsPanel.setBounds(0,150,280,380);
        this.setLayout(null);

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(280,530);
        this.setVisible(true);
        buttonsPanel.add(plusButton);
        buttonsPanel.add(minusButton);
        buttonsPanel.add(divisionButton);
        buttonsPanel.add(multiplicationButton);
        buttonsPanel.add(equalButton);
        buttonsPanel.add(percentageButton);
        buttonsPanel.add(negativePositiveButton);
        buttonsPanel.add(cleanButton);
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
            System.out.println("Clean button");
        }
    }
}

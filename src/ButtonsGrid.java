import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsGrid extends JPanel implements ActionListener {
    JButton plusButton;
    JButton minusButton;
    JButton multiplicationButton;
    JButton divisionButton;
    JButton equalButton;
    JButton percentageButton;
    JButton negativePositiveButton;
    JButton cleanButton;
    public ButtonsGrid(){

//      Buttons dimension 100/90
//      Add button.
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

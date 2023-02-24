import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonsGrid extends JPanel {
    JButton plusButton;
    JButton minusButton;
    JButton multiplicationButton;
    JButton divisionButton;
    JButton equalButton;
    JButton percentageButton;
    JButton negativePositiveButton;
    JButton cleanButton;
    public ButtonsGrid(JFrame frame){

        // Buttons dimension 100/90
        // Add button.
        this.plusButton = new JButton();
        this.plusButton.setText("+");
        this.plusButton.addActionListener((ActionListener) frame);
        this.plusButton.setBounds(210,0,210,70);

        // Minus button.
        this.minusButton = new JButton();
        this.minusButton.setText("-");
        this.minusButton.addActionListener((ActionListener) frame);
        this.minusButton.setBounds(210,140,70,70);

        // Multiplication Button.
        this.multiplicationButton = new JButton();
        this.multiplicationButton.setText("-");
        this.multiplicationButton.addActionListener((ActionListener) frame);
        this.multiplicationButton.setBounds(210,70,70,70);

        // Division Button.
        this.divisionButton = new JButton();
        this.divisionButton.setText("-");
        this.divisionButton.addActionListener((ActionListener) frame);
        this.divisionButton.setBounds(210,0,70,70);

        // Equal Button.
        this.equalButton = new JButton();
        this.equalButton.setText("-");
        this.equalButton.addActionListener((ActionListener) frame);
        this.equalButton.setBounds(210,280,70,70);

        // Percentage Button.
        this.percentageButton = new JButton();
        this.percentageButton.setText("-");
        this.percentageButton.addActionListener((ActionListener) frame);
        this.percentageButton.setBounds(140,0,70,70);

        // Negative/positive Button.
        this.negativePositiveButton = new JButton();
        this.negativePositiveButton.setText("-");
        this.negativePositiveButton.addActionListener((ActionListener) frame);
        this.negativePositiveButton.setBounds(70,0,70,70);

        // Clean Button.
        this.cleanButton = new JButton();
        this.cleanButton.setText("-");
        this.cleanButton.addActionListener((ActionListener) frame);
        this.cleanButton.setBounds(0,0,70,70);

    }
}

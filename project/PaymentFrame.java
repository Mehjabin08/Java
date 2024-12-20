import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentFrame extends JFrame implements ActionListener {
    private JLabel transactionLabel, paymentMethodLabel;
    private JButton bkashButton, ukashButton, nextButton;
    private JTextField transactionIDField;
    private String paymentMethod;

    public PaymentFrame() {
        setTitle("Payment Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        transactionLabel = new JLabel("Transaction ID:");
        panel.add(transactionLabel);

        transactionIDField = new JTextField();
        panel.add(transactionIDField);

        paymentMethodLabel = new JLabel("Payment Method:");
        panel.add(paymentMethodLabel);

        bkashButton = new JButton("Bkash");
        bkashButton.addActionListener(this);
        panel.add(bkashButton);

        ukashButton = new JButton("Ukash");
        ukashButton.addActionListener(this);
        panel.add(ukashButton);

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        panel.add(nextButton);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bkashButton) {
            paymentMethod = "Bkash";
        } else if (e.getSource() == ukashButton) {
            paymentMethod = "Ukash";
        } else if (e.getSource() == nextButton) {
            // Save input information to backend or perform any necessary action
            String transactionID = transactionIDField.getText();
            // Save 'transactionID' and 'paymentMethod' to the backend or pass to another project
            System.out.println("Transaction ID: " + transactionID);
            System.out.println("Payment Method: " + paymentMethod);

            // For now, let's assume you want to close this frame and open another project/frame
            // Replace this section with code to open the next frame or project
            dispose(); // Close this frame
            // Code to open another frame or project
            // Example: AnotherFrame anotherFrame = new AnotherFrame();
            // AnotherFrame should be a new class that represents the next frame or project
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaymentFrame::new);
    }
}

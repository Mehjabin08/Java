import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifyCode extends JFrame implements ActionListener {
    private JLabel transactionLabel, paymentMethodLabel, licenseLabel;
    private JButton bkashButton, ukashButton, nextButton, verifyNextButton;
    private JTextField transactionIDField, licenseTextField;
    private String paymentMethod;

    private JFrame verifyFrame;

    public VerifyCode() {
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

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bkashButton) {
            paymentMethod = "Bkash";
        } else if (e.getSource() == ukashButton) {
            paymentMethod = "Ukash";
        } else if (e.getSource() == nextButton) {
            String transactionID = transactionIDField.getText();
            System.out.println("Transaction ID: " + transactionID);
            System.out.println("Payment Method: " + paymentMethod);

            // Creating the verification window
            createVerificationWindow();
        } else if (e.getSource() == verifyNextButton) {
            String licenseVerifyCode = licenseTextField.getText();
            System.out.println("License Verify Code: " + licenseVerifyCode);

            // Close the verification window
            verifyFrame.dispose();
        }
    }

    private void createVerificationWindow() {
        verifyFrame = new JFrame("Verification");
        verifyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel verifyPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        verifyPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        licenseLabel = new JLabel("License Verify Code:");
        verifyPanel.add(licenseLabel);

        licenseTextField = new JTextField();
        verifyPanel.add(licenseTextField);

        verifyNextButton = new JButton("Next");
        verifyNextButton.addActionListener(this);
        verifyPanel.add(verifyNextButton);

        verifyFrame.add(verifyPanel);
        verifyFrame.pack();
        verifyFrame.setLocationRelativeTo(null);
        verifyFrame.setVisible(true);
    }
 // Other operations with VerifyCode instance...
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            VerifyCode verifyCode = new VerifyCode();
            
        }
    });
}

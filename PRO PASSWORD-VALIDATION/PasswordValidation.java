import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PasswordValidation extends JFrame {
    JLabel interfaceHeader = new JLabel();
    JTextField interfaceTextField = new JTextField();
    JButton validateButton = new JButton();
    JButton exiButton = new JButton();

    public static void main(String[] args) {
        new PasswordValidation().show();
    }

    public PasswordValidation() {
        getContentPane().setBackground(Color.yellow);// Giving the interface a Background Colour
        setResizable(false);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints position = new GridBagConstraints();
        interfaceHeader.setText("Please Enter Your Pasword");
        interfaceHeader.setHorizontalAlignment(SwingConstants.CENTER);
        position.gridx = 0;
        position.gridy = 0;
        position.ipadx = 30;
        position.ipady = 20;
        position.insets = new Insets(5, 20, 5, 20);
        getContentPane().add(interfaceHeader, position);
        GridBagConstraints position1 = new GridBagConstraints();
        interfaceHeader.setOpaque(true);
        interfaceHeader.setBackground(Color.white);
        interfaceHeader.setBorder(BorderFactory.createLoweredBevelBorder());
        interfaceTextField.setColumns(15);
        position1.gridx = 0;
        position1.gridy = 1;
        getContentPane().add(interfaceTextField, position1);
        interfaceTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                interfaceTextFieldActionPerformed(e);
            }
        });
        GridBagConstraints position2 = new GridBagConstraints();
        validateButton.setText("Validate");
        position2.gridx = 0;
        position2.gridy = 2;
        getContentPane().add(validateButton, position2);
        validateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validateButtonActionPerformed(e);
            }
        });
        GridBagConstraints position3 = new GridBagConstraints();
        exiButton.setText("Exit");
        position3.gridx = 0;
        position3.gridy = 3;
        getContentPane().add(exiButton, position3);
        exiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });

        pack();
    }

    private void interfaceTextFieldActionPerformed(ActionEvent e) {
        validateButton.doClick();
       

    }

    private void validateButtonActionPerformed(ActionEvent e) {

        final String passowrd = "Adrish@123";
        if (interfaceTextField.getText().equals(passowrd)) {

            JOptionPane.showConfirmDialog(null,"Correct Password","Bull's Eye",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int response;
            
           response = JOptionPane.showConfirmDialog(null,"Incorrect Password","Booo!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        
        if(response == JOptionPane.YES_OPTION)
        {
            interfaceTextField.setText("");
            interfaceTextField.requestFocus();
        }
        else{

        }
    }
    }

    private void exitButtonActionPerformed(ActionEvent e) {

    }

}

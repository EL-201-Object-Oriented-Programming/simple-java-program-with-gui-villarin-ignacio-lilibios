import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G9LoginForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Group 9 Login Page");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

JLabel userLabel = new JLabel("Username:");
JTextField userField = new JTextField();
        	JLabel passLabel = new JLabel("Password:");
        	JPasswordField passField = new JPasswordField();
    JButton enterButton = new JButton("Enter");
    JButton resetButton = new JButton("Reset");
     JButton exitButton = new JButton("Exit");
frame.add(userLabel);
frame.add(userField);
frame.add(passLabel);
frame.add(passField);
frame.add(enterButton);
frame.add(resetButton);
frame.add(exitButton);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("Group9") && 
                    (password.equals("Villarin") || password.equals("Ignacio") || password.equals("LiLibios"))) {
                    openSuccessWindow();
    } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
       }
            			}
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userField.setText("");
                passField.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
});
        frame.setVisible(true);
  }
    private static void openSuccessWindow() {
        JFrame successFrame = new JFrame("Group9LoginOutput");
        successFrame.setSize(300, 150);
        successFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        successFrame.setLayout(new BorderLayout());

        JLabel successLabel = new JLabel("SUCCESSFUL LOGIN FROM GROUP9!", JLabel.CENTER);
        successFrame.add(successLabel, BorderLayout.CENTER);

        JButton okButton = new JButton("AGAIN?");
        successFrame.add(okButton, BorderLayout.SOUTH);

        okButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
successFrame.dispose();
}
});
        successFrame.setVisible(true);
    }
}
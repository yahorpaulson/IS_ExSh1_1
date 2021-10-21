import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static  JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JLabel success;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);


        userLabel = new JLabel("User: ");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80,25);
        loginButton.addActionListener(new GUI());
        panel.add(loginButton);

        success = new JLabel("");
        success.setBounds(10,110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = String.valueOf(passwordText.getPassword());
        System.out.println(user + ", " + password);

        if(user.equals("yahorpaulson") && password.equals("password")){
            success.setText("Login successful!");
        }

    }
}

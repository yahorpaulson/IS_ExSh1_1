import javax.swing.*;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);


        JLabel userlabel = new JLabel("Login: ");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80,25);
        panel.add(loginButton);

        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame implements ActionListener {
    JButton logInButton;
    JButton registerButton;

    public LogIn(){
        ImageIcon logInIcon=new ImageIcon("RustyRentsLogo.png");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(logInIcon.getImage());
        this.setSize(500,500);
        this.setLayout(new BorderLayout());


        JPanel headerPanel=new JPanel();
        JPanel bodyPanel=new JPanel();
        JPanel footerPanel=new JPanel();

        headerPanel.setPreferredSize(new Dimension(100,100));
        bodyPanel.setPreferredSize(new Dimension(100,100));
        footerPanel.setPreferredSize(new Dimension(100,100));


        this.add(headerPanel,BorderLayout.NORTH);
        this.add(bodyPanel,BorderLayout.CENTER);
        this.add(footerPanel,BorderLayout.SOUTH);
        this.setSize(270,500);
        this.setResizable(false);

        JLabel headerImage = new JLabel(logInIcon);
        headerImage.setOpaque(true);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.add(headerImage,BorderLayout.CENTER);
        headerImage.setPreferredSize(new Dimension(20,20));

        JLabel usernameLabel=new JLabel("Username: ");
        usernameLabel.setPreferredSize(new Dimension(100,100));
        bodyPanel.add(usernameLabel,BorderLayout.CENTER);

        JTextField usernameTextField = new JTextField();
        usernameTextField.setPreferredSize(new Dimension(100,20));
        bodyPanel.add(usernameTextField);

        JLabel passwordLabel=new JLabel("Password: ");
        passwordLabel.setPreferredSize(new Dimension(100,100));
        bodyPanel.add(passwordLabel);

        JPasswordField passwordTextField=new JPasswordField();
        passwordTextField.setPreferredSize(new Dimension(100,20));
        passwordTextField.setEchoChar('*');
        bodyPanel.add(passwordTextField);

        logInButton = new JButton("Log In");
        logInButton.setToolTipText("Log into your existing account");
        logInButton.setBackground(new Color(139,0,139));
        footerPanel.add(logInButton);

        registerButton = new JButton("Register");
        registerButton.setToolTipText("Create a account for our platform");
        registerButton.setBackground(new Color(139,0,139));
        footerPanel.add(registerButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton){
            Register register = new Register();
        }
        if(e.getSource()==logInButton){

        }
    }
}

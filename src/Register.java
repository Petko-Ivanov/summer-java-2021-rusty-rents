import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener {

    JPanel panelContainer=new JPanel();
    JPanel firstPanel=new JPanel();
    JPanel secondPanel=new JPanel();
    JPanel thirdPanel=new JPanel();
    CardLayout cardLayout = new CardLayout();

    JButton customerButton=new JButton("Renter");
    JButton landlordButton=new JButton("Landlord");
    JButton backToLogInScreenButton=new JButton("Back to Log in");

    public Register(){
        ImageIcon registrationIcon=new ImageIcon("RustyRentsLogo.png");
        Image rustyRentsLogo=registrationIcon.getImage();
        Image newing = rustyRentsLogo.getScaledInstance(100,100,Image.SCALE_SMOOTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(registrationIcon.getImage());
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        registrationIcon=new ImageIcon(newing);

        panelContainer.setLayout(cardLayout);
        panelContainer.add(firstPanel,"1");
        panelContainer.add(secondPanel,"2");
        panelContainer.add(thirdPanel,"3");
        cardLayout.show(panelContainer,"1");

        //firstPanel
        firstPanel.setLayout(new BorderLayout());
        JLabel headerImage= new JLabel(registrationIcon);
        headerImage.setPreferredSize(new Dimension(100,100));
        JLabel accountOptionLabel=new JLabel("Choose your preferred option");
        customerButton.addActionListener(this);
        landlordButton.addActionListener(this);
        backToLogInScreenButton.addActionListener(this);

        JPanel subPanelForFirstPanel1=new JPanel();
        JPanel subPanelForFirstPanel2=new JPanel();
        JPanel subPanelForFirstPanel3=new JPanel();
        subPanelForFirstPanel1.setPreferredSize(new Dimension(200,150));
        subPanelForFirstPanel2.setPreferredSize(new Dimension(200,100));
        subPanelForFirstPanel3.setPreferredSize(new Dimension(200,50));

        firstPanel.add(subPanelForFirstPanel1,BorderLayout.NORTH);
        firstPanel.add(subPanelForFirstPanel2,BorderLayout.CENTER);
        firstPanel.add(subPanelForFirstPanel3,BorderLayout.SOUTH);

        subPanelForFirstPanel1.add(headerImage,BorderLayout.CENTER);
        subPanelForFirstPanel2.add(accountOptionLabel,BorderLayout.SOUTH);
        subPanelForFirstPanel2.add(customerButton,BorderLayout.SOUTH);
        subPanelForFirstPanel2.add(landlordButton,BorderLayout.SOUTH);

        subPanelForFirstPanel3.add(backToLogInScreenButton);

        this.add(panelContainer);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==customerButton){
            cardLayout.show(panelContainer,"2");
        }
        if(e.getSource()==landlordButton){
            cardLayout.show(panelContainer,"3");
        }
        if(e.getSource()==backToLogInScreenButton){
            this.dispose();
            new LogIn();
        }
    }
}

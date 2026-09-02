import java.awt.*;
import javax.swing.*;

public class Menu {
    public static void main (String[] args) {
        
        JFrame frame = new JFrame("Monê");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

       ImageIcon imageIcon = new ImageIcon ("1312431313221.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(imageLabel, FlowLayout.CENTER);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Entrar como usuário");
        JButton button2 = new JButton("Entrar como administrador");
        JButton button3 = new JButton("Entrar como gerente");

        formPanel.add(button1);
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(button2);
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(button3);
        formPanel.add(Box.createVerticalStrut(10));

        panel.add(formPanel, FlowLayout.CENTER);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

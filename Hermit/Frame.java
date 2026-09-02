

import java.awt.*;
import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        // Cria a janela principal da aplicação.
        JFrame frame = new JFrame("Monê");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Container principal que vai organizar a imagem à esquerda e o formulário à direita.
        JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 25));
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Carrega a imagem da logo e coloca em um JLabel.
        ImageIcon imageIcon = new ImageIcon("1312431313221.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Painel do formulário, com os componentes empilhados verticalmente.
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        // Labels e campos para usuário e senha.
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15); // Campo de texto para nome do usuário.
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15); // Campo de senha, ocultando os caracteres.
        JButton loginButton = new JButton("Login"); // Botão de login.


        // Adiciona os componentes no painel do formulário.
        formPanel.add(usernameLabel);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(usernameField);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(passwordLabel);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(passwordField);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(loginButton);

        // Posiciona a logo e o formulário dentro do container principal.
        container.add(imageLabel);
        container.add(formPanel);

        // Coloca o container no centro da janela.
        frame.add(container, BorderLayout.CENTER);
        frame.pack(); // Ajusta o tamanho da janela ao conteúdo.
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela.
        frame.setVisible(true); // Exibe a janela.
    }
}

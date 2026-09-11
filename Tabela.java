import javax.swing.*;
import javax.table.DefaultTableModel;

public class Tabela {
    public static void main (String [] args){

        JFrame frame = new JFrame("Monê");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Container principal que vai organizar a imagem à esquerda e o formulário à direita.
        JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 25));
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn ("Id");
        model.addColumn ("Nome");
        model.addColumn ("Editora");
        model.addColumn ("Ano de Publicação");
        model.addColumn ("Autor");

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500, 200));

        container.add(scrollPane);

        frame.add(container, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

package javaBien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    private int numberOfClick=0;
    private JPanel jPanel;
    private JButton jButton;
    private JLabel jLabel;

    public Demo() {
        super("Java bien !");
        this.setSize(600,150);

        jPanel = new JPanel();
        jButton = new JButton("OK");
        jLabel = new JLabel("Java bien !");

        this.add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfClick++;
                jLabel.setText("Nombre de click : "+numberOfClick );
                jPanel.repaint();
            }
        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

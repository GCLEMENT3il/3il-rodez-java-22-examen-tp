import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import java.awt.BorderLayout;
import java.awt.Font;

public class TexteEtFonteBis extends JFrame {
    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("Confirmation titre");
    private JButton bouton2 = new JButton("Confirmation description");
    private JButton bouton3 = new JButton("Confirmation date d’échéance");

    public TexteEtFonteBis() {
        this.setTitle("Page d'ajout de fourniture");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //Ajout du bouton à notre content pane
        pan.add(bouton);
        this.setContentPane(pan);
        this.setVisible(true);

        pan.add(bouton2);
        this.setContentPane(pan);
        this.setVisible(true);

        pan.add(bouton3);
        this.setContentPane(pan);
        this.setVisible(true);
    }
}
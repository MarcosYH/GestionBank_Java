package vue;

import com.sun.jdi.InterfaceType;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Acceuil extends JFrame{

    private JPanel mainpanel;
    private JButton connexionButton;

    public Acceuil() {
        this.setContentPane(mainpanel);
        this.setVisible(true);
        this.setSize(800, 550);
        this.setLocationRelativeTo(null);
        this.setTitle("Gestion Bancaire");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        connexionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Interface interfaces=new Interface();
                JPanel mainpanel2=interfaces.getMainpanel2();
               new_fenetre(mainpanel2);
            }
        });
    }
    public void new_fenetre(JPanel pane){
        this.setContentPane(pane);
        this.setVisible(true);
        this.setSize(1200, 550);
        this.setLocationRelativeTo(null);
        this.setTitle("Gestion Bancaire");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Acceuil fenetre = new Acceuil();

    }


     
}


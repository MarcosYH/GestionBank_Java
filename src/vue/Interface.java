package vue;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;

public class Interface extends JFrame{
    private JPanel mainpanel2;
    private JTabbedPane tabbedPane1;
    private JButton enregistrerButton;
    private JButton effectuerLePrêtButton;
    private JButton verifiListeClientButton;
    private JButton rembourserLePrêtButton;
    private JTextField textFieldPrenom;
    private JComboBox comboBoxtypecompte;
    private JComboBox comboBoxcivilite;
    private JTextField textFieldsoldeDepot;
    private JTextField textFieldNumcompt;
    private JTextField textFieldNumretrait;
    private JTextField textFieldsoldeRetrait;
    private JCheckBox accepterCheckBox;
    private JTextField textFieldname;
    private int solde;
    private JButton enregistrer2;
    private JButton enregistrer3;
    private JPanel afficherclient;
    private JLabel labelclient;
    private JLabel labelclient1;
    private JLabel labelclient2;
    private JLabel labelclient3;
    private JLabel labeldate;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JLabel labeljours;
    private JLabel labelmois;
    private JLabel labelannee;
    private JLabel labeldate1;
    private JLabel labeldate2;
    private JTextField textFieldnumcomptpret;
    private JTextField interet;
    private JLabel numcomptt;
    private JLabel labelnumcompt;
    private JSpinner spinner4solde;
    private JSpinner spinner5interet;
    private JSpinner spinner6depot;
    private JSpinner spinner7retrait;
    private JTextField textfieldnumcomptrembourser;
    private JSpinner spinnerpret;
    private JSpinner spinnerrembouser;
    private JPanel mainpanels;
    private JButton actualiserButton;
    private JTable table1;
    private JOptionPane jop1,jop2,jop3,jop4,jop5,jop6,jop7,jop8;
    public static int numcompt=69078;



    public Interface() {



        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldname.getText().isEmpty()||textFieldPrenom.getText().isEmpty()){
                    jop1=  new JOptionPane();
                    JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs s'il vous plais","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    labelclient.setText(textFieldname.getText());
                    labelclient1.setText(textFieldPrenom.getText());
                    int sommedepose = (int) spinner4solde.getValue();
                    labelclient2.setText(Integer.toString(sommedepose));
                    labelclient3.setText(comboBoxtypecompte.getSelectedItem().toString());
                    labeldate.setText(spinner1.getValue().toString());
                    labeldate1.setText(spinner2.getValue().toString());
                    labeldate2.setText(spinner3.getValue().toString());
                    labelnumcompt.setText(Integer.toString(numcompt));
                    textFieldNumcompt.setText(labelnumcompt.getText());
                    textFieldNumretrait.setText(labelnumcompt.getText());
                    textFieldnumcomptpret.setText(labelnumcompt.getText());
                    textfieldnumcomptrembourser.setText(labelnumcompt.getText());
                    jop2=  new JOptionPane();
                    JOptionPane.showMessageDialog(null," Compte créé avec succès, le numéro de compte est le "+numcompt,"Information",JOptionPane.INFORMATION_MESSAGE);
                }




            }
        });
        enregistrer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldNumcompt.getText().isEmpty()){
                    jop3=new JOptionPane();
                    JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs s'il vous plais","Information",JOptionPane.INFORMATION_MESSAGE);

                }
                else {
                    if (textFieldname.getText().isEmpty()){
                        jop4= new JOptionPane();
                        JOptionPane.showMessageDialog(null,"Créer un compte ou Entrer un numéro de compte valide s'il vous plaît","Information",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        int depot;
                        depot = (int) spinner6depot.getValue();
                        int montants = (int) spinner4solde.getValue();
                        depot = depot+montants;
                        labelclient2.setText(Integer.toString(depot));
                        jop4= new JOptionPane();
                        JOptionPane.showMessageDialog(null," Dépot effectué avec succès","Information",JOptionPane.INFORMATION_MESSAGE);
                    }

                }







            }
        });
        enregistrer3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldNumretrait.getText().isEmpty()){
                    jop5=new JOptionPane();
                    JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs s'il vous plais","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    int solde;
                    solde = (int) spinner4solde.getValue();
                    int depot = (int) spinner6depot.getValue();
                    int retrait = (int) spinner7retrait.getValue();
                    solde = (solde+depot)-retrait;
                    labelclient2.setText(Integer.toString(solde));
                    jop6=new JOptionPane();
                    JOptionPane.showMessageDialog(null," Retrait effectué avec succès","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                int solde;
                solde = (int) spinner4solde.getValue();
                int depot = (int) spinner6depot.getValue();
                int retrait = (int) spinner7retrait.getValue();

                    if (solde<retrait){
                        jop7=new JOptionPane();
                        labelclient2.setText(Integer.toString(solde+depot));
                        JOptionPane.showMessageDialog(null,"Vous n'avez pas assez d'argent dans votre compte pour effctuer cette opérton","Information",JOptionPane.INFORMATION_MESSAGE);
                    }





            }
        });

        comboBoxtypecompte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        effectuerLePrêtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textFieldnumcomptpret.getText().isEmpty()){
                    jop8=new JOptionPane();
                    JOptionPane.showMessageDialog(null," Veuillez entrez un numéro de compte valide s'il vous plais.","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    int pret;
                    pret = (int) spinnerpret.getValue();
                    int solde= (int) spinner4solde.getValue();
                    int depot= (int) spinner6depot.getValue();
                    int retrait = (int) spinner7retrait.getValue();
                    labelclient2.setText(Integer.toString(pret+solde+depot-retrait));
                    int totalsomme = pret+solde+depot;
                    jop8=new JOptionPane();
                    JOptionPane.showMessageDialog(null,""+pret+" on été déversé dans le compte.Veuillez vérifier.","Information",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        rembourserLePrêtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textfieldnumcomptrembourser.getText().isEmpty()){
                    jop8=new JOptionPane();
                    JOptionPane.showMessageDialog(null," Veuillez entrez un numéro de compte valide s'il vous plais.","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    int pret;
                    pret = (int) spinnerpret.getValue();
                    int solde= (int) spinner4solde.getValue();
                    int depot= (int) spinner6depot.getValue();
                    int rembourser= (int) spinnerrembouser.getValue();
                    int totalsomme = (pret+solde+depot)-rembourser;
                    labelclient2.setText(Integer.toString(totalsomme));
                    jop8=new JOptionPane();
                    JOptionPane.showMessageDialog(null,""+rembourser+" on été retiré dans le compte.Veuillez vérifier.","Information",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        actualiserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labeldate.setText(spinner1.getValue().toString());
                labeldate1.setText(spinner2.getValue().toString());
                labeldate2.setText(spinner3.getValue().toString());


            }
        });

    }

    public void fen(JPanel pann){
        this.setContentPane(pann);
        this.setVisible(true);
        this.setSize(500, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("Gestion Bancaire");


    }


    public static void main(String[] args){
        JFrame fenetre = new JFrame();
        fenetre.setVisible(true);
    }

    public JPanel getMainpanel2() {
        return mainpanel2;
    }

    public int nextNumber(){

        numcompt++;
        return numcompt-1;

        }
}

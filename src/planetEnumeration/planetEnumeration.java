package planetEnumeration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class planetEnumeration {
    private JPanel mainPanel;
    private JButton btnUranus;
    private JButton btnJUSTEARTH;
    private JButton btnJupiter;
    private JButton btnEarth;
    private JButton btnMercury;
    private JButton btnVenus;
    private JButton btnMars;
    private JButton btnSaturn;
    private JButton btnNeptune;
    private JLabel lblClickPlanet;
    private JLabel lblyouWouldGoTo;

    public static void main(String[] args) {
        // write your code here

        JFrame frame = new JFrame("planetEnumeration");
        frame.setContentPane((new planetEnumeration().mainPanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public planetEnumeration() {
        btnJUSTEARTH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });
    }
}

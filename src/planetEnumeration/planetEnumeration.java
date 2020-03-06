package planetEnumeration;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Main.Planets.EARTH;

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
    private JLabel lblDisplay;
    //private Main.Planets lblyouWouldGoTo;

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
                //String strEARTH = planets.pass
                //lblDisplay = EARTH;

            }
        });
    }
}

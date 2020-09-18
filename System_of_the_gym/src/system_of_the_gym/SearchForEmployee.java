package system_of_the_gym;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchForEmployee extends JFrame {

    SearchForEmployeeController cs = new SearchForEmployeeController();

    public SearchForEmployee() {
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 400, 300);
        this.setMinimumSize(new Dimension(400, 300));
        this.setTitle("Search For Employee");

        JButton btnsearch = new JButton("search");

        JPanel pnllright = new JPanel();
        JPanel pnlleft = new JPanel();
        JPanel pnllbottom = new JPanel();

        JLabel ID = new JLabel("ID:");

        JTextField txtID = new JTextField("", 20);

        JTextArea area = new JTextArea();
        area.setEnabled(false);
        area.setBorder(BorderFactory.createTitledBorder("Your Search Result :"));

        Container con = this.getContentPane();
        pnlleft.setLayout(new GridLayout(2, 1));
        pnlleft.add(ID);
        pnlleft.add(btnsearch);

        pnllright.setLayout(new GridLayout(2, 1));

        pnllright.add(txtID);
        pnllright.add(area);

        con.add(pnllright, BorderLayout.EAST);
        con.add(pnlleft, BorderLayout.WEST);
        con.add(pnllbottom, BorderLayout.SOUTH);

        btnsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int z = 0;
                String d;
                d = txtID.getText();
                String gg = cs.SEC(d);
                area.setText(gg);
                txtID.setText("");

            }
        });
        this.repaint();

    }

}

package system_of_the_gym;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent.*;
import java.awt.event.*;

public class Reg extends JFrame {
    AddMemberController ca=new AddMemberController();

   

    public Reg() {
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 600, 300);
        this.setMinimumSize(new Dimension(600, 300));
        this.setTitle("Add Member");
        JPanel pnlright = new JPanel();
        JPanel pnlleft = new JPanel();
        JPanel pnlbottom = new JPanel();

        JLabel ID = new JLabel("ID");
        JLabel name = new JLabel("Name");
        JLabel adress = new JLabel("Adress");
        JLabel birth = new JLabel("Birthdate");
        JLabel height = new JLabel("Height");
        JLabel weight = new JLabel("Weight");
        JLabel regdate = new JLabel("Registration Date ");
        JLabel numofmonth = new JLabel("Number of months for your registration");
        JLabel inbody_ok = new JLabel("InBody");
        JCheckBox inbody = new JCheckBox();
        JButton btnsave = new JButton("Save");

        Container con = this.getContentPane();
        pnlleft.setLayout(new GridLayout(9, 1));

        pnlbottom.add(btnsave);
        con.add(pnlbottom, BorderLayout.SOUTH);

        pnlleft.add(ID);
        pnlleft.add(name);

        pnlleft.add(adress);
        pnlleft.add(birth);
        pnlleft.add(height);
        pnlleft.add(weight);
        pnlleft.add(regdate);
        pnlleft.add(numofmonth);
        pnlleft.add(inbody_ok);
        con.add(pnlleft, BorderLayout.WEST);

        JTextField txtID = new JTextField();
        JTextField txtname = new JTextField();
        JTextField txtadress = new JTextField();
        JPanel pnldate = new JPanel();
        JPanel pnlregdate = new JPanel();
        JTextField txtheight = new JTextField("", 20);
        txtheight.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if ((!(Character.isDigit(c)))) {
                    ke.consume();
                }
            }
        });
        JTextField txtweight = new JTextField("", 20);
        txtweight.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if ((!(Character.isDigit(c)))) {
                    ke.consume();
                }
            }
        });
        pnlregdate.setLayout(new GridLayout(1, 3));
        JComboBox comdayreg = new JComboBox(day);
        JComboBox commonthreg = new JComboBox(month);
        JTextField txtyearreg = new JTextField();
        txtyearreg.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if ((!(Character.isDigit(c)))) {
                    ke.consume();
                }
            }
        });

        pnlregdate.add(comdayreg);
        pnlregdate.add(commonthreg);
        pnlregdate.add(txtyearreg);

        JTextField txtnumofmonth = new JTextField("", 20);
        txtnumofmonth.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if ((!(Character.isDigit(c)))) {
                    ke.consume();
                }
            }
        });

        pnldate.setLayout(new GridLayout(1, 3));
        JComboBox comday = new JComboBox(day);
        JComboBox commonth = new JComboBox(month);
        JTextField txtyear = new JTextField();
        txtyear.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if ((!(Character.isDigit(c)))) {
                    ke.consume();
                }
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });

        pnldate.add(comday);
        pnldate.add(commonth);
        pnldate.add(txtyear);

        pnlright.setLayout(new GridLayout(9, 1));
        pnlright.add(txtID);
        pnlright.add(txtname);
        pnlright.add(txtadress);
        pnlright.add(pnldate);
        pnlright.add(txtheight);
        pnlright.add(txtweight);
        pnlright.add(pnlregdate);
        pnlright.add(txtnumofmonth);
        pnlright.add(inbody);

        con.add(pnlright, BorderLayout.EAST);

        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String i,n,a,d,m,y,h,w,da,cm,ty,tn,l;
                boolean in;
                i=txtID.getText();
                n=txtname.getText();
                a=txtadress.getText();
                d=comday.getSelectedItem().toString();
                m=commonth.getSelectedItem().toString();
                y=txtyear.getText();
                h=txtheight.getText();
                w=txtweight.getText();
                da=comdayreg.getSelectedItem().toString();
                cm=commonthreg.getSelectedItem().toString();
                ty=txtyearreg.getText();
                tn=txtnumofmonth.getText();
                in=inbody.isSelected();
               l= ca.AddMemberController1(i,n,a,d,m,y,h,w,da,cm,ty,tn,in);
                      txtID.setText(l);
                    txtname.setText("");
                    txtadress.setText("");
                    txtheight.setText("");
                    txtweight.setText("");
                    txtyear.setText("");
                    txtyearreg.setText("");
                    txtnumofmonth.setText("");
                    inbody.setSelected(false);
            }
        });

        this.repaint();
    }

   
}

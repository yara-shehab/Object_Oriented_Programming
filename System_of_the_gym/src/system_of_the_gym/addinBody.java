
package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class addinBody extends JFrame{
   
    AddInbodyController ca= new AddInbodyController();
     String [] hour = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String [] am_pm = {"am","pm"};
    String [] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String [] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    String [] gen = {"Male","Female"};
    public addinBody ()
    {
    this.setLayout(new BorderLayout());
            this.setBounds(200, 200, 600,300);
            this.setMinimumSize(new Dimension(600,300));
            this.setTitle("Add InBody");
            JPanel pnlright = new JPanel();
            JPanel pnlleft = new JPanel();
            JPanel pnlbottom = new JPanel();
            
            
            JLabel lbID = new JLabel("ID");
            JLabel lbHeight = new JLabel("Height");
            JLabel lbAge = new JLabel("Age");
            JLabel lbGender = new JLabel("Gender");
            JLabel lbTestDate = new JLabel("Test Date");
            JLabel lbTime = new JLabel("Time");
            JLabel lbBodyFatMass = new JLabel("Body Fat Mass");
            JLabel lbWeight = new JLabel("Weight");
            JLabel lbBMI = new JLabel("BMI");
            JLabel lbPBF = new JLabel("PBF");
            JButton btnsave = new JButton("save");
           

            
            
            
            Container con = this.getContentPane();
            pnlleft.setLayout(new GridLayout(10,1));
            pnlbottom.add(btnsave);
            con.add(pnlbottom,BorderLayout.SOUTH);
            
            
            
            pnlleft.add(lbID);
            
            pnlleft.add(lbHeight);
            pnlleft.add(lbAge);
            pnlleft.add(lbGender);
            pnlleft.add(lbTestDate);
            pnlleft.add(lbTime);
            pnlleft.add(lbBodyFatMass);
            pnlleft.add(lbWeight);
            pnlleft.add(lbBMI);
            pnlleft.add(lbPBF);


            
            con.add(pnlleft,BorderLayout.WEST);
            
            JTextField txtID = new JTextField();
            JTextField txtHeight = new JTextField();
            txtHeight.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtAge = new JTextField("",20);
            txtAge.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JComboBox combGender = new JComboBox(gen);
            JPanel pnltestdate = new JPanel();
            pnltestdate.setLayout(new GridLayout(1,3));
            JComboBox comdayreg = new JComboBox(day);
            JComboBox commonthreg = new JComboBox(month);
            JTextField txtyearreg = new JTextField();
            txtyearreg.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            pnltestdate.add(comdayreg);
            pnltestdate.add(commonthreg);
            pnltestdate.add(txtyearreg);
            JPanel pnlTime = new JPanel();
            JComboBox comhour = new JComboBox(hour);
            JComboBox comam_pm = new JComboBox(am_pm);
            JComboBox comweek = new JComboBox(week);
            pnlTime.setLayout(new GridLayout(1,3));
            pnlTime.add(comhour);
            pnlTime.add(comam_pm);
            pnlTime.add(comweek);
            JTextField txtBodyFatMass = new JTextField("",20);
            txtBodyFatMass.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtWeight = new JTextField("",20);
            txtWeight.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtBMI = new JTextField("",20);
            txtBMI.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtPBF = new JTextField("",20);
            txtPBF.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            
            pnlright.setLayout(new GridLayout(10, 1));
            pnlright.add(txtID);
            pnlright.add(txtHeight);
            pnlright.add(txtAge);
            pnlright.add(combGender);
            pnlright.add(pnltestdate);
            pnlright.add(pnlTime);
            pnlright.add(txtBodyFatMass);
            pnlright.add(txtWeight);
            pnlright.add(txtBMI);
            pnlright.add(txtPBF);

            
            con.add(pnlright,BorderLayout.EAST);
            btnsave.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                     String id,h,a,cg,cd,ch,cy,chh,cp,cww,b,w,bi,p;
                     id=txtID.getText();
                     h=txtHeight.getText();
                     a=txtAge.getText();
                     cg=combGender.getSelectedItem().toString();
                     cd=comdayreg.getSelectedItem().toString();
                     ch=commonthreg.getSelectedItem().toString();
                     cy=txtyearreg.getText();
                     chh=comhour.getSelectedItem().toString();
                     cp=comam_pm.getSelectedItem().toString();
                     cww=comweek.getSelectedItem().toString();
                     b=txtBodyFatMass.getText();
                     w=txtWeight.getText();
                     bi=txtBMI.getText();
                     p=txtPBF.getText();
                     ca.AddInbodyController1(id, h, a, cg, cd, ch, cy, chh, cp, cww, b,w, bi, p);
                     txtID.setText("");
                     txtHeight.setText("");
                     txtAge.setText("");
                     txtyearreg.setText("");
                     txtBodyFatMass.setText(""); 
                     txtWeight.setText("");
                     txtBMI.setText("");
                     txtPBF.setText("");
                     }
                
            });
           
            this.repaint();
    }
   
    }
    
    


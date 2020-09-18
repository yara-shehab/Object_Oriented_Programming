package system_of_the_gym;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListOfMember extends JFrame{
    public ListOfMember()
    {
        JPanel total = new JPanel();
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 750, 600);
        this.setMinimumSize(new Dimension(750,600));
        Container c = this.getContentPane();
        
        this.setTitle("List Of Members");
        JTextArea areaid = new JTextArea();
        JTextArea areaname = new JTextArea();
        JTextArea areaadress = new JTextArea();
        JTextArea areabirth = new JTextArea();
        JTextArea areaheight = new JTextArea();
        JTextArea areaweight = new JTextArea();
        JTextArea arearegdate = new JTextArea();
        JTextArea areanumofmonth = new JTextArea();
        JTextArea areainbody = new JTextArea();

        areaid.setEnabled(false);
        areaname.setEnabled(false);
        areaadress.setEnabled(false);
        areabirth.setEnabled(false);
        areaheight.setEnabled(false);
        areaweight.setEnabled(false);
        arearegdate.setEnabled(false);
        areanumofmonth.setEnabled(false);
        areainbody.setEnabled(false);
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areaid.setText(Member.listofmembers.get(i).getID());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areaname.setText(Member.listofmembers.get(i).getname());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areaadress.setText(Member.listofmembers.get(i).getadress());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areabirth.setText(Member.listofmembers.get(i).getbirthdate());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areaheight.setText(Member.listofmembers.get(i).getheight());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areaweight.setText(Member.listofmembers.get(i).getweight());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        arearegdate.setText(Member.listofmembers.get(i).getregdate());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areanumofmonth.setText(Member.listofmembers.get(i).getnumofmonth());
        }
        for(int i=0;i<Member.listofmembers.size();i++)
        {
        areainbody.setText(Member.listofmembers.get(i).getinbody());
        }
        
        areaid.setBorder(BorderFactory.createTitledBorder("ID :"));
        areaname.setBorder(BorderFactory.createTitledBorder("Name :"));
        areaadress.setBorder(BorderFactory.createTitledBorder("Adress :"));
        areabirth.setBorder(BorderFactory.createTitledBorder("Birthdate :"));
        areaheight.setBorder(BorderFactory.createTitledBorder("Height :"));
        areaweight.setBorder(BorderFactory.createTitledBorder("Weight :"));
        arearegdate.setBorder(BorderFactory.createTitledBorder("Registration Date :"));
        areanumofmonth.setBorder(BorderFactory.createTitledBorder("Number Of Months Of The Registration :"));
        areainbody.setBorder(BorderFactory.createTitledBorder("InBody :"));
        
        total.setLayout(new GridLayout(1,9));
        total.add(areaid);
        total.add(areaname);
        total.add(areaadress);
        total.add(areabirth);
        total.add(areaheight);
        total.add(areaweight);
        total.add(arearegdate);
        total.add(areanumofmonth);
        total.add(areainbody);

        c.add(total);

    }
}

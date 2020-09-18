package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListOfEmployees extends JFrame{
    public ListOfEmployees()
    {
        JPanel total = new JPanel();
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 750, 600);
        this.setMinimumSize(new Dimension(750,600));
        this.setTitle("List Of Employees");
        
        Container c = this.getContentPane();
        
        JTextArea areaid = new JTextArea();
        JTextArea areabirthdate = new JTextArea();
        JTextArea areaAdress = new JTextArea();
        JTextArea areasalary = new JTextArea();
        JTextArea areaname = new JTextArea();
        JTextArea areadateofemployment = new JTextArea();
        JTextArea areaposition = new JTextArea();
        
        areaid.setEnabled(false);
        areaname.setEnabled(false);
        areaAdress.setEnabled(false);
        areabirthdate.setEnabled(false);
        areasalary.setEnabled(false);
        areadateofemployment.setEnabled(false);
        areaposition.setEnabled(false);
        
           for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areaid.setText(Employee.listofemployee.get(i).getID());
        }
           for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areaname.setText(Employee.listofemployee.get(i).getname());
        }
        
          for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areaAdress.setText(Employee.listofemployee.get(i).getadress());
        }
        
         for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areabirthdate.setText(Employee.listofemployee.get(i).getbirthdate());
        }
        
         for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areasalary.setText(Employee.listofemployee.get(i).getsalary());
        }
        
         for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areadateofemployment.setText(Employee.listofemployee.get(i).getdateofemployment());
        }
        
          for(int i=0;i<Employee.listofemployee.size();i++)
        {
        areaposition.setText(Employee.listofemployee.get(i).getposition());
        }
        
        
        areaid.setBorder(BorderFactory.createTitledBorder("ID "));
        areaname.setBorder(BorderFactory.createTitledBorder("Name :"));
        areaAdress.setBorder(BorderFactory.createTitledBorder("Adress :"));
        areabirthdate.setBorder(BorderFactory.createTitledBorder("Birthdate :"));
        areasalary.setBorder(BorderFactory.createTitledBorder("Salary :"));
        areadateofemployment.setBorder(BorderFactory.createTitledBorder("Date of Employment :"));
        areaposition.setBorder(BorderFactory.createTitledBorder("Postion :"));
        
        
        total.setLayout(new GridLayout(1,7));
        
        
        total.add(areaid);
        total.add(areaname);
        total.add(areaAdress);
        total.add(areabirthdate);
        total.add(areasalary);
        total.add(areadateofemployment);
        total.add(areaposition);

        
        
        c.add(total);
        
        

    }
}





package system_of_the_gym;

import java.util.ArrayList;
public class Member {
     public static ArrayList<Member> listofmembers = new ArrayList<Member>();
    private String name;
    private String ID;
    private String adress;
    private String birthdate;
    private String height;
    private String weight;
    private String regdate;
    private String numofmonth;
    private boolean inbody;
    public    Member add(String i,String n,String a,String d,String m,String y,String h,String w,String cd,String cm,String ty ,String no,boolean in){
                  
                this.ID=i;
                this.name=n;
                this.adress=a;
                this.birthdate=d + "/" + m + "/" + y;
                this.height=h;
                this.weight=w;
                this.regdate=cd + "/" + cm + "/" + ty;
                this.numofmonth=no;
                this.inbody=in;
                return this ;
                
        
}
     public void setname(String s) {
        this.name = s;
    }

    public void setID(String i) {
        this.ID = i;
    }

    public void setadress(String i) {
        this.adress = i;
    }

    public void setbirthdate(String i) {
        this.birthdate = i;
    }

    public void setheight(String i) {
        this.height = i;
    }

    public void setweight(String i) {
        this.weight = i;
    }

    public void setregdate(String i) {
        this.regdate = i;
    }

    public void setnumofmonth(String i) {
        this.numofmonth = i;
    }

    public void setinbody(boolean i) {
        this.inbody = i;
    }

    public String getID1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).ID;
            }
        }
        return s;
    }

    public String getname1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).name;
            }
        }
        return s;
    }

    public String getadress1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).adress;
            }
        }
        return s;
    }

    public String getbirthdate1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).birthdate;
            }
        }
        return s;
    }

    public String getheight1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).height;
            }
        }
        return s;
    }

    public String getweight1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).weight;
            }
        }
        return s;
    }

    public String getregdate1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).regdate;
            }
        }
        return s;
    }

    public String getnumofmonth1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).numofmonth;
            }
        }
        return s;
    }

    public String getinbody1(int y) {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {
            if (y == i) {
                s = s + listofmembers.get(i).inbody;
            }
        }
        return s;
    }

    public String getname() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).name + "\n";
        }
        return s;
    }

    public String getID() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).ID + "\n";
        }
        return s;
    }

    public String getadress() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).adress + "\n";
        }
        return s;
    }

    public String getbirthdate() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).birthdate + "\n";
        }
        return s;
    }

    public String getheight() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).height + "\n";
        }
        return s;
    }

    public String getweight() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).weight + "\n";
        }
        return s;
    }

    public String getregdate() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).regdate + "\n";
        }
        return s;
    }

    public String getnumofmonth() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).numofmonth + "\n";
        }
        return s;
    }

    public String getinbody() {
        String s = "";
        for (int i = 0; i < listofmembers.size(); i++) {

            s = s + listofmembers.get(i).inbody + "\n";
        }
        return s;
    }
    
}

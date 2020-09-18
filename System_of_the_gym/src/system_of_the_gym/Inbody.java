
package system_of_the_gym;
import java.util.ArrayList;

public class Inbody {
   private String ID;
    private  String Height;
    private  String age;
    private  String gender;
    private  String testdate;
    private  String time;
    private  String bodyfat;
    private  String weight;
    private  String BMI;
    private  String PBF; 
     public static ArrayList<Inbody> listofinbodys = new ArrayList<Inbody>() ;
     public Inbody add(String id,String h,String a,String g,String cd,String cm,String ty,String ch,String pm,String cw,String b,String w,String bm,String p){
     this.ID=id;
     this.Height=h;
     this.age=a;
     this.gender=g;
     this.testdate=cd + "/" + cm + "/" + ty;
     this.time=ch + "/" + pm + "/" + cw;
     this.bodyfat=b;
     this.weight=w;
     this.BMI=bm;
     this.PBF=p;
     return this;
     }
      public void setID(String i)
    {
        this.ID=i;
    }
     public void setheight(String i)
    {
        this.Height=i;
    }
    public void setage(String i)
    {
        this.age=i;
    }
    public void setgender(String i)
    {
        this.gender=i;
    }
    public void settestdate(String i)
    {
        this.testdate=i;
    }
        public void settime(String i)
    {
        this.time=i;
    }
        public void setbodyfat(String i)
    {
        this.bodyfat=i;
    }
        public void setweight(String i)
    {
        this.weight=i;
    }
        public void setBMI(String i)
    {
        this.BMI=i;
    }
        public void setPBF(String i)
    {
        this.PBF=i;
    }
        public String getID1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).ID;
        }
        return s;
    }
        public String getheight1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).Height;
        }
        return s;
    }public String getage1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).age;
        }
        return s;
    }public String getgender1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).gender;
        }
        return s;
    }
    public String gettestdate1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).testdate;
        }
        return s;
    }public String gettime1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).time;
        }
        return s;
    }public String getbodyfat1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).bodyfat;
        }
        return s;
    }public String getweight1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).weight;
        }
        return s;
    }public String getBMI1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).BMI;
        }
        return s;
    }
    public String getPBF1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).PBF;
        }
        return s;
    }
    public  String getID()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).ID+ "\n";
        }
        return s;
    }
    public  String getheight()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).Height+ "\n";
        }
        return s;
    }
    public  String getage()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).age+ "\n";
        }
        return s;
    }public  String getgender()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).gender+ "\n";
        }
        return s;
    }
    public  String gettestdate()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).testdate+ "\n";
        }
        return s;
    }
    public  String gettime()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).time+ "\n";
        }
        return s;
    }
    public  String getbodyfat()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).bodyfat+ "\n";
        }
        return s;
    }
    public  String getweight()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).weight+ "\n";
        }
        return s;
    }
    public  String getBMI()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).BMI+ "\n";
        }
        return s;
    }public  String getPBF()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).PBF+ "\n";
        }
        return s;
    }
}

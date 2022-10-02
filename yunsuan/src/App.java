import java.util.*;
import java.io.*;
public class App 
{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException 
    {
        OutputStreamWriter Exercises = new OutputStreamWriter(new FileOutputStream("src\\Exercises.txt"));
        OutputStreamWriter Answers = new OutputStreamWriter(new FileOutputStream("src\\Answers.txt"));
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double []a=new double [n];
        double []b=new double [n];
        double []c=new double [n];
        double []d=new double [n];
        int []s1=new int [n];
        int []s2=new int [n];
        int []ch=new int [n];
        String []ex=new String [n];
        String []an=new String [n];
        Random r=new Random();
        for(int i=0;i<n;i++)
        {
            a[i]=r.nextDouble()*100;
            b[i]=r.nextDouble()*100;
            c[i]=r.nextDouble()*100;
            s1[i]=r.nextInt(2);
            s2[i]=r.nextInt(2);
            ch[i]=r.nextInt(2);
            String aa=String.format("%.1f",a[i]);
            a[i]=Double.parseDouble(aa);
            String bb=String.format("%.1f",b[i]);
            b[i]=Double.parseDouble(bb);
            String cc=String.format("%.1f",c[i]);
            c[i]=Double.parseDouble(cc);
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j]&&b[i]==b[j]&&c[i]==c[j]&&s1[i]==s1[j]&&s2[i]==s2[j]&&ch[i]==ch[j])
                {
                    a[i]=r.nextDouble()*100;
                    b[i]=r.nextDouble()*100;
                    c[i]=r.nextDouble()*100;
                    s1[i]=r.nextInt(2);
                    s2[i]=r.nextInt(2);
                    ch[i]=r.nextInt(2);
                    String aaa=String.format("%.1f",a[i]);
                    a[i]=Double.parseDouble(aaa);
                    String bbb=String.format("%.1f",b[i]);
                    b[i]=Double.parseDouble(bbb);
                    String ccc=String.format("%.1f",c[i]);
                    c[i]=Double.parseDouble(ccc);
                    j=0;
                }
            }
            int k=i+1;
            if(ch[i]==0)
            {
                if(s1[i]==0)
                {
                    d[i]=a[i]-b[i];
                    an[i]=String.format("%.1f",d[i]);
                    ex[i]=a[i]+"-"+b[i]+"=";     
                    Exercises.write(k+". "+ex[i]+"\r\n");
                    Answers.write(k+". "+an[i]+"\r\n");
                }
                else
                {
                    d[i]=a[i]+b[i];
                    an[i]=String.format("%.1f",d[i]);
                    ex[i]=a[i]+"+"+b[i]+"=";   
                    Exercises.write(k+". "+ex[i]+"\r\n");
                    Answers.write(k+". "+an[i]+"\r\n");
                }
            }
            else
            {
                if(s1[i]==0&&s2[i]==0)
                {
                    d[i]=a[i]-b[i]-c[i];
                    an[i]=String.format("%.1f",d[i]);
                    ex[i]=a[i]+"-"+b[i]+"-"+c[i]+"=";
                    Exercises.write(k+". "+ex[i]+"\r\n");
                    Answers.write(k+". "+an[i]+"\r\n");
                }
                if(s1[i]==0&&s2[i]==1)
                {
                    d[i]=a[i]-b[i]+c[i];
                    an[i]=String.format("%.1f",d[i]);
                    ex[i]=a[i]+"-"+b[i]+"+"+c[i]+"=";
                    Exercises.write(k+". "+ex[i]+"\r\n");
                    Answers.write(k+". "+an[i]+"\r\n");
                }
                if(s1[i]==1&&s2[i]==0)
                {
                    d[i]=a[i]+b[i]-c[i];
                    an[i]=String.format("%.1f",d[i]);
                    ex[i]=a[i]+"+"+b[i]+"-"+c[i]+"=";
                    Exercises.write(k+". "+ex[i]+"\r\n");
                    Answers.write(k+". "+an[i]+"\r\n");
                }
                if(s1[i]==1&&s2[i]==1)
                {
                    d[i]=a[i]+b[i]+c[i];
                    an[i]=String.format("%.1f",d[i]);
                    ex[i]=a[i]+"+"+b[i]+"+"+c[i]+"=";
                    Exercises.write(k+". "+ex[i]+"\r\n");
                    Answers.write(k+". "+an[i]+"\r\n");
                }
            }
        }
        input.close();
        Exercises.close();
        Answers.close();
    }    
}

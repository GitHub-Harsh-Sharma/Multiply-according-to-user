import java.io.*;
class Multi
{
    public static void main(String args[])throws IOException
    {
        int num1,num2,multi;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter 2 number");
        num1=Integer.parseInt(br.readLine());
        num2=Integer.parseInt(br.readLine());
        multi=num1*num2;
        System.out.println("multi="+multi);
    }
}
public class Demo
{
    public String Demo(String a,String b)
    {
        String result=a+b;
        return result;
    }
}
public class Eg
{
    public static void main(String [] a)
    {
        Demo obj=new Demo();
        System.out.println(obj.Demo("abhi","sajeev"));

    }
}
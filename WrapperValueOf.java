public class WrapperValueOf
{
 public static void main(String args[])
 {
   Integer i1=Integer.valueOf("123456");
   Integer i2=Integer.valueOf("101101",2);
   Double d1=Double.valueOf("3.14");

   System.out.println(i1);
   System.out.println(i2);
   System.out.println(d1);
 }
}
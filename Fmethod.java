class abc
{
public  void hai()
{
System.out.println("saturday");
}
public final void hello()
{
System.out.println("hurry");
}
}
public class Fmethod extends abc
{
public void hai()
{
System.out.println("no class");
}
 public static void main(String args[])
  {
    Fmethod fm = new Fmethod();
      fm.hello();
}
}
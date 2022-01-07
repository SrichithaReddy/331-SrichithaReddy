abstract class BB
{
 public abstract void start();
 public void brake()
 {
  System.out.println("To stop the vechicle");
 }
}
public class AA extends BB
{
 public void start()
 {
  System.out.println("push button");
 }
public static void main(String args[])
{
 AA a= new AA();
a.start();
a.brake();
}
}

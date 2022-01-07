class Mdemo
{
 public void test()
 {
  System.out.println("Example for method overloading");
 }
 public void test(int x)
 {
  System.out.println("Add="+(x+x));
 }
 public void test(int x,int y)
 {
  System.out.println("product="+(x*y));
 }
 public void test(int a,float b)
 {
  System.out.println("Add="+(a+b));
 }
 public static void main(String args[])
 {
   Mdemo m=new Mdemo();
    m.test();
    m.test(10);
    m.test(20,30);
    m.test(40,23.56f);
 }
}


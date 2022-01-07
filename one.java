class abc      // Super
{
	public void circle()
	{
		System.out.println("2-D");
	}
}
class two extends abc     // Sub
{
	public void circle()
	{
		System.out.println("closed figure");
	}
}
public class one
{
	public static void main(String[] args)
	{	
	  abc o = new abc();
            o.circle();
          two t = new two();
            t.circle();
	}
}


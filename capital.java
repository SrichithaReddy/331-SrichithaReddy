class capital
{
  public static void main(String[] args)
 {

    // create a string
    String name = "helloworld";
    String str = name.substring(0, name.length());
    
    // change the word to uppercase
    str = str.toUpperCase();
    name = str;
    System.out.println("Name: " + name);

  }
}
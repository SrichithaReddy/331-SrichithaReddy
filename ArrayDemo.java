class ArrayDemo
{
public static void main(String arg[])
{
int employe[];
int i;
employe=new int[6];
employe[0]=15245;
employe[1]=22222;
employe[2]=44000;
employe[3]=55826;
employe[4]=78514;
employe[5]=18633;
System.out.println(""+employe.length);
for(i=0;i<employe.length;i++)
{
System.out.println("elements="+employe[i]);
}
}
}
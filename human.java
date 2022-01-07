interface mobile
{
void connectToChat();
}
interface laptop
{
void connectToExternalDisplay();
}
public class human implements mobile,laptop
{
public void connectToChat()
{
System.out.println("connecting people");
}
public void connectToExternalDisplay()
{
System.out.println("incrediable inside");
}
public static void main(String args[])
{
human h = new human();
h.connectToChat();
h.connectToExternalDisplay();
}
}
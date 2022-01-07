class Switch
{
 public static void main(String args[])
 {
   int week=5;
   String weekdays;
   switch(week)
   {
    case 1:weekdays="MONDAY";
     break;
    case 2:weekdays="TUESDAY";
     break;
    case 3:weekdays="WEDNESSDAY";
     break;
    case 4:weekdays="THURSDAY";
     break;
    case 5:weekdays="FRIDAY";
     break;
    case 6:weekdays="SATURDAY";
     break;
    case 7:weekdays="SUNDAY";
     break;
    default:weekdays="Not Found";
   }
  System.out.println("Today is "+weekdays);
 }
}
    
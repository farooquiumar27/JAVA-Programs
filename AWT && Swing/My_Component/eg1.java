import java.util.*;
import java.time.*;
class TMDatePicker
{
private int[ ][ ] getDays(int month,int year)
{
Date firstDayOfMonth=new Date(year-1900,month-1,1);
Calendar firstDayOfMonthCalendar=Calendar.getInstance( );
firstDayOfMonthCalendar.setTime(firstDayOfMonth);
int dayOfWeekOfFirstDayOfMonth=firstDayOfMonthCalendar.get(Calendar.DAY_OF_WEEK);
YearMonth yearMonth=YearMonth.of(year,month);
int numberOfDaysInMonth=yearMonth.lengthOfMonth( );
Date lastDayOfMonth=new Date(year-1900,month-1,numberOfDaysInMonth);
Calendar lastDayOfMonthCalendar=Calendar.getInstance( );
lastDayOfMonthCalendar.setTime(lastDayOfMonth);
int dayOfWeekOfLastDayOfMonth=lastDayOfMonthCalendar.get(Calendar.DAY_OF_WEEK);
int weekNumber=lastDayOfMonthCalendar.get(Calendar.WEEK_OF_MONTH);
int [ ][ ]days=new int[weekNumber][7];
int c=dayOfWeekOfFirstDayOfMonth-1;
int r=0;
for(int x=1;x<=numberOfDaysInMonth;x++)
{
days[r][c]=x;
c++;
if(c==7)
{
c=0;
r++;
}
}
return days;
}
public static void main(String gg[ ])
{
int month=Integer.parseInt(gg[0]);
int year=Integer.parseInt(gg[1]);
TMDatePicker tmdp=new TMDatePicker( );
int [ ][ ]days=tmdp.getDays(month,year);
for(int x=0;x<days.length;x++)
{
for(int y=0;y<days[x].length;y++)
{
System.out.printf("%5d",days[x][y]);
}
System.out.printf("\n");
}
}
};
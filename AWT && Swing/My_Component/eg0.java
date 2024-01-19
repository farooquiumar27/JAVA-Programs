import java.util.*;
import java.text.*;
import java.time.LocalDate;
class _Date
{
public static void main(String gg[ ])
{
String dateString="01/";
if(Integer.parseInt(gg[0])>10)dateString=dateString+"0"+gg[0]+"/";
else dateString=dateString+gg[0]+"/";
dateString=dateString+gg[1];
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
Date date=null;

Map<String,Integer> map;
map=new HashMap<>( );
map.put("Sunday",0);
map.put("Monday",1);
map.put("Tuesday",2);
map.put("Wednesday",3);
map.put("Thursday",4);
map.put("Friday",5);
map.put("Saturday",6);

try
{
date=sdf.parse(dateString);
}catch(ParseException pe)
{
System.out.println(pe.getMessage( ));
}
String day=new SimpleDateFormat("EEEE",Locale.ENGLISH).format(date);
LocalDate localDate=LocalDate.of(Integer.parseInt(gg[1]), Integer.parseInt(gg[0]), 1);
int noOfDays=localDate.lengthOfMonth( );

ArrayList<int[ ]> calander=new ArrayList<>( );
int row[ ]=new int[7];
int dt=1;
for(int x=map.get(day);x<7;x++,dt++)row[x]=dt;
calander.add(row);

for(int z=1;dt<=noOfDays;z++)
{
row=new int[7];
for(int x=0;x<7 && dt<=noOfDays;x++,dt++)
{
row[x]=dt;
}
calander.add(row);
}

System.out.println("Sunday    |    Monday    |    Tuesday   |    Wednesday |    Thursday  |    Friday    |    Saturdy   |");
for(int x=0;x<calander.size( );x++)
{
row=calander.get(x);
for(int y=0;y<7;y++)
{
if(row[y]<10)System.out.print("0");
System.out.print(row[y]+"        |    ");
}
System.out.println();
}

}
};
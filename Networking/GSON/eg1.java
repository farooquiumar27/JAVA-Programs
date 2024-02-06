import com.google.gson.*;
class City implements java.io.Serializable
{
private int code;
private String name;
public void setCode(int code)
{
this.code=code;
}
public int getCode( )
{
return this.code;
}
public void setName(String name)
{
this.name=name;
}
public String getName( )
{
return this.name;
}
};
class Main
{
public static void main(String gg[ ])
{
String j="{\"code\": 101,\"name\":\"Ujjain\"}";
Gson gson=new Gson();
City city=gson.fromJson(j,City.class);
System.out.println(city.getCode());
System.out.println(city.getName());
String jsonString=gson.toJson(city);
System.out.println("JSON format is : "+jsonString);
}
};
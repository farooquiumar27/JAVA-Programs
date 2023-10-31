interface FunctionalSeries
{
public void lijiye(int j);
}
class TMSeries
{
private int start;
private int end;
private int step;
TMSeries(int start,int end,int step)
{
this.start=start;
this.end=end;
this.step=step;
}
public void ekEkDeDo(FunctionalSeries lambda)
{
for(int e=this.start;e<=this.end;e=e+this.step)
{
lambda.lijiye(e);
}
}
};
class main
{
public static void main(String gg[ ])
{
TMSeries tms=new TMSeries(1,50,3);
tms.ekEkDeDo((p)->{System.out.println(p);});
}
};
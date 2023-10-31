//The following class is been written by Amit
//Amit has the following domain knowledge
//Now to remove that flow amit has prepared the excel sheet of error_messages and error_codes and gives to Suresh.
class FinanceCalculator
{
public int calculateEligibility(int n, int s)
{
if(n<=0)return -1;
return (s*10)/n;
}
};


//following class is been written by Suresh
//Suresh has the UI knowledge
//Now suresh has the excel sheet
class UI
{
public static void main(String gg[ ])
{
//Assume that the value of nof and sal is accepted from end user
//end user : the one who will execute the application
int nof=-10;
int sal=403000;
FinanceCalculator fc=new FinanceCalculator( );
int loanAmt=fc.calculateEligibility(nof,sal);
//He is read this from that excel sheet.
if(loanAmt==-1)
{
System.out.println("Invalid input against family members");
return ;
}
System.out.println("You are eligible for a loan amount of Rupees : "+loanAmt);
}
};
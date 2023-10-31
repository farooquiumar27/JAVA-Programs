//This code contains a flow

//The following class is been written by Amit
//Amit has the following domain knowledge
class FinanceCalculator
{
public int calculateEligibility(int n, int s)
{
return (s*10)/n;
}
};

//following class is been written by Suresh
//Suresh has the UI knowledge
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
System.out.println("You are eligible for a loan amount of Rupees : "+loanAmt);
}
};
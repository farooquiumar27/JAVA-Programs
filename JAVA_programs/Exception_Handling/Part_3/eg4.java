//The following class is been written by Amit
//Amit has the following domain knowledge
//Now to remove that flow amit has created the Exception class
class InvalidFamilyMemberException extends RuntimeException
{
InvalidFamilyMemberException(String message)
{
super(message);
}
};

class FinanceCalculator
{
public int calculateEligibility(int n, int s)
{
if(n<=0)throw new InvalidFamilyMemberException("Number of family members are invalid");
return (s*10)/n;
}
};


//following class is been written by Suresh
//Suresh has the UI knowledge
//Now sureh will write his code in try block
class UI
{
public static void main(String gg[ ])
{
//Assume that the value of nof and sal is accepted from end user
//end user : the one who will execute the application
int nof=-10;
int sal=403000;
FinanceCalculator fc=new FinanceCalculator( );
try
{
int loanAmt=fc.calculateEligibility(nof,sal);
System.out.println("You are eligible for a loan amount of Rupees : "+loanAmt);
}catch(InvalidFamilyMemberException e)
{
System.out.println(e.getMessage( ));
}
}
};
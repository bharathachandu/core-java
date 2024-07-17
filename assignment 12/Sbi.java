class Sbi{
static double balance;
public static void credit(double amount)
{   System.out.println("New credit operation started");
	if(amount>0){ 
	balance=balance+amount;
	
}
else
{
	System.out.println("enter valid amount,credit operation cannot be carried out");
}
System.out.println("credit operation ended");
return ;
}
public static void debit(double amount)
{  System.out.println("New debit operation started");
	if(amount<=balance)
	{
	balance=balance-amount;
	
	}
	else{
		System.out.println("insufficient balance ,the debit operation cannot be carried out");	
	}
	System.out.println("debit operation ended");
	return ;
}
public static double getBalance()
{
 System.out.println("the balance amount is "+balance);
 return balance;
}
}
class SbiBank{

public static void main(String bank[]){
System.out.println("main method started");
Sbi.credit(115000.0);
double bal = Sbi.getBalance();
Sbi.credit(120000.0);
bal = Sbi.getBalance();
Sbi.credit(125000.0);
bal = Sbi.getBalance();
Sbi.debit(10000.0);
bal = Sbi.getBalance();
Sbi.debit(15000.0);
bal = Sbi.getBalance();
System.out.println("the final balance is:"+bal);
System.out.println("main method ended");
}

}
class FactorialRunn{	
public static void main(String[] fac){
int n=8;
int r=2;	
int r2=Factorial.facto(n)/(Factorial.facto(n-r)*Factorial.facto(r));
System.out.println("The Value of NCR is "+r2);		
}
}


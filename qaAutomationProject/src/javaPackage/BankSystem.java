package javaPackage;

public class BankSystem {
	
	int curentAmt = 1000;
	
	void deposit(int depamt)
	{
		// locally defined 
		curentAmt= depamt+curentAmt;
		System.out.println("Amount after deposit "+curentAmt);
	}
	
	void withdraw(int withdrawamt)
	{
	
		curentAmt = curentAmt-withdrawamt;
		System.out.println("The amount after withdraw "+curentAmt);
	}
	
	double display()
	{
		return curentAmt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSystem obj= new BankSystem();
		
		obj.deposit(1000);
		obj.withdraw(500);
		
		System.out.println("Balanace after the transaction" +obj.display());
	}

}

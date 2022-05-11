package hashcode;

public class Transaction {

	 String txId;
	String accNo;
	String accHolderName;
	String accType;
	String txType;
	int wd_Amt;
	int intial_Balance;
	int totalBalance;
	String txStatus;

	private Transaction(String txId, String accNo, String accHolderName, String accType, int totalBalance,
			int intial_Balance)  {

		this.txId = txId;
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.intial_Balance = intial_Balance;
		this.totalBalance = totalBalance;

	}

	public String toString() {

		System.out.println("Transaction details");
		System.out.println(" ------------------------- ");
		System.out.println("Transaction Id :" + txId);
		System.out.println("accHolderName :" + accHolderName);
		System.out.println("accType:" + accType);
		
		System.out.println("intial_Balance:" + intial_Balance);
		System.out.println("totalBalance :" + totalBalance);
		// System.out.println("withdrawn Amount :"+wd_Amt);
		System.out.println("txType :" + txType);
		System.out.println("txStatus :" + txStatus);
		return "";

	}

	public void withdraw(int wd_Amt) {

		totalBalance = intial_Balance - wd_Amt;
		txType = "withdraw";
		this.wd_Amt = wd_Amt;
		txStatus = "Success";

	}

	public static void main(String[] args) {

		Transaction h = new Transaction("T-111", "123456789", "venky", "Savings", 10000, 25000);
		h.withdraw(2000);
		System.out.println(h);

	}

}

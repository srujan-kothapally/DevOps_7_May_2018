interface Account
{
	public default String getId()
	{
		return "0000";
	}
	
}
interface PremiumAccount extends Account
{
	//String getId();
}

class BankAccount implements PremiumAccount{}
public class Test_21 {

	public static void main(String[] args) {
		Account account = new BankAccount();
		
		System.out.println(account.getId());

	}

}

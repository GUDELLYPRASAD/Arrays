class Entries{
	String prasad;
	String surname;
	int addressno;
	public   Entries (String prasad,String surname,int addressno) {
		this.prasad=prasad;
	 	this.surname=surname;
		 this.addressno=addressno;
		 System.out.println("enter name"+prasad);
		 System.out.println("enter surname"+surname);
		 System.out.println("enter address"+addressno);
		
	}
} 
class details extends Entries{
	int applicationNO;
	int phoneNO;
	String mailAdreess;
	public details(int applicationNo,int phoneNo,String mailaddress) {
		this.applicationNO=applicationNO;
		this.phoneNO=phoneNO;
		this.mailAdreess=mailAdreess;
		System.out.println("applicationNo"+applicationNo);
		System.out.println("phoneNo"+phoneNo);
		System.out.println("mailadreess"+mailsdreess);
		
	}
}
class address extends Entries{
	int houseno;
	public void address(int houseno) {
		this.houseno=houseno;
	}
}
	


public class application extends details{
	public static void main(String[] args) {
		Entries p =new Entries();
		//p.Entries();
		p.details();
		p.address();
		
		
		
	}

	

}

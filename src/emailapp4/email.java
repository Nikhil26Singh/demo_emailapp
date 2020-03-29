package emailapp4;

import java.util.Scanner;

public class email {
	private String fname;
	private String lname;
	private String password;
	private String department;
	private String email;
	private String companysuffix ="nikcompany.com";
	private int mailboxsize;
	private String alternateEmail;
	private int mailboxcapacity=500;
	

	//constructor to receive first and last name 
	public email(String fname,String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("EMAIL CREATED :"+this.fname+" "+this.lname);
		
		//call the department function
		
		this.department =setDepartment();
		System.out.println("Department :"+" " +this.department);
		
		//call the password method
		
		this.password = randomPassword(10);
		System.out.println("YOUR PASSWORD :"+" "+this.password);
		
		//creating the email
		
		email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department+"."+companysuffix;
		
	}
	
	//Ask for the department 
	private String setDepartment() {
		System.out.print(" The department CODES \n 1 for sale \n 2 for development \n 3 for Accounting \n 0 for none \n Enter the your CODE => " );
		Scanner sc =new Scanner (System.in);
		int depChoice=sc.nextInt();
		if(depChoice == 1) { return "Sale";}
		else if(depChoice == 2) {return "Development";}
		else if(depChoice == 3) {return "Accounting";}
		else return "none";
	}
	
	// generate random mail password
	
	private String randomPassword(int lenght) {
		String randomset="QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*";
		char[] password = new char[lenght];
		for (int i=0 ;i<lenght ;i++)
		{
			int rand =(int)(Math.random()*randomset.length());
			password[i]= randomset.charAt(rand);
			
		}
		return new String(password);
	}
	
	//Set the mailbox size or capacity
	public void setmailboxcapacity(int capacity)
	{
		this.mailboxcapacity=capacity;
	}
	//Set the alternate email
	public void setalternate(String altmail)
	{
		this.alternateEmail=altmail;
	}
	//change the password
	public void setchangepassword(String changepassword)
	{
		this.password=changepassword;
	}
	public int getmailcapacity() { return mailboxcapacity;}
	public String getalternate() { return alternateEmail;}
	public String getchangepassword() { return password;}
	
	// To display the info
	
	public String showinfo()
	{
		return "DISPLAY NAME :"+" "+fname+" "+lname+
				"\nCOMPANY EMAIL :"+" "+ email +
				"\nMAILBOX CAPACITY :"+" "+mailboxcapacity+"mb";
				
	}
}

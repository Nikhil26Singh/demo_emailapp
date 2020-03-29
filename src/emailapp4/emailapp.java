package emailapp4;

public class emailapp {

	public static void main(String[] args) {
		email eml = new email("Nikhil","Singh");
		eml.setalternate("abc@gmail.com");
		System.out.println("YOUR ALTERNATE EMAIL IS :"+eml.getalternate());
		eml.setchangepassword("AJOIISFICN");
		System.out.println("YOUR CHANGED PASSWORD"+" "+eml.getchangepassword());
		System.out.println(eml.showinfo());
	}

}

package ch_5;
interface PhoneInterface{
	final int TIMEOUT = 10000; 
	void sendCall();
	void receiveCall(); 
	default void printLogo() {
		System.out.println("** PHONE **");
	}
}

class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("ring ring ring");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("called phone");		
	}
	public void flash() { System.out.println("turn on flash");}
}
public class InterFaceEx {
	public static void main (String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
	}
}

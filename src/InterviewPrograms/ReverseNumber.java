package InterviewPrograms;

public class ReverseNumber {

	public static void main(String [] args) {
		int num = 500 , rev = 0;
		
		while(num!=0) {
			 int reminder =num%10;
			  rev = rev * 10+ reminder;
			  
			  num = num /10;
		}
		System.out.println(rev);
		
		
	}
	
	
	
}

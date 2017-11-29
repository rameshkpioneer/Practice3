package ram.practice.collectio;

public class ReversingNumber {

	
	public void numberReversed(int n){
		
	//	int n = 150 ;
		int reverse = 0;
		
		while(n !=0 ){
			reverse = reverse*10 +(n%10);
			n=n/10;
		}
		System.out.println("Reversed Number  my own " + reverse);
	}
	

    public int reverseNumber(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversingNumber rn = new ReversingNumber();
		
		int n = 100;
		System.out.println("reversed number from web  "+ rn.reverseNumber(n));
		rn.numberReversed(n);
		
		
	}

}

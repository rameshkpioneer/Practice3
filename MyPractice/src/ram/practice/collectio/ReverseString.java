package ram.practice.collectio;

public class ReverseString {

	
	public ReverseString(){
		
	}
	
	public String reverseString(String input){
		char c[] = input.toCharArray();
		char  temp;
		for(int i=0, j =c.length-1 ; i<c.length/2;i++,j-- ){
		      temp = c[i];
		      c[i] = c[j];
		      c[j] = temp;
		}
		return  String.valueOf(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString  r = new ReverseString();
		System.out.println(r.reverseString("input"));
		
	}

}

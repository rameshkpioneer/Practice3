package ram.practice.collectio;

public class StringReverse {

	
	
	public StringReverse(){
		
	}
	
	public String reverseString(String inputString){
		String result ="";
		if( inputString.length() == 1){
			result = inputString;
		}else{
			result += inputString.charAt(inputString.length() - 1)+ reverseString(inputString.substring(0, inputString.length()-1));
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringReverse s = new StringReverse();
	System.out.println(s.reverseString("Ramesh"));
	
	
	}

}

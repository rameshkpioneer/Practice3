package ram.practice.collectio;

public class SingleTon {

	private static SingleTon s = null;
	
	String r ;
	private SingleTon(){
		
	}
	
	public static SingleTon getInstance(){
		
		if ( s == null){
			s =  new SingleTon();
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

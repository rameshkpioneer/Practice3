package ram.practice.collectio;

public class SingleTon {

	private static SingleTon s = null;
	
	private SingleTon(){
		
	}
	
	public static SingleTon getInstance(){
		
		if ( s == null){
			return new SingleTon();
		}else{
			return s;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

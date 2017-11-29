package ram.practice.collectio;

public class SingleTonBillPough {

	private SingleTonBillPough(){
		
	}
	
	private static class BillPough{
		private  static SingleTonBillPough s = new SingleTonBillPough();
	 }
	
	public static SingleTonBillPough getSingleTonInstance(){
		return  BillPough.s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

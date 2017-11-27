package ram.practice.collectio;

import java.util.Arrays;

public class MyArrayList {

	
	Object  arr[] ;
	int capacity = 3;
	int count = 0;
	public MyArrayList(){
		arr = new Object[capacity];
	}
	
	public MyArrayList(int cap){
		this.capacity = cap;
		arr = new Object[capacity];
	}
	
	
	public void add(Object o){
		if ( count < arr.length){
			arr[count] = o;
		}else{
		 arr = Arrays.copyOf(arr, capacity*2);
		}
		count ++;
	}
	
	public void  get(){
		
	}
	
	public String toString(){
		
		return "TEST";
	}
	public void remove(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyArrayList ma = new MyArrayList();
		ma.add("RAmesh");
		ma.add("Rajesh");
		ma.add("Rajeev");
		System.out.println("  "+ ma);
		
		
		
	}

}

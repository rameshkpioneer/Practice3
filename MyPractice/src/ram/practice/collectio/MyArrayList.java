package ram.practice.collectio;

import java.util.Arrays;

public class MyArrayList {

	
	Object  myStore[] ;
	int capacity =10;
	int actSize = 0;
	
	public MyArrayList(){
		
		myStore = new Object[capacity];
		
	}
	
	public MyArrayList(int cap){
		
		this.capacity = cap;
		myStore = new Object[capacity];
	
	}
	
	
	public void add(Object o){
		
		if ( myStore.length - actSize <=5 ){
			 myStore = Arrays.copyOf(myStore, capacity*2);
		}
		
		myStore[actSize ++] = o;
	}
	
	public Object  get(int index){
		return myStore[index];
	}
	
	
	public Object remove(int index){
		
		if(index < actSize){
			
	            Object obj = myStore[index];
	            myStore[index] = null;
	            int tmp = index;
	            
	            while(tmp < actSize-1){
	                myStore[tmp] = myStore[tmp+1];
	                myStore[tmp+1] = null;
	                tmp++;
	            }
	            
	            actSize--;
	            return obj;
	            
	        } else {
	        	
	            throw new ArrayIndexOutOfBoundsException();
	            
	        }
	}
	
	public int size(){
		return actSize;
	}
	
	public String toString(){
		return Arrays.toString(myStore);
	}
	
	public void display() {
        for (int i = 0; i < actSize; i++) {
               System.out.print(myStore[i] + " ");
        }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyArrayList ma = new MyArrayList();
		ma.add(0);
		ma.add(1);
		ma.add(2);
		ma.add(2);
		ma.add(2);
		ma.add(2);
		ma.add(2);
		
		
		System.out.println(" Length of  "+ ma.size());
		System.out.println(" Length after removing an element  "+ ma.size());
		System.out.println(" Indexed Element in the array  "+ ma.get(0));
		
		
		ma.display(); 

	}

}

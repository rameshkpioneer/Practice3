package ram.practice.collectio;

import java.util.Arrays;

public class Sorting {

	
	public Sorting(){
		
		
	}
	
	public void Bubblesort(int arr[]){
		int temp;
		boolean swapped;
		for(int i=0; i<arr.length ; i++){
			
		     swapped = false;
				for(int j=0; j< arr.length-i-1 ; j++){
					if(arr[j]>arr[j+1]){
						temp =arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swapped = true;
					}
			}
				if(swapped == false){
					break;
				}
		}
		System.out.println(" The Sorted Array"+Arrays.toString(arr));
	}
	
	public void selectionSort(int sarr[]){
		int temp;
		for(int i =0; i<sarr.length-1; i++){
			int e = i;
			for(int j=i; j<sarr.length ; j++){
				if( sarr[e] > sarr[j]){
					e = j;
				}
			}
			temp = sarr[e];
			sarr[e] = sarr[i];
			sarr[i] = temp;
		}
		System.out.println("Sorted elements - Selection ..."+ Arrays.toString(sarr));
	}
	public void swap(int a, int b){
		int temp;
		temp =a;
		a = b;
		b=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting sort = new Sorting();
		int[] a = {10,80,2,70};
		sort.Bubblesort(a);
		//sort.selectionSort(a);

	}

}

package Medha_Assignment_Programs;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumbersInArray {
//{3,2,4,3,6,2,8,4}  -- 6,8
	public void uniqueNum(int[] array){
		
		//List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++){
			boolean unique = false;
			for(int j=0;j<array.length;i++){
				if(i!=j){
					if(array[i]==array[j]){ 
						unique=true;
						break;
						}
					}
			}
				if(unique==false){
					System.out.println(array[i]);
}
				
			}
		
	}
	public static void main(String[] args) {

		UniqueNumbersInArray uniqueArr = new UniqueNumbersInArray();
		int [] array= {3,2,4,3,6,2,8,4};
		uniqueArr.uniqueNum(array);
	}

}

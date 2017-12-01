// replace given pattern in string without inbuilt function

package Medha_Assignment_Programs;

public class StrReplNoInbuiltFunc {

	
	public void strReplace(String originalStr,String repStr,String newStr){
		
		String [] array = originalStr.split(" ");
		for(int i=0;i<array.length;i++){
			if(array[i]!=null && array[i].equals(repStr)){
				array[i]=newStr;
				break;
			}
		}
		for(String str :array){
			System.out.print(str + " ");
		}
	}
	public static void main(String[] args) {

		StrReplNoInbuiltFunc replace = new StrReplNoInbuiltFunc();
		replace.strReplace("hello how are you", "are", "srilatha");
	}
//hhhhffffssssfgyyyy
}

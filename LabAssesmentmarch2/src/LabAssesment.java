
public class LabAssesment {
	public static void main(String args[]){
		isGoofy(25);
		
	}
	
	public static boolean isGoofy(int num){
		
		int number = num;
		int next = 0; 
		int check = number;
		int count = 0;
		int sum = 0;
		
		System.out.println(number);
		while (number > 10){
			number = number/10;
			count += 1;
			int []arr = new int[count];
		for (int i = 0; i<count;i++){
				arr[i] = new int[count]{number};
				
			}
		}
		for (int i = 0; i<count;i++){
			if (check % arr[i]== 0){
				sum = sum + [arr[i]];
			}
		}
		
		if (sum % 2 ==1){
			return true;
		}
		return false;		
		
		
	}
	public static int[] getSomeGoofyNumbers(int count){
		int total = 0;
		int increment = 1;
		int[] hi = new int[count];
		while(total!=count){
			if (isGoofy(increment)){
				hi[total] = increment;
				total += 1;
			}
		}
		return total;
	}
	

}

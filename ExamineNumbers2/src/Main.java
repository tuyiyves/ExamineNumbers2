import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("how many numbers do you have?");
		int totalNumbers = console.nextInt();
		
		int negatives =0;
		double sum = 0.0;
		 
		for(int i=1;i<=totalNumbers; i++){
			System.out.print("#"+ i+"? ");
			double next= console.nextDouble();
				sum+=next;
			if(next<0){
				negatives++;
			}	
		}
		System.out.println();
		if (totalNumbers<=0){
			System.out.println("no number to avaerage");
		}else{
			double average= sum/totalNumbers;
			System.out.println("average ="+ average);
			
		}
		System.out.println("total negative values is "+ negatives);
		console.close();
	}

}

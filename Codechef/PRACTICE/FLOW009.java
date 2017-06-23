import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class FLOW009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(br.readLine());
		
		while(testCases-- != 0){
			
			String s[] = br.readLine().split(" ");
			int quantity = Integer.parseInt(s[0]);
			int price = Integer.parseInt(s[1]);
			
			double totalExpense;
			
			if(quantity > 1000){
				totalExpense = (double) (0.9*quantity*price);
			}
			else
				totalExpense = (double)quantity*price;
			
			System.out.printf("%.6f\n",totalExpense);
		}

	}

}

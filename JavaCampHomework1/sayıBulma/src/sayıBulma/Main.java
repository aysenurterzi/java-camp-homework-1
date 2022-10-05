package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int [] numbers= new int [] {1,2,5,7,9,0};
		int found =0;
		boolean varMı=false;
		
		
		  for (int number:numbers) {
			  if(number==found) {
				  varMı=true;
			  break;
			  }
		  }
		  if (varMı) {
			  System.out.println("Var");
			  } 
		  else {
			  System.out.println("Yok");
		  }
		 
		/*
		 * for (int i = 1; i < numbers.length; i++) { if (numbers[i] == found) {
		 * System.out.println("Aradığın sayı var."); return; }
		 * 
		 * } System.out.println("Aradığın sayı yok.");
		 */
	}

}

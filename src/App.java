import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random r = new Random(100);
		
		/*
		ArrayBox<String> box = new ArrayBox<String>(10);
		
		box.add("CS130");
		box.add("CS131");
		box.add("CS215");
		System.out.println(box.getCurrentSize());
		box.remove();
		System.out.println(box.getCurrentSize());
		*/
	
		ArrayBox<Double> doublesBox = new ArrayBox<Double>(10);
		
		boolean result;
	
		for(int i=0;i<20;i++){
			result = doublesBox.add(r.nextDouble()*100);
			System.out.println(result);	
		}
	
		double dResult;
		
		for(int i=0;i<doublesBox.getCapacity()-1;i++) {
			dResult = doublesBox.remove();
			System.out.println(dResult);	
		}
		
	}//end main

}//end class

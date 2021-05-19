import java.util.ArrayList;

//Challenge 1
public class MyNumber {
	private int number;
	
	public MyNumber() {
		
	}
	
	public MyNumber(int number) {
		this.number = number;
	}
	
	//Stage 1
	public boolean multipleOf3() {
		
		if(this.number % 3 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean multipleOf5() {
		
		if(this.number % 5 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean multipleOf3And5() {
		boolean bool3 = false;
		boolean bool5 = false;
		
		bool3 = multipleOf3();
		bool5 = multipleOf5();
		
		if(bool3 == true && bool5 == true) {
			return true;
		}
		return false;
	}
	
	//Stage 2
	public boolean multipleOf7() {
		
		if(this.number % 7 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean multipleOf11() {
		
		if(this.number % 11 == 0) {
			return true;
		}
		
		return false;
	}
	
	//Rularea programului
	public void run() {
		for(int i = 1; i <= 100; i++) {
			MyNumber n = new MyNumber(i);
			if(n.multipleOf3And5() == true) {
				System.out.print("FizzBuzz, ");
			}else if(n.multipleOf3() == true) {
				System.out.print("Fizz, ");
			}else if(n.multipleOf5() == true) {
				System.out.print("Buzz, ");
			}else if(n.multipleOf7() == true) {
				System.out.print("Rizz, ");
			}else if(n.multipleOf11() == true) {
				System.out.print("Jazz, ");
			}else {
				System.out.print(i + ", ");
			}
		}
	}
	
	//Challenge 2
	public static String compute(int nr) {
		MyNumber n = new MyNumber(nr);
		boolean change = false;
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		String output = nr + " => ";
		String output1 = "(";
		
		if(n.multipleOf3() == true) {
			output = output + "Foo";
			if(change == true) {
				output1 = output1 + ", divisible by 3";
			}else {
				output1 = output1 + "divisible by 3";
				change = true;
			}
		}
		if(n.multipleOf5() == true) {
			output = output + "Bar";
			if(change == true) {
				output1 = output1 + ", divisible by 5";
			}else {
				output1 = output1 + "divisible by 5";
				change = true;
			}
		}
		
		if(n.multipleOf7() == true) {
			output = output + "Qix";
			if(change == true) {
				output1 = output1 + ", divisible by 7";
			}else {
				output1 = output1 + "divisible by 7";
				change = true;
			}
		}
		
		//daca nu este multiplu de niciun numar, afisam numarul respectiv
		if(change == false) {
			while(nr != 0) {
				int c = nr % 10;
				if(c == 3) {
					array2.add(new String("Foo"));
				}else if(c == 5) {
					array2.add(new String("Bar"));
				}else if(c == 7) {
					array2.add(new String("Qix"));
				}
				//Stage 2
				else if(c == 0) {
					array2.add(new String("*"));
					array3.add(new String ("*"));
				}else {
					array3.add(String.valueOf(c));
				}
				
				nr = nr / 10;
			}
			
			//daca numarul contine cel putin una dintre cele trei cifre vom pune string-ul corespunzator acesteia
			if(array2.size() != 0) {
				for(int i = array2.size() - 1; i >=0; i--) {
					output = output + array2.get(i);
				}
			}else {
				for(int i = array3.size() - 1; i >=0; i--) {
					output = output + array3.get(i);
				}
			}
			
		}else {
			while(nr != 0) {
				int c = nr % 10;
				if(c == 3) {
					array2.add(new String("Foo"));
					array.add(new String(", contains 3"));
				}else if(c == 5) {
					array2.add(new String("Bar"));
					array.add(new String(", contains 5"));
				}else if(c == 7) {
					array2.add(new String("Qix"));
					array.add(new String(", contains 7"));
				}
				//Stage 2
				else if(c == 0) {
					array2.add(new String("*"));
				}
				
				nr = nr / 10;
			}
			
			//preluam string-urile corespunzatoare in oridinea inversa (ordinea aparitiei cifrelor de la stanga spre dreapta)
			for(int i = array2.size() - 1; i >= 0; i--) {
				output = output + array2.get(i);
			}
			
			for(int i = array.size() - 1; i >= 0; i--) {
				output1 = output1 + array.get(i);
			}
			
			//construirea string-ului final care va fi afisat
			output = output + " " + output1 + ")";
		}
		
		return output;
	}
	
	public void run2() {
		for(int i = 1; i <= 100; i++) {
			String output = compute(i);
			System.out.println(output);
		}
	}
}

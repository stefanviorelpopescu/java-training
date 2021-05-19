import java.util.ArrayList;

public class Pairs {

	private ArrayList<Integer> array = new ArrayList<Integer>();
	
	public int findPairsOf2() {
		int counter = 0;
		
		for(int i = 0; i < this.array.size() - 1; i++) {
			for(int j = i + 1; j < this.array.size(); j++) {
				if(array.get(i) + array.get(j) == 0) {
					counter++;
					break;
				}
			}
		}
		
		return counter;
	}
	
	public int findPairsOf3() {
		int counter = 0;
		ArrayList<Boolean> arr = new ArrayList <Boolean> ();
		for(int i=0; i < this.array.size(); i++) {
			arr.add(false);
		}
		for(int i = 0; i < this.array.size() - 2; i++) {
			for(int j = i + 1; j < this.array.size() - 1; j++) {
				for(int k = j + 1; k < this.array.size(); k++) {
					if(arr.get(i) == false && arr.get(j) == false && arr.get(k) == false) {
						if(array.get(i) + array.get(j) + array.get(k) == 0) {
							counter++;
							arr.set(i, true);
							arr.set(j, true);
							arr.set(k, true);	
							break;
						}
					}
				}
			}
		}
		
		return counter;
	}
	
	public void run() {
		Pairs p = new Pairs();
		p.getArray().add(new Integer(5));
		p.getArray().add(new Integer(9));
		p.getArray().add(new Integer(-5));
		p.getArray().add(new Integer(7));
		p.getArray().add(new Integer(-5));
		
		int counter = p.findPairsOf2();
		
		String result = "[";
	
		for(int i = 0; i < p.getArray().size(); i++) {
			result = result + p.getArray().get(i);	
			if(i != p.getArray().size()-1) {
				result = result + ", ";
			}
		}
		
		
		result = result + "]" + " => " + counter;
		
		System.out.println(result);
	}
	
	public void run2() {
		Pairs p = new Pairs();
		p.getArray().add(new Integer(-1));
		p.getArray().add(new Integer(-1));
		p.getArray().add(new Integer(-1));
		p.getArray().add(new Integer(2));
		
		int counter = p.findPairsOf3();
		
		String result = "[";
	
		for(int i = 0; i < p.getArray().size(); i++) {
			result = result + p.getArray().get(i);	
			if(i != p.getArray().size()-1) {
				result = result + ", ";
			}
		}
		
		
		result = result + "]" + " => " + counter;
		
		System.out.println(result);
	}
	
	public ArrayList<Integer> getArray(){
		return this.array;
	}
	
}

/*
 * 510561 Rahman	SM Rizwanur
 * 509699 Ahmed		Mobasser
 * 509701 Ahmed		Asif
 * 510459 Maruf		SM
 * 463344 Das  		Ashik
 * 451280 Rahman	Md. Arifur
 * 552778 Rahman	Md Arifur
 * 562036 Ferdous	Jannatul	
 * */



public class Main {

	public static void main(String[] args) {

        Tree t2 = new Tree(); 
		
		int arr[] = { 5, 7, 8, 15, 20, 21, 13, 18, 11,42 }; //5,7,8,15,20,21,13,18,11,42
		t2.root = t2.insertLevelOrder(arr, t2.root, 0); 
	
		Visitor visitor= new Visitor();
		
		ITree leafCompute= new LeafCompute();		
		//leafCompute.rootNode=t2.root;
		
		ITree nodeCompute= new NodeCompute();
		//nodeCompute.rootNode=t2.root;
		
		t2.accept(visitor);
		leafCompute.accept(visitor);
		nodeCompute.accept(visitor);
		
	   
		
		

	}

}

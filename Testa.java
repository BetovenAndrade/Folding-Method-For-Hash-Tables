public class Testa {
	
	public static void main (String args[]) {
		HashFunctions f= new HashFunctions();
		int[] v= {1,2,3,4,6,7}; //788->85
		//int[] v= {1,2,3,4,6}; //367->60
		//int[] v= {4,5,6,7}; //->11
		//int[] v= {7,8,1,3,4}; //506->01
		System.out.println("Indice pela Dobra: "+f.dobra(v,100));
	}
}


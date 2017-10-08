/*
	Author: Betoven Oliveira de Andrade
	Description: Folding Method (or dobra in Brazilian-PT) for Hash Tables in Java
	First commit in GitHub: 08/10/2017 
*/
public class HashFunctions {
	public int dobra(int[] vetor, int tableSize){
		String i="";
			//Concatenate the key in single String
			for(int cont=0; cont<vetor.length; ++cont){
				i+=vetor[cont];
			}
			//basic contition to stop recursion
			if(Integer.parseInt(i)<tableSize){
					return Integer.parseInt(i);
			}
			int[] dobrado;
			if((vetor.length)%2==0){//se vetor par
					dobrado= new	int[vetor.length/2];
			}else{
				dobrado= new	int[(vetor.length/2)+1];
			}
			
			int inicio=0;
			int fim=vetor.length-1;
			
			for(int cont=dobrado.length-1; cont>=0; --cont){
				if(fim!=inicio){
					dobrado[cont]= (vetor[fim]+vetor[inicio])%10;
				}else{
					dobrado[cont]= vetor[fim];
				}
				inicio++; fim--;
			}
			return dobra(dobrado, tableSize);
		}
}

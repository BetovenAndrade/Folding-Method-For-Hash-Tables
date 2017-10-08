/*
	Author: Betoven Oliveira de Andrade
	Description: Folding Method (or dobra in Brazilian-PT) for Hash Tables in Java
*/
public class HashFunctions {
	public int dobra(int[] vetor, int tableSize){
		String i="";
			//Concatenando a chave em uma única String
			for(int cont=0; cont<vetor.length; ++cont){
				i+=vetor[cont];
			}
			//codição básica, para parada da recursividade
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

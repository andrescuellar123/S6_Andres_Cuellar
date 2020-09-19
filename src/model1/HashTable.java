package model1;


public class HashTable<P> implements IHashTable<P> {

	private Object arr[];

	private int tamanio;

	
	public HashTable(int tam){

		arr= new Object[tam];
		tamanio=tam;
	}


	@Override
	public int funcionHash(int valor) {
		return valor%tamanio;
	}


	@Override
	public void add(int key,P elemento) {

		int poss=funcionHash(key);
		System.out.println("posicion "+poss+" key "+ key);

		Nodo<P> no = new Nodo<P>(elemento, key);

		if(arr[poss]==null) {

			no.setPosition(1);
			arr[poss]=no;

		}else {
			Nodo<P> temp = (Nodo<P>) arr[poss];
			no.setNext(temp);
			no.setPosition(temp.getPosition()+1);
			arr[poss]=no;
		}
		
	}
	@Override
	public boolean remove(int k) {
		
		int compare=0;

		for(int i=0;i<arr.length;i++) {

			Nodo<P> aux = (Nodo<P>) arr[i];

			do {
				aux=aux.getNext();
				compare = aux.getKey();
				if(compare==k) {		
					arr[i]=null;
					return true;
				}

			}while((compare!=k)&&(aux.getNext()!=null));

		}

		return false;
	}

	@Override
	public P getValue(int k) {
		int compare=0;

		for(int i=0;i<arr.length;i++) {

			Nodo<P> temp = (Nodo<P>) arr[i];

			do {
				temp=temp.getNext();
				compare = temp.getKey();
				if(compare==k) {
					return temp.getValor();
				}	
			}while((compare!=k)&&(temp.getNext()!=null));

		}

		return null;
	}


	@Override
	public int count() {
		int count=0;
		for(int i=0;i<arr.length;i++) {

			Nodo<P> aux = (Nodo<P>) arr[i];
			count+=aux.getPosition();

		}

		return count;
	}


	@Override
	public boolean contains(int k) {
		int compare=0;

		for(int i=0;i<arr.length;i++) {

			Nodo<P> temp = (Nodo<P>) arr[i];

			do {
				temp=temp.getNext();
				compare = temp.getKey();
				if(compare==k) {
					return true;
				}

			}while((compare!=k)&&(temp.getNext()!=null));

		}

		return false;
	}





	
	



}

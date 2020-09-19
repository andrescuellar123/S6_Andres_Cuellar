package model1;

public class Nodo<P> {

	private Nodo<P> next;
	P valor;
	
	int key;
	int position;
	
	public Nodo(P valor, int key) {
		this.next=null;
		this.valor=valor;
		this.key=key;
	
	}

	/**
	 * @return the next
	 */
	public Nodo<P>getNext() {
		return next;
	}

	/**
	 * @return the valor
	 */
	public P getValor() {
		return valor;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Nodo<P> next) {
		this.next = next;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(P valor) {
		this.valor = valor;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}


	
	
	
	
	
}

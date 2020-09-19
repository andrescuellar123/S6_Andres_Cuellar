package model1;

public interface IHashTable<P> {
	public int funcionHash(int valor);
	
	public void add(int k,P p);
	
	public P getValue(int k) ;
	
	public int count();
	
	public boolean remove(int k) ;
	
	public boolean contains(int k);
}

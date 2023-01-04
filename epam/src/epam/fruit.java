package epam;

public class fruit { 
 void eat(String name,String taste) {
	System.out.println("fruit has taste and size ");
}
 
 class berry extends fruit {
	void eat(String name,String taste) {
		System.out.println( name+"is very" +taste);
		
	}
}
	
	




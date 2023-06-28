import java.util.ArrayList;
import java.util.List;


public class Product {
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.setName(name);
		this.setPrice(price);
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

class Test{
	public static void main(String args[]) {
	List<Product> productList = new ArrayList<Product>();
	
	productList.add(new Product(1,"hp",1000f));
	productList.add(new Product(2,"dell",2000f));
	productList.add(new Product(3,"lenevo",3000f));
	productList.add(new Product(4,"sony",4000f));
	
	 productList.stream()  
            .filter((p) -> p.getPrice()  > 3000f )// filtering data
    
            .forEach(p -> System.out.println(p.getName()+" "+p.getPrice())); 
	
}
}
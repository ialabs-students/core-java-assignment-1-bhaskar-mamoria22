import java.util.*;

public class ProductRepository {

	private List<Product> pro;
	ProductRepository(){
		pro = new ArrayList<Product>();
		Product pr1 = new Product(101,"Olive Oil",187.00,"Grocery");
		Product pr2 = new Product(102,"T Shirt",700.00,"Clothing");
		Product pr3 = new Product(103,"Cars",700.00,"Lifestyle");
		Product pr4 = new Product(104,"Hotels",32000.00,"Luxury");
		Product pr5 = new Product(105,"Pizza",100.00,"Food");
		Product pr6 = new Product(106,"Coffee",300.00,"Vanilla Frappe");
		pro.add(pr1);
		pro.add(pr2);
		pro.add(pr3);
		pro.add(pr4);
		pro.add(pr5);
		pro.add(pr6);
	}
	public List<Product> getList(){
		return pro;
	}
}
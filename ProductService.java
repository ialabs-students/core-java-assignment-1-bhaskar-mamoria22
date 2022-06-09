import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {

	ProductRepository productRepository = new ProductRepository();
	List<Product> pro = productRepository.getList();
	public ProductService() {
		
	}
	String findNameByCode(int productCode) { 
		for(Product product : pro) {
			if(product.getProductCode()==productCode) {
				return product.getName();
			}
		}
		 return null;
	}
	
	
	Product findMaxPriceProduct(String category) {
		List<Product> pro1 = new ArrayList<Product>();
		for(Product product: pro) {
			if(product.getCategory()==category) {
				pro1.add(product);
			}
		}
		if(pro1.isEmpty()) {
			return null;
		}
		Product productMax = pro1.stream().max(Comparator.comparingDouble(Product::getPrice)).get();
		return productMax;
	}
	
	
	ArrayList<Product> getProductsByCategory(String category) {
		ArrayList<Product> pro1 = new ArrayList<Product>();
		for(Product product: pro) {
			if(product.getCategory()==category) {
				pro1.add(product);
			}
		}
		if(pro1.isEmpty()) {
			return null;
		}
		return pro1;
	}
	public static void main(String[] args) {
		ProductService product = new ProductService();
		System.out.println(product.findNameByCode(102));
		System.out.println(product.findMaxPriceProduct("Lifestyle"));
		System.out.println(product.findMaxPriceProduct("Grocery"));
		System.out.println(product.findMaxPriceProduct("Clothing"));
		System.out.println(product.findMaxPriceProduct("Food"));
		System.out.println(product.getProductsByCategory("Luxury"));
		System.out.println(product.getProductsByCategory("Luxury"));
		System.out.println(product.getProductsByCategory("Food"));
		System.out.println(product.getProductsByCategory("Vanilla Frappe"));
	}
	
}

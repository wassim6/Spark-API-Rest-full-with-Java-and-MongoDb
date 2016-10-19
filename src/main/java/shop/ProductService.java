package shop;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class ProductService {

	
	MongoClient client = new MongoClient("localhost", 27017); //connect to mongodb
	Datastore datastore = new Morphia().createDatastore(client, "shop"); //select shop collection
	
	public String addProduct(Product product){
		datastore.save(product);
		return "product added";
	}
	
	public List<Product> getAllProduct(){
		List<Product> list = datastore.find(Product.class).asList();
		if(list != null){
			return list;
		}
		return null;
	}
	
}

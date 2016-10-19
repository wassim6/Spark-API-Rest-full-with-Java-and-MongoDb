package shop;

import static spark.Spark.get;
import static spark.Spark.post;

import com.google.gson.Gson;

public class Api {
	
	public static ProductService productService = new ProductService();
	
	public static void main(String[] args){
		
		Gson gson = new Gson();
		
        post("/add", (req, res) -> {
        		res.type("application/json");
        		Product product = gson.fromJson(req.body(), Product.class);
        		return productService.addProduct(product);
        }, gson ::toJson);
        
        get("/", (req, res) -> {
    		res.type("application/json");
    		return productService.getAllProduct();
        }, gson ::toJson);
	}
}

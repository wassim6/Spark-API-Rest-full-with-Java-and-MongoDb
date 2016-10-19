package shop;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Product {
	
	@Id
	private ObjectId id;
	private String name;
	private Float price;
	
	public Product(){
		
	}
	
	public Product(String name, Float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	
	
}

package fr.istic.syr.tp7;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

public class Article {
	
	@Id
	private ObjectId id;
	private String name;
	private int stars;
	@Reference
	private List<Person> buyers;
	
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
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public List<Person> getBuyers() {
		return buyers;
	}
	public void setBuyers(List<Person> buyers) {
		this.buyers = buyers;
	}
	
	
}

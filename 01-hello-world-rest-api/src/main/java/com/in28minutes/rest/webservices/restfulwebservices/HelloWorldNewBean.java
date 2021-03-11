package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloWorldNewBean {

	private String message;
	private Item item;
	
	public HelloWorldNewBean(String message) {
		//test
		this.item = new Item();
		item.id="10";
		this.message = message;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

}

package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prince Tiwari
 *@creation_date 25th Sep 2019 4.44pm
 *@Modification_date 25th Sep 2019 4.44pm
 *@version 1.0
 *@copyright Zensar Technologies. All rights reserved.
 *@description It is a persistent class
 *             it represents database table PRODUCT1
 *             it is POJO class.
 */
@Entity
@Table(name = "product1")
public class Product {
	@Id
	@Column(name = "id")
	private int productId;
	private String name;
	private String brand;
	private int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}

public Product(int productId, String name, String brand, int price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}

}

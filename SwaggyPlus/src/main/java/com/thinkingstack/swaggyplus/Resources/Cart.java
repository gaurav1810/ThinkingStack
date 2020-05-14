package com.thinkingstack.swaggyplus.Resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue
	private Long cartId;
	private List<dish> dishes;
	private Double totalAmount;
	public Cart(Long cartId, List<dish> dishes, Double totalAmount) {
		
		this.cartId = cartId;
		this.dishes = dishes;
		this.totalAmount = totalAmount;
	}
	public Cart() {
		
	}
	public Long getcartId() {
		return cartId;
	}
	public void setcartId(Long cartId) {
		this.cartId = cartId;
	}
	public List<dish> getdishes() {
		return dishes;
	}
	public void setdishes(List<dish> dishes) {
		this.dishes = dishes;
	}
	public Double gettotalAmount() {
		return totalAmount;
	}
	public void settotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", dishes=" + dishes + ", TotalAmount=" + totalAmount + "]";
	}
}

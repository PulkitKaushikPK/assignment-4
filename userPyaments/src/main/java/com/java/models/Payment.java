package com.java.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long paymentId;
	private Long userId;
	private Long totalAmount;
	private Long discount;
	private Long finalAmount;
	private Boolean paid;
	public Payment(Long paymentId, Long userId, Long totalAmount, Long discount, Long finalAmount, Boolean paid) {
		super();
		this.paymentId = paymentId;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.discount = discount;
		this.finalAmount = finalAmount;
		this.paid = paid;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", userId=" + userId + ", totalAmount=" + totalAmount + ", discount="
				+ discount + ", finalAmount=" + finalAmount + ", paid=" + paid + "]";
	}
	
	public Payment() {
		
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public Long getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(Long finalAmount) {
		this.finalAmount = finalAmount;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

}

package com.wildcards.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PaymentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymentInfo_id")
	private int paymentInfoId;
	
	@OneToOne(mappedBy = "paymentInfo", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JsonBackReference
	private Users u;
	
	@Column
	private String billingAddress;
	
	@Column
	private Long cardNumber;

	public int getPaymentInfoId() {
		return paymentInfoId;
	}

	public void setPaymentInfoId(int paymentInfoId) {
		this.paymentInfoId = paymentInfoId;
	}

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billingAddress == null) ? 0 : billingAddress.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + paymentInfoId;
		result = prime * result + ((u == null) ? 0 : u.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentInfo other = (PaymentInfo) obj;
		if (billingAddress == null) {
			if (other.billingAddress != null)
				return false;
		} else if (!billingAddress.equals(other.billingAddress))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (paymentInfoId != other.paymentInfoId)
			return false;
		if (u == null) {
			if (other.u != null)
				return false;
		} else if (!u.equals(other.u))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentInfo [paymentInfoId=" + paymentInfoId + ", u=" + u + ", billingAddress=" + billingAddress
				+ ", cardNumber=" + cardNumber + "]";
	}

	public PaymentInfo(int paymentInfoId, Users u, String billingAddress, Long cardNumber) {
		super();
		this.paymentInfoId = paymentInfoId;
		this.u = u;
		this.billingAddress = billingAddress;
		this.cardNumber = cardNumber;
	}

	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

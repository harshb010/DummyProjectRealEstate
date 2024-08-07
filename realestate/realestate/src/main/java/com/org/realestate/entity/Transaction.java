package com.org.realestate.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Users buyer;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Builder seller;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    private LocalDateTime transactionDate;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(Long transactionId, Property property, Users buyer, Builder seller, Agent agent,
			LocalDateTime transactionDate, Double amount, TransactionStatus status) {
		super();
		this.transactionId = transactionId;
		this.property = property;
		this.buyer = buyer;
		this.seller = seller;
		this.agent = agent;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.status = status;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Users getBuyer() {
		return buyer;
	}

	public void setBuyer(Users buyer) {
		this.buyer = buyer;
	}

	public Builder getSeller() {
		return seller;
	}

	public void setSeller(Builder seller) {
		this.seller = seller;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", property=" + property + ", buyer=" + buyer
				+ ", seller=" + seller + ", agent=" + agent + ", transactionDate=" + transactionDate + ", amount="
				+ amount + ", status=" + status + "]";
	}
    
    
	    
}

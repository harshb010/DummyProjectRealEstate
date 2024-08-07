package com.org.realestate.entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="property")
public class Property {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long propertyId;

	    private String address;
	    
	    private Double price;
	    
	    private Double size;
	    
	    private String type;
	    
	    @Enumerated(EnumType.STRING)
	    private PropertyStatus status;
	    
	    private String description;
	    
	    private LocalDateTime listedDate;

	    @ManyToOne
	    @JoinColumn(name = "builder_id")
	    private Builder builder;

	    @ManyToOne
	    @JoinColumn(name = "agent_id")
	    private Agent agent;


	    @OneToMany(mappedBy = "property")
	    private Set<Appointment> appointments;

	    @OneToMany(mappedBy = "property")
	    private Set<Review> reviews;

	    @OneToMany(mappedBy = "property")
	    private Set<Transaction> transactions;

		public Property() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Property(Long propertyId, String address, Double price, Double size, String type, PropertyStatus status,
				String description, LocalDateTime listedDate, Builder builder, Agent agent,
				Set<Appointment> appointments, Set<Review> reviews, Set<Transaction> transactions) {
			super();
			this.propertyId = propertyId;
			this.address = address;
			this.price = price;
			this.size = size;
			this.type = type;
			this.status = status;
			this.description = description;
			this.listedDate = listedDate;
			this.builder = builder;
			this.agent = agent;
			this.appointments = appointments;
			this.reviews = reviews;
			this.transactions = transactions;
		}

		public Long getPropertyId() {
			return propertyId;
		}

		public void setPropertyId(Long propertyId) {
			this.propertyId = propertyId;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Double getSize() {
			return size;
		}

		public void setSize(Double size) {
			this.size = size;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public PropertyStatus getStatus() {
			return status;
		}

		public void setStatus(PropertyStatus status) {
			this.status = status;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDateTime getListedDate() {
			return listedDate;
		}

		public void setListedDate(LocalDateTime listedDate) {
			this.listedDate = listedDate;
		}

		public Builder getBuilder() {
			return builder;
		}

		public void setBuilder(Builder builder) {
			this.builder = builder;
		}

		public Agent getAgent() {
			return agent;
		}

		public void setAgent(Agent agent) {
			this.agent = agent;
		}

		public Set<Appointment> getAppointments() {
			return appointments;
		}

		public void setAppointments(Set<Appointment> appointments) {
			this.appointments = appointments;
		}

		public Set<Review> getReviews() {
			return reviews;
		}

		public void setReviews(Set<Review> reviews) {
			this.reviews = reviews;
		}

		public Set<Transaction> getTransactions() {
			return transactions;
		}

		public void setTransactions(Set<Transaction> transactions) {
			this.transactions = transactions;
		}

		@Override
		public String toString() {
			return "Property [propertyId=" + propertyId + ", address=" + address + ", price=" + price + ", size=" + size
					+ ", type=" + type + ", status=" + status + ", description=" + description + ", listedDate="
					+ listedDate + ", builder=" + builder + ", agent=" + agent + ", appointments=" + appointments
					+ ", reviews=" + reviews + ", transactions=" + transactions + "]";
		}

		
}

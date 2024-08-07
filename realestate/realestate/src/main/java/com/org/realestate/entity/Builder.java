package com.org.realestate.entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="builder")
public class Builder {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long builderId;

	    private String name;
	    
	    private String companyName;
	    
	    @Column(unique = true)
	    private String email;
	    
	    private String phoneNumber;
	    
	    private String address;
	    
	    private String specialization;
	    
	    private String website;
	    
	    private LocalDateTime createdAt;
	    
	    private LocalDateTime updatedAt;

	    @OneToMany(mappedBy = "builder")
	    private Set<Property> properties;

	    @OneToMany(mappedBy = "builder")
	    private Set<Review> reviews;

		public Builder() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Builder(Long builderId, String name, String companyName, String email, String phoneNumber,
				String address, String specialization, String website, LocalDateTime createdAt, LocalDateTime updatedAt,
				Set<Property> properties, Set<Review> reviews) {
			super();
			this.builderId = builderId;
			this.name = name;
			this.companyName = companyName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.specialization = specialization;
			this.website = website;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.properties = properties;
			this.reviews = reviews;
		}

		public Long getBuilderId() {
			return builderId;
		}

		public void setBuilderId(Long builderId) {
			this.builderId = builderId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Set<Property> getProperties() {
			return properties;
		}

		public void setProperties(Set<Property> properties) {
			this.properties = properties;
		}

		public Set<Review> getReviews() {
			return reviews;
		}

		public void setReviews(Set<Review> reviews) {
			this.reviews = reviews;
		}

		@Override
		public String toString() {
			return "Builder [builderId=" + builderId + ", name=" + name + ", companyName=" + companyName + ", email="
					+ email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", specialization="
					+ specialization + ", website=" + website + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
					+ ", properties=" + properties + ", reviews=" + reviews + "]";
		}

	    
}


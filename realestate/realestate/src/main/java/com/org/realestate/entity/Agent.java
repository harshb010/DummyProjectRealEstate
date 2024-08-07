package com.org.realestate.entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="agent")
public class Agent {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentId;

    private String name;
    
    @Column(unique = true)
    private String email;
    
    private String phoneNumber;
    
    @Column(unique = true)
    private String licenseNumber;
    
    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;
    
    private String specialization;
    
    private String address;
    
    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "agent")
    private Set<Property> properties;


    @OneToMany(mappedBy = "agent")
    private Set<Appointment> appointments;

    @OneToMany(mappedBy = "agent")
    private Set<Review> reviews;

    @OneToMany(mappedBy = "agent")
    private Set<Transaction> transactions;

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(Long agentId, String name, String email, String phoneNumber, String licenseNumber, Agency agency,
			String specialization, String address, LocalDateTime createdAt, LocalDateTime updatedAt,
			Set<Property> properties, Set<Appointment> appointments, Set<Review> reviews,
			Set<Transaction> transactions) {
		super();
		this.agentId = agentId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.licenseNumber = licenseNumber;
		this.agency = agency;
		this.specialization = specialization;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.properties = properties;
		this.appointments = appointments;
		this.reviews = reviews;
		this.transactions = transactions;
	}

	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "Agent [agentId=" + agentId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", licenseNumber=" + licenseNumber + ", agency=" + agency + ", specialization=" + specialization
				+ ", address=" + address + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", properties="
				+ properties + ", appointments=" + appointments + ", reviews=" + reviews + ", transactions="
				+ transactions + "]";
	}
    
    
}

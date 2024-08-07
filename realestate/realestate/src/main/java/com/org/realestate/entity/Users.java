package com.org.realestate.entity;


import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="user")
public class Users {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    private String name;
	    
	    @Column(unique = true)
	    private String email;
	    
	    private String password;
	    
	    @Column(unique = true)
	    private String phoneNumber;
	    
	    private String address;
	    
	    @Enumerated(EnumType.STRING)
	    private UserRole role; // Consider using an Enum for roles
	    
	    private LocalDateTime createdAt;
	    
	    private LocalDateTime updatedAt;


	    @OneToMany(mappedBy = "user")
	    private Set<Appointment> appointments;


		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Users(Long userId, String name, String email, String password, String phoneNumber, String address,
				UserRole role, LocalDateTime createdAt, LocalDateTime updatedAt, Set<Appointment> appointments) {
			super();
			this.userId = userId;
			this.name = name;
			this.email = email;
			this.password = password;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.role = role;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.appointments = appointments;
		}


		public Long getUserId() {
			return userId;
		}


		public void setUserId(Long userId) {
			this.userId = userId;
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


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
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


		public UserRole getRole() {
			return role;
		}


		public void setRole(UserRole role) {
			this.role = role;
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


		public Set<Appointment> getAppointments() {
			return appointments;
		}


		public void setAppointments(Set<Appointment> appointments) {
			this.appointments = appointments;
		}


		@Override
		public String toString() {
			return "Users [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
					+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", role=" + role + ", createdAt="
					+ createdAt + ", updatedAt=" + updatedAt + ", appointments=" + appointments + "]";
		}


		
	    
	
}

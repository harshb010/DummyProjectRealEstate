package com.org.realestate.entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="agency")
public class Agency {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long agencyId;

	    private String name;
	    
	    private String address;
	    
	    private String phoneNumber;
	    
	    private String email;
	    
	    private LocalDateTime createdAt;
	    
	    private LocalDateTime updatedAt;

	    @OneToMany(mappedBy = "agency")
	    private Set<Agent> agents;

		public Agency() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Agency(Long agencyId, String name, String address, String phoneNumber, String email,
				LocalDateTime createdAt, LocalDateTime updatedAt, Set<Agent> agents) {
			super();
			this.agencyId = agencyId;
			this.name = name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.agents = agents;
		}

		public Long getAgencyId() {
			return agencyId;
		}

		public void setAgencyId(Long agencyId) {
			this.agencyId = agencyId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public Set<Agent> getAgents() {
			return agents;
		}

		public void setAgents(Set<Agent> agents) {
			this.agents = agents;
		}

		@Override
		public String toString() {
			return "Agency [agencyId=" + agencyId + ", name=" + name + ", address=" + address + ", phoneNumber="
					+ phoneNumber + ", email=" + email + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
					+ ", agents=" + agents + "]";
		}
	    
	    
}

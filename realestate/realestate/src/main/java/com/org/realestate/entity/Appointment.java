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
@Table(name="appointment")
public class Appointment {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long appointmentId;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private Users user;

	    @ManyToOne
	    @JoinColumn(name = "agent_id")
	    private Agent agent;

	    @ManyToOne
	    @JoinColumn(name = "property_id")
	    private Property property;

	    private LocalDateTime scheduledDate;

	    @Enumerated(EnumType.STRING)
	    private AppointmentStatus status;

		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Appointment(Long appointmentId, Users user, Agent agent, Property property, LocalDateTime scheduledDate,
				AppointmentStatus status) {
			super();
			this.appointmentId = appointmentId;
			this.user = user;
			this.agent = agent;
			this.property = property;
			this.scheduledDate = scheduledDate;
			this.status = status;
		}

		public Long getAppointmentId() {
			return appointmentId;
		}

		public void setAppointmentId(Long appointmentId) {
			this.appointmentId = appointmentId;
		}

		public Users getUser() {
			return user;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public Agent getAgent() {
			return agent;
		}

		public void setAgent(Agent agent) {
			this.agent = agent;
		}

		public Property getProperty() {
			return property;
		}

		public void setProperty(Property property) {
			this.property = property;
		}

		public LocalDateTime getScheduledDate() {
			return scheduledDate;
		}

		public void setScheduledDate(LocalDateTime scheduledDate) {
			this.scheduledDate = scheduledDate;
		}

		public AppointmentStatus getStatus() {
			return status;
		}

		public void setStatus(AppointmentStatus status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Appointment [appointmentId=" + appointmentId + ", user=" + user + ", agent=" + agent + ", property="
					+ property + ", scheduledDate=" + scheduledDate + ", status=" + status + "]";
		}
	    
	    

	    
	    
}

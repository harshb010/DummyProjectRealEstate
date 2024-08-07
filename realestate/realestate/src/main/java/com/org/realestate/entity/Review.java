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
@Table(name="review")
public class Review {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long reviewId;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private Users user;

	    @ManyToOne
	    @JoinColumn(name = "agent_id")
	    private Agent agent;

	    @ManyToOne
	    @JoinColumn(name = "builder_id")
	    private Builder builder;

	    @ManyToOne
	    @JoinColumn(name = "property_id")
	    private Property property;

	    @Enumerated(EnumType.STRING)
	    private ReviewRating rating;
	    
	    private String comment;
	    
	    private LocalDateTime reviewDate;

		public Review() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Review(Long reviewId, Users user, Agent agent, Builder builder, Property property, ReviewRating rating,
				String comment, LocalDateTime reviewDate) {
			super();
			this.reviewId = reviewId;
			this.user = user;
			this.agent = agent;
			this.builder = builder;
			this.property = property;
			this.rating = rating;
			this.comment = comment;
			this.reviewDate = reviewDate;
		}

		public Long getReviewId() {
			return reviewId;
		}

		public void setReviewId(Long reviewId) {
			this.reviewId = reviewId;
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

		public Builder getBuilder() {
			return builder;
		}

		public void setBuilder(Builder builder) {
			this.builder = builder;
		}

		public Property getProperty() {
			return property;
		}

		public void setProperty(Property property) {
			this.property = property;
		}

		public ReviewRating getRating() {
			return rating;
		}

		public void setRating(ReviewRating rating) {
			this.rating = rating;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public LocalDateTime getReviewDate() {
			return reviewDate;
		}

		public void setReviewDate(LocalDateTime reviewDate) {
			this.reviewDate = reviewDate;
		}

		@Override
		public String toString() {
			return "Review [reviewId=" + reviewId + ", user=" + user + ", agent=" + agent + ", builder=" + builder
					+ ", property=" + property + ", rating=" + rating + ", comment=" + comment + ", reviewDate="
					+ reviewDate + "]";
		}

	
}

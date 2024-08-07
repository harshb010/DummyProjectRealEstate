package com.org.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.realestate.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}

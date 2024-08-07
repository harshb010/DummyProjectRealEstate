package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Appointment;
import com.org.realestate.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> findById(Long id) {
        return appointmentRepository.findById(id);
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }
}

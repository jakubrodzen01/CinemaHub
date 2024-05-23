package com.example.ztpai.service;

import com.example.ztpai.entities.Availability;
import com.example.ztpai.repository.AvailabilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AvailabilityService {
    public final AvailabilityRepository availabilityRepository;

    public void addAvailability(Availability availability) {

        availabilityRepository.save(availability);
    }

    public boolean existsById(UUID uuid) {
        return availabilityRepository.existsById(uuid);
    }

    public List<Availability> getAll() {
        return availabilityRepository.findAll();
    }

    public Availability getById(UUID uuid) {
        return availabilityRepository.findById(uuid).orElse(null);
    }
}

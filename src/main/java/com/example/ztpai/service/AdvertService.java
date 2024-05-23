package com.example.ztpai.service;

import com.example.ztpai.entities.Advert;
import com.example.ztpai.repository.AdvertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AdvertService {
    private final AdvertRepository advertRepository;

    public boolean existsById(UUID uuid) {
        return advertRepository.existsById(uuid);
    }

    public void addAdvert(Advert advert){
        advertRepository.save(advert);
    }

    public void deleteById(UUID uuid) {
        advertRepository.deleteById(uuid);
    }

    public List<Advert> getAll() {
        return advertRepository.findAll();
    }

    public Advert getById(UUID uuid) {
        return advertRepository.findById(uuid).orElse(null);
    }
}

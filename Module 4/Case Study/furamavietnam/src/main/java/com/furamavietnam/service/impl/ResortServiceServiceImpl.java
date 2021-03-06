package com.furamavietnam.service.impl;

import com.furamavietnam.entity.ResortService;
import com.furamavietnam.repository.IResortServiceRepository;
import com.furamavietnam.service.IResortServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResortServiceServiceImpl implements IResortServiceService {

    @Autowired
    IResortServiceRepository resortServiceRepository;


    @Override
    public List<ResortService> findAll() {
        return resortServiceRepository.findAll();
    }

    @Override
    public Page<ResortService> findAll(Pageable pageable) {
        return resortServiceRepository.findAll(pageable);
    }

    @Override
    public Page<ResortService> findByContaining(String txtSearch, Pageable pageable) {
        return resortServiceRepository.findByContaining(txtSearch, pageable);
    }

    @Override
    public ResortService findById(Long id) {
        return resortServiceRepository.findById(id).orElse(null);
    }

    @Override
    public ResortService save(ResortService resortService) {
        return resortServiceRepository.save(resortService);
    }

    @Override
    public ResortService delete(Long id) {
        ResortService resortService = resortServiceRepository.findById(id).orElse(null);
        resortServiceRepository.deleteById(id);
        
        return resortService;
    }
}

package com.example.gpaie.Entity.Service.Impl;

import com.example.gpaie.Entity.Service.heureSupplService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gpaie.Repository.HeureSupplRepository;

@Service
public class HeureSupplServiceImpl implements heureSupplService {
    private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private HeureSupplRepository avantageRepository;
}

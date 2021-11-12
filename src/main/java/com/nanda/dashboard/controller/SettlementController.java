package com.nanda.dashboard.controller;

import com.nanda.dashboard.entity.Settlement;
import com.nanda.dashboard.repository.SettlementRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/settlement")
public class SettlementController {
    private final SettlementRepository repository;

    public SettlementController(SettlementRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Settlement> findAll(){
        return repository.findAll();
    }
}

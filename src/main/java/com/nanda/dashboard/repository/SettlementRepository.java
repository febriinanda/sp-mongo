package com.nanda.dashboard.repository;

import com.nanda.dashboard.entity.Settlement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SettlementRepository extends MongoRepository<Settlement, String> {
}

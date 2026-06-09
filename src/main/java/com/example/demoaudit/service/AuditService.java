package com.example.demoaudit.service;

import com.example.demoaudit.model.Audit;
import com.example.demoaudit.repository.AuditRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuditService {

    private AuditRepository repository;

    @Autowired
    public AuditService(AuditRepository repository) {

        this.repository = repository;
    }

    public void addAudit(Audit audit) {
       Audit saved = repository.save(audit);

       log.info("Audit added = {}", saved);
    }
}

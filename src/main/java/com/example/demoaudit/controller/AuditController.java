package com.example.demoaudit.controller;

import com.example.demoaudit.model.Audit;
import com.example.demoaudit.service.AuditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audits")
@Slf4j
public class AuditController {

    private AuditService service;

    public AuditController(AuditService auditService) {
        this.service = auditService;
    }

    @RequestMapping(method = RequestMethod.POST, produces = {"application/json"})
    public void addAudit(@RequestBody Audit audit){

       service.addAudit(audit);
    }
}

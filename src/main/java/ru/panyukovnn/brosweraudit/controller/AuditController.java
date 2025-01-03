package ru.panyukovnn.brosweraudit.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.panyukovnn.brosweraudit.dto.AuditEventRequest;
import ru.panyukovnn.brosweraudit.dto.common.CommonRequest;
import ru.panyukovnn.brosweraudit.service.AuditService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/events")
public class AuditController {

    private final AuditService auditService;

    @PostMapping
    public void postEvent(@RequestBody CommonRequest<AuditEventRequest> eventRequest) {
        auditService.saveEvent(eventRequest.getBody());
    }
}

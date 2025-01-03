package ru.panyukovnn.brosweraudit.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.panyukovnn.brosweraudit.dto.AuditEventRequest;
import ru.panyukovnn.brosweraudit.model.AuditEvent;
import ru.panyukovnn.brosweraudit.model.EventType;
import ru.panyukovnn.brosweraudit.repository.AuditRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuditService {

    private final AuditRepository auditRepository;

    public void saveEvent(AuditEventRequest request) {
        AuditEvent auditEvent = AuditEvent.builder()
            .device(request.getDevice())
            .type(EventType.valueOf(request.getType()))
            .title(request.getTitle())
            .payload(request.getPayload())
            .build();

        auditRepository.save(auditEvent);
    }
}

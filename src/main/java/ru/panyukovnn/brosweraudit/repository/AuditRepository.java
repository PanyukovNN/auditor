package ru.panyukovnn.brosweraudit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.panyukovnn.brosweraudit.model.AuditEvent;

import java.util.UUID;

public interface AuditRepository extends JpaRepository<AuditEvent, UUID> {

}

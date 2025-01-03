package ru.panyukovnn.brosweraudit.dto;

import lombok.Data;

@Data
public class AuditEventRequest {

    private String device;
    private String title;
    private String type;
    private String payload;
}

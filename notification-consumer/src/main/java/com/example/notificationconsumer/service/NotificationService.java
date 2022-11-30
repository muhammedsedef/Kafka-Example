package com.example.notificationconsumer.service;

import com.example.notificationconsumer.entity.Notification;
import com.example.notificationconsumer.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void save(Notification notification) {
        Notification savedEntity = notificationRepository.save(notification);
        log.info("NotificationService.save saved Id: {}", savedEntity.getId());
    }


}

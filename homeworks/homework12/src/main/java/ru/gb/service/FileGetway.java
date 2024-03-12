package ru.gb.service;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;


@MessagingGateway(defaultRequestChannel = "messageChannelInput")
public interface FileGetway {

    void writeToFile(@Header(FileHeaders.FILENAME) String fileName, String data);
}

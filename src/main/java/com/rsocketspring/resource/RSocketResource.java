package com.rsocketspring.resource;

import com.rsocketspring.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
@Slf4j
public class RSocketResource {

    @MessageMapping("request-response")
    public Mono<Message> requestResponse(final Message message) {
        log.info("Received request-response: {} ", message);
        return Mono.just(new Message("You said: " + message.getMessage()));
    }
}

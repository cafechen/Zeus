package org.twelveolympians.zeus.account.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageReceiver {
    public void handleMessage(String message) {
        log.info("Received Message:<{}>", message);
    }
}

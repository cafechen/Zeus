package org.twelveolympians.zeus.auth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.twelveolympians.zeus.common.core.entity.vo.Result;
import org.twelveolympians.zeus.auth.config.RabbitMQConfig;
import org.twelveolympians.zeus.auth.message.MessageSender;

@RestController
public class MessageController {

    @Autowired
    private MessageSender messageSender;

    @RequestMapping(method = RequestMethod.GET, value = "/message/{message}")
    public Result sendEvent(@PathVariable String message) {
        messageSender.send(RabbitMQConfig.ROUTING_KEY, message);
        return Result.success();
    }

}
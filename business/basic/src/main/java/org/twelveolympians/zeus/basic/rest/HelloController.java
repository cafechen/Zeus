package org.twelveolympians.zeus.basic.rest;

import org.springframework.web.bind.annotation.*;
import org.twelveolympians.zeus.common.core.entity.vo.Result;

import static org.apache.commons.lang.RandomStringUtils.randomNumeric;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello/{name}")
    public Result hello(@PathVariable String name) {
        return Result.success(randomNumeric(2) + name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public Result world(@RequestParam String name) {
        return Result.success(name + "success");
    }

}
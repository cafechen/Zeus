package org.twelveolympians.zeus.user.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.twelveolympians.zeus.common.core.entity.vo.Result;

import static org.apache.commons.lang.RandomStringUtils.randomNumeric;

@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    public Result findById(@PathVariable long id) {
        return Result.success(randomNumeric(2) + id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public Result deleteById(@PathVariable long id) {
        return Result.success(randomNumeric(2) + id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public Result update(@PathVariable long id) {
        return Result.success(randomNumeric(2) + id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/{id}")
    public Result add(@PathVariable long id) {
        return Result.success(randomNumeric(2) + id);
    }
}
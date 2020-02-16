package org.twelveolympians.zeus.account.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.twelveolympians.zeus.common.core.entity.vo.Result;

import static org.apache.commons.lang.RandomStringUtils.randomNumeric;

@RestController
public class AccountController {

    @RequestMapping(method = RequestMethod.GET, value = "/account/{id}")
    public Result findById(@PathVariable long id) {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/account/{id}")
    public Result deleteById(@PathVariable long id)  {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/account/{id}")
    public Result update(@PathVariable long id) {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account/{id}")
    public Result add(@PathVariable long id) {
        return Result.success();
    }

}
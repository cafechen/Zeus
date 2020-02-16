package org.twelveolympians.zeus.auth.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.twelveolympians.zeus.common.core.entity.vo.Result;

@RestController
public class AuthController {

    @RequestMapping(method = RequestMethod.GET, value = "/auth/{id}")
    public Result findById(@PathVariable long id) {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/auth/{id}")
    public Result deleteById(@PathVariable long id)  {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/auth/{id}")
    public Result update(@PathVariable long id) {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/auth/{id}")
    public Result add(@PathVariable long id) {
        return Result.success();
    }

}
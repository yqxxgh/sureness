package com.usthe.sureness.solon.controller;

import org.noear.solon.annotation.*;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.ContextUtil;

/**
 * @author tomsun28
 * @date 2021/5/7 19:58
 */
@Controller
public class HelloController {

    public static final String SUCCESS_ACCESS_RESOURCE = "access this resource: {%s - %s} success";

    @Get
    @Mapping("/api/v1/bar/{id}")
    public String api1Mock1() {
        Context context = ContextUtil.current();
        return String.format(SUCCESS_ACCESS_RESOURCE, context.method(), context.path());
    }

    @Post
    @Mapping("/api/v1/bar")
    public String api1Mock2() {
        Context context = ContextUtil.current();
        return String.format(SUCCESS_ACCESS_RESOURCE, context.method(), context.path());
    }

    @Put
    @Mapping("/api/v2/bar")
    public String api1Mock3() {
        Context context = ContextUtil.current();
        return String.format(SUCCESS_ACCESS_RESOURCE, context.method(), context.path());
    }

    @Get
    @Mapping("/api/v2/foo")
    public String api1Mock4() {
        Context context = ContextUtil.current();
        return String.format(SUCCESS_ACCESS_RESOURCE, context.method(), context.path());
    }

    @Delete
    @Mapping("/api/v2/foo")
    public String api1Mock5() {
        Context context = ContextUtil.current();
        return String.format(SUCCESS_ACCESS_RESOURCE, context.method(), context.path());
    }

    @Get
    @Mapping("/api/v3/foo")
    public String api1Mock6() {
        Context context = ContextUtil.current();
        return String.format(SUCCESS_ACCESS_RESOURCE, context.method(), context.path());
    }
}

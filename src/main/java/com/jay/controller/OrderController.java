package com.jay.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单
 */
@Controller
@RequestMapping("/order")
//@RolesAllowed({"ROLE_USER","ROLE_ORDER"})//JSR-250注解(表示当前类中所有方法都需要ROLE_USER或者ROLE_ORDER才能访问)
@Secured({"ROLE_USER","ROLE_ORDER"})//SpringSecurity注解(表示当前类中所有方法都需要ROLE_USER或者ROLE_ORDER才能访问)
public class OrderController {

    //@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ORDER')")//spring表达式注解(表示当前类中所有方法都需要ROLE_USER或者ROLE_ORDER才能访问)
    @RequestMapping("/findAll")
    public String findAll(){
        return "order-list";
    }

}

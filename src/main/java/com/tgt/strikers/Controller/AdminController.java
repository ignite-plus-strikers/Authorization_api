package com.tgt.strikers.Controller;

import com.tgt.strikers.model.Admin;
import com.tgt.strikers.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/admin")
    public String createAdmin(@RequestBody Admin admin){
        return adminService.createAdmin(admin);
    }

    @PostMapping("/admin/login")
    public String validateLogin(@RequestBody Admin admin){
        return adminService.validateLogin(admin);
    }

}

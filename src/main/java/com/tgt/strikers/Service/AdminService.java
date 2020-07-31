package com.tgt.strikers.Service;

import com.tgt.strikers.Exception.AdminNotFoundException;
import com.tgt.strikers.model.Admin;
import com.tgt.strikers.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service

public class AdminService {

    @Autowired
    private AdminRepository adminRepository;


    public String createAdmin(Admin admin){
      //  String temp_pass = admin.getAdmin_password();
        adminRepository.save(admin);
        return "Admin "+admin.getAdmin_firstname()+" has been added";
    }


    public String validateLogin(Admin login) {

        Optional<Admin> optionalAdmin = adminRepository.findById(login.getAdmin_email());
        if(!optionalAdmin.isPresent())
            throw new AdminNotFoundException("Admin Not Found");
        Admin temp = optionalAdmin.get();
        if(login.getAdmin_password().equals(temp.getAdmin_password()))
            return "Welcome Admin "+temp.getAdmin_firstname()+" !";
        else
            throw new AdminNotFoundException("Invalid Password");
//        return null;
    }

}

package com.tgt.strikers.Service;


import java.util.ArrayList;
import java.util.Optional;

//import com.tgt.strikers.JWTdemo.model.DemoTable;
import com.tgt.strikers.Repository.AdminRepository;
import com.tgt.strikers.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private DemoTable demoTable;

    @Autowired
     private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if ("site admin".equals(username)) {
//            return new User("site admin", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
//                    new ArrayList<>());
//        }
        Optional<Admin> optionalAdmin = adminRepository.findById(username);
        if(optionalAdmin.isPresent()) {
            Admin temp = optionalAdmin.get();

            return new User(temp.getAdmin_firstname(), "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", new ArrayList<>());
        }
        else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
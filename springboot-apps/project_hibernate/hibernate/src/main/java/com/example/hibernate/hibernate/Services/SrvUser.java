package com.example.hibernate.hibernate.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.hibernate.hibernate.Repository.RepoUsers;

@Service

public class SrvUser implements UserDetailsService {

    @Autowired
    private RepoUsers repoUsers;

    @Override
    public UserDetails loadUserByUsername(String paramUsrname) throws UsernameNotFoundException{
            var user= repoUsers.findByUsername(paramUsrname).orElseThrow(() -> new UsernameNotFoundException("User not found" + paramUsrname));
            return new User(user.getUsername(), user.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_"+ user.getRole())));
        }

}

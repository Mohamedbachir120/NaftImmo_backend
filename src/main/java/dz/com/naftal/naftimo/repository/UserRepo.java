package dz.com.naftal.naftimo.repository;

import dz.com.naftal.naftimo.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>{
    
    
}

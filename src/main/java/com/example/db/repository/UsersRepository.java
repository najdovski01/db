package com.example.db.repository;

import com.example.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>
{
    @Query(value="select * from project.users where username=? AND user_password=?",nativeQuery = true)
    Optional<Users> findByUsernameAndPassword(String username, String user_password);

    @Query(value="select * from project.users where username=?",nativeQuery = true)
    Optional<Users> findByUsername(String username);

}

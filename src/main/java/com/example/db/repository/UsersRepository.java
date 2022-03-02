package com.example.db.repository;

import com.example.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>
{
    Optional<Users> findById(Integer id);

    List<Users> findByUserNameAndSurname(String userName, String surname);

    Optional<Users> findByUsernameAndUserPassword(String username, String userPassword);

    List<Users> findByEmail(String email);

}

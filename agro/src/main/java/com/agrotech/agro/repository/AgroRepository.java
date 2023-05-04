package com.agrotech.agro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrotech.agro.pojo.AgroUser;

@Repository
public interface AgroRepository extends JpaRepository<AgroUser, Integer> {

	Optional<AgroUser> findByUsernameAndPassword(String username, String password);

}

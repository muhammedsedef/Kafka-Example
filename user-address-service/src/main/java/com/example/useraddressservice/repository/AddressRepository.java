package com.example.useraddressservice.repository;

import com.example.useraddressservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(value = "from Address a where a.userId=:userId")
    Address findByUserId(@Param("userId") Long userId);
}

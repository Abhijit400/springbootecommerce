package com.demo.repository;

import com.demo.entity.ForgetPasswordToken;
import com.demo.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ForgetPasswordTokenRepository extends CrudRepository<ForgetPasswordToken,Long> {

    ForgetPasswordToken findByConfirmationToken(String confirmationToken);

    Date findByExpiryDate(Date expiryDate);

    ForgetPasswordToken findByUser(User user);

    @Modifying
    @Query(value = "delete from ForgetPasswordToken where confirmation_token =:token")
    void deleteConfirmationToken(@Param("token")String token);
}
package com.demo.repository;

import com.demo.utils.JwtBlacklist;
import org.springframework.data.repository.CrudRepository;

public interface JwtRepository extends CrudRepository<JwtBlacklist,String> {

    JwtBlacklist findByToken(String token);
}

package com.api.apisigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.apisigi.entity.Casa;

import java.io.Serializable;

@Repository("casaRepo")
public interface IRCasa extends JpaRepository<Casa, Serializable> {
}

package com.api.apisigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.apisigi.entity.Estado;

import java.io.Serializable;

@Repository("estadoRepo")
public interface IREstado extends JpaRepository<Estado, String> {
}

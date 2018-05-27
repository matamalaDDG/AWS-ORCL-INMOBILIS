package com.api.apisigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.apisigi.entity.LiquidacionSueldo;

import java.io.Serializable;

@Repository("liquidacionSueldoRepo")
public interface IRLiquidacionSueldo extends JpaRepository<LiquidacionSueldo, String> {
}

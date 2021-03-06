package com.api.apisigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.apisigi.entity.CedulaIdentidad;

import java.io.Serializable;

@Repository("cedulaIdentidadRepo")
public interface IRCedulaIdentidad extends JpaRepository<CedulaIdentidad, String> {
}

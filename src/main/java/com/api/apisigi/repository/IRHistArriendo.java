package com.api.apisigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.apisigi.entity.HistArriendo;

import java.io.Serializable;

@Repository("histArriendoRepo")
public interface IRHistArriendo extends JpaRepository<HistArriendo, String> {
}

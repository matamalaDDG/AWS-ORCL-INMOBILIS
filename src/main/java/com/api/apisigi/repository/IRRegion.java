package com.api.apisigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.apisigi.entity.Region;


@Repository("regionRepo")
public interface IRRegion extends JpaRepository<Region, String> {

}

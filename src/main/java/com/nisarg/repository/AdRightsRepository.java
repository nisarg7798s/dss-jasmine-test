package com.nisarg.repository;

import com.nisarg.entity.AdRights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRightsRepository extends JpaRepository<AdRights, Long> {

}

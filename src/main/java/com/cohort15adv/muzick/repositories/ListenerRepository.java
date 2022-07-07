package com.cohort15adv.muzick.repositories;

import com.cohort15adv.muzick.models.Listener;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListenerRepository extends JpaRepository<Listener,Long> {
    List<Listener> findAllByAge(Integer age);
//    @Query("select * FROM listener WHERE name LIKE '*?1%'")
//    List<Listener> findAllByPartialName(String query);


}

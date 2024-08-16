package com.anjesh.fitnessapplication.run;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RunRepository
{

    List<Run> findAll();

    Optional<Run> findById(Integer id);

    void create(Run run);

    void update(Run run, Integer id);

    void delete(Integer id);

    int count();

    void saveAll(List<Run> runs);

    List<Run> findByLocation(String location);

}

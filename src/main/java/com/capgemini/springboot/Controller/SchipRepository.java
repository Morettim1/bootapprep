package com.capgemini.springboot.Controller;

import com.capgemini.springboot.Model.Schip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchipRepository extends CrudRepository<Schip, Long> {
    
}

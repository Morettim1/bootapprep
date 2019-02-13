package com.capgemini.springboot.View;

import com.capgemini.springboot.Controller.SchipRepository;
import com.capgemini.springboot.Model.Schip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchipEndPoint {
    @Autowired
    private SchipRepository mijnSchipRepository;



    @GetMapping("hallo")
    public Schip lopen(){
        System.out.println("go");
        Schip hetSchip = new Schip();
        hetSchip.setNaam("Titanic");
        Schip vliegendeHollander = mijnSchipRepository.save(hetSchip);
        return vliegendeHollander;
    }

    @GetMapping("ophalen")
    public Iterable<Schip> ophalen(){
        Iterable <Schip> ophalen = mijnSchipRepository.findAll();
        return ophalen;

    }

}
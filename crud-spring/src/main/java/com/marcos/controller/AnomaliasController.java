package com.marcos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.model.Anomalia;
import com.marcos.repository.AnomaliaRepository;

import lombok.AllArgsConstructor;


@RestController // O RestController fala para o spring que essa class tem um endpoint(uma url) (um java servelet por trás dos panos, que tem os metodos do pos, get e etc... )
@RequestMapping("/api/anomalias") //Qual será o endpoint que vai ficar exposto
@AllArgsConstructor
public class AnomaliasController {

    private final AnomaliaRepository anomaliaRepository;
    
    @GetMapping //poderia ser feito assim também: @RequestMapping(method = RequestMethod.GET) Porém, acho mais legível do jeito atual
    public List<Anomalia> list() {
        return anomaliaRepository.findAll();
    }
}

package com.desafiounibanco.desafio_itau_backend.controller;

import com.desafiounibanco.desafio_itau_backend.dto.EstatisticasDto;
import com.desafiounibanco.desafio_itau_backend.service.EstatisticasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class EstatisticasController {


    private final EstatisticasService estatisticasService;

    public EstatisticasController(EstatisticasService estatisticasService) {
        this.estatisticasService = estatisticasService;
    }

    @GetMapping(path ="/{intervalo}")
    public ResponseEntity<EstatisticasDto> getEstatisticas(@PathVariable Integer intervalo){

        return ResponseEntity.status(HttpStatus.OK).body(estatisticasService.calcularEstatisticas(intervalo));

    }
}

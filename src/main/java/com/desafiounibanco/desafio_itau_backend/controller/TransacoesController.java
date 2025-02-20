package com.desafiounibanco.desafio_itau_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacoesController {

   @PostMapping(value = "transacao")
   public ResponseEntity<Object> Teste (){
       return null;
   }

}

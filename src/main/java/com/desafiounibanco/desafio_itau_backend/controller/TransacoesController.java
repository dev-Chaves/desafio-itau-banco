package com.desafiounibanco.desafio_itau_backend.controller;

import com.desafiounibanco.desafio_itau_backend.domain.Transacao;
import com.desafiounibanco.desafio_itau_backend.dto.TransacaoDto;
import com.desafiounibanco.desafio_itau_backend.service.TransacaoServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacoesController {

    private final TransacaoServices transacaoServices;

    public TransacoesController(TransacaoServices transacaoServices) {
        this.transacaoServices = transacaoServices;
    }

    @GetMapping("/listar")
    ResponseEntity<List<Transacao>> list(){
        return new ResponseEntity<>(transacaoServices.listTransacao(), HttpStatus.OK);
    }

    @PostMapping("/transacao")
    public ResponseEntity<Transacao> makeTransition(@RequestBody TransacaoDto transacaoDto ){

        return transacaoServices.makeTransition(transacaoDto);
    };

}

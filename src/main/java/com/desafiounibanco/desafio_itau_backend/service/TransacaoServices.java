package com.desafiounibanco.desafio_itau_backend.service;

import com.desafiounibanco.desafio_itau_backend.domain.Transacao;
import com.desafiounibanco.desafio_itau_backend.dto.TransacaoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoServices {

    private static List<Transacao> transacoes;

    static{
        transacoes = new ArrayList<>(List.of(new Transacao(100, OffsetDateTime.now())));
    }

    public List<Transacao> listTransacao(){
        return transacoes;
    }

    public ResponseEntity<Transacao> makeTransition(@RequestBody TransacaoDto transacaoDto){

        if (transacaoDto.valor() == null) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(null);
        }

        if (transacaoDto.valor() <= 0){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(null);
        }

        var transacao = new Transacao(transacaoDto.valor(), transacaoDto.dateTime());

        transacoes.add(transacao);

        return ResponseEntity.status(HttpStatus.CREATED).body(transacao);

    }

    public ResponseEntity<Transacao> deleteAll(){

        transacoes.clear();

        return ResponseEntity.status(HttpStatus.OK).body(null);

    }

}

package com.desafiounibanco.desafio_itau_backend.dto;

import java.time.OffsetDateTime;

public record TransacaoDto(Double valor, OffsetDateTime dateTime) {
}

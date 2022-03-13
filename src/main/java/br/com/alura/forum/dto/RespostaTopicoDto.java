package br.com.alura.forum.dto;

import br.com.alura.forum.modelo.Resposta;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RespostaTopicoDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAUtor;

    public RespostaTopicoDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAUtor = resposta.getAutor().getNome();
    }
}

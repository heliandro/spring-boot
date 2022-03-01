package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Curso cursoSpring = new Curso("Spring", "Programação");
        Topico topico = new Topico("Duvida 2!", "Duvida de Spring Boot", cursoSpring);

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}

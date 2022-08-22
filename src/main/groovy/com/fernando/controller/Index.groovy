package com.fernando.controller

import com.fernando.dto.Pessoa
import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn

@CompileStatic
@Controller('/')
class Index {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    List<Pessoa> index() {
        List<Pessoa> retorno = []
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')

        return retorno
    }

    @Get('/nonblocking')
    @Produces(MediaType.APPLICATION_JSON)
    @ExecuteOn(TaskExecutors.IO)
    List<Pessoa> index2() {
        List<Pessoa> retorno = []
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')
        retorno += new Pessoa(nome: 'Fernando', email: 'teste@gmail.com')

        return retorno
    }


}

package com.fernando.dto

import groovy.transform.CompileStatic
import io.micronaut.core.annotation.Introspected

@CompileStatic
@Introspected
class Pessoa {
    String nome
    String email
}

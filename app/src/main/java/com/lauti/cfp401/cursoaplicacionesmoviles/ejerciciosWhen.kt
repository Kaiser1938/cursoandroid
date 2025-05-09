package com.lauti.cfp401.cursoaplicacionesmoviles

fun clasificarEdadIf(edad: Int){
    when(edad){
        in 0 ..12 -> println("Niño")
        in 13..17 -> println("Adolescente")
        in 18 .. 65 -> println ("ADulto")
        in 65..235 -> println("Adulto mayor")
        else -> println("cuidate pa ehh vo no me conoce")

    }
}


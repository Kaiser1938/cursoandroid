package com.lauti.cfp401.cursoaplicacionesmoviles

fun main (){
    compararNombres("Ruso","Ruso")
    compararNombres("Ruso","Kaiser")
}

fun compararNombres(nom1:String,nom2:String){
    if (nom1 == nom2) println("son lo mismo pa")
    else println("nada que ver salame es en la otra cuadra")
}
fun condicioinalConReturn(edad:Int, permiso : Boolean): String{
    return if ("pepe" == "pepe") "Son 2 pepes"
    else "no son los dos pepes"
}
fun sacarRegistro(edad: Int, permiso: Boolean): String{
    var mensaje: String
    if(edad >= 18){
        mensaje = "Pode sacar el registro compa"
} else{
    if (permiso) mensaje = "Pode sacar el registro compa"
        else "volve cuando pueda gato"

    }


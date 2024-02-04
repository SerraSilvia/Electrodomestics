package controllers

import models.Electrodomestic
import models.Rentadora
import models.Televisio

fun main() {
    var electrodomestics: MutableList<Electrodomestic> = mutableListOf()

    // Afegim 6 electrodomèstics generals que no són rentadora ni televisió:

    electrodomestics.add(Electrodomestic("secadora de condensació"," Candy",400.0f, "blanc", "G", 50))
    electrodomestics.add(Electrodomestic("frigorífic combi", "Haier",529.0f, "platejat", "F", 70))
    electrodomestics.add(Electrodomestic("rentaplats","Balay",329.0f, "blanc", "E", 40))
    electrodomestics.add(Electrodomestic("congelador horitzontal", "Whirlpool",460.0f, "blanc", "F", 40))
    electrodomestics.add(Electrodomestic("frigorífica americà","Samsung" ,2551.0f, "negre", "E", 117))
    electrodomestics.add(Electrodomestic("rentadora-secadora", "LG",579.0f, "blanc", "D", 75))
    //Afegim 2 televisions
    electrodomestics.add(Televisio("LG OLED", "LG", 1200.0f, "negre", "G", 20, 50))
    electrodomestics.add(Televisio("Samsung QLED", "Samsung", 1100.0f, "platejat", "G", 20, 65))
    //Afegim 2 rentadores
    electrodomestics.add(Rentadora("Rentadora WW90CGC04DAEEC", "Samsung", 529.0f, "blanc", "A", 40, 9))
    electrodomestics.add(Rentadora("Rentadora LFR6114O4B", "AEG", 551.0f, "blanc", "A", 40, 10))



    // Mostrem atributs de cada electrodomèstic

    for (electrodomestic in electrodomestics){

        println("Nom: ${electrodomestic.getNom()}:")
        /*println("Preu base: ${electrodomestic.getPreuBase()}€")
        println("Color: ${electrodomestic.getColor()}")
        println("Consum: ${electrodomestic.getConsum()}")
        println("Pes: ${electrodomestic.getPes()}kg")*/
        println("Preu final: ${electrodomestic.preuFinal()}€")
        println()

        //println(electrodomestic)
        println()
    }



    var preuBaseTotal = 0.0
    var preuFinalTotal = 0.0
    var preuFinalRentadores = 0.0
    var preuFinalTelevisions = 0.0

    for (electrodomestic in electrodomestics) {
        preuBaseTotal += electrodomestic.preuBase
        preuFinalTotal += electrodomestic.preuFinal()

        if (electrodomestic is Rentadora) {
            preuFinalRentadores += electrodomestic.preuFinal()
        } else if (electrodomestic is Televisio) {
            preuFinalTelevisions += electrodomestic.preuFinal()
        }
    }

    println("Electrodomèstics:")
    println("Preu base: $preuBaseTotal€")
    println("Preu final: $preuFinalTotal€")
    println()

    println("Rentadores:")
    println("Preu base: ${preuBaseTotal - preuFinalTotal + preuFinalRentadores}€")
    println("Preu final: $preuFinalRentadores€")
    println()

    println("Televisions:")
    println("Preu base: ${preuBaseTotal - preuFinalTotal + preuFinalTelevisions}€")
    println("Preu final: $preuFinalTelevisions€")




}
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
    electrodomestics.add(Televisio("LG OLED", "LG", 1200.0f, "negre", "G", 20, 50))

    var rentadora1 = Rentadora("Balay 2", "Balay", 400.0f, "blanc", "G", 60, 8);


    var tele = Televisio("LG OLED", "LG", 1200.0f, "negre", "G", 20 ,42  );
    electrodomestics.add(rentadora1);
    electrodomestics.add(tele);


    // Afegim 2 rentadoras
    var rentadora2 = Rentadora("Balay 2", "Balay", 400.0f, "blanc", "G", 60, 5);
    electrodomestics.add(rentadora2)

    // Afegim 2 televisions

    /*
    // Mostrem atributs de cada electrodomèstic
    for ((index, electrodomestic) in electrodomestics.withIndex()) {
        println("Electrodomèstic ${index + 1}:")
        println("Preu base: ${electrodomestic.preuBase}€")
        println("Color: ${electrodomestic.color}")
        println("Consum: ${electrodomestic.consum}")
        println("Pes: ${electrodomestic.pes}kg")
        println("Preu final: ${electrodomestic.preuFinal()}€")
        println()
    }

    var preuBaseTotal = 0.0
    var preuFinalTotal = 0.0
    var preuFinalRentadores = 0.0
    var preuFinalTelevisions = 0.0

    for (electrodomestic in electrodomestics) {
        preuBaseTotal += electrodomestic.preuBase
        preuFinalTotal += electrodomestic.preuFinal()

        if (electrodomestic is Electrodomestic.Rentadora) {
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

     */
}
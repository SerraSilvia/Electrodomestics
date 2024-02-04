package controllers

import models.Electrodomestic

fun main() {
    var electrodomestics: MutableList<Electrodomestic> = mutableListOf()

    // Afegim 6 electrodomèstics generals que no són rentadora ni televisió:

    electrodomestics.add(Electrodomestic("secadora",400.0f, "blanc", "G", 50))


}
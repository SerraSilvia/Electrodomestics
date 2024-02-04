package models

import utilities.BLUE_BOLD
import utilities.CYAN_BOLD
import utilities.RESET

class Rentadora :Electrodomestic {


    private var carrega: Int = 5

    /**
     * Constructor de la classe filla (inner class) Rentadora de l' Electrodomestic
     * @author silvia Serra
     * @since 04/02/2024
     * @param carrega : carrega que soporta la rentadora retornada en Int
     */  constructor(nom:String, marca:String, preu: Float, color:String, consum: String, kg: Int, carrega: Int) : super(nom, marca, preu, color, consum, kg){
        this.carrega = carrega
    }

    /**
     * Getter del la carrega
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna la carrega soportada de la Rentadora com a Int
     */
    private fun getCarrega():Int{
        return this.carrega
    }
    /**
     * Setter del la carrega
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Modifica la carrega soportada de la Rentadora com a Int
     */
    private fun setCarrega(carrega: Int){
        this.carrega = carrega
    }
    /**
     * Mètode per calcular el preu final
     * @author Silvia Serra
     * @since 04/02/2024
     * @param preuBase: Preu base agafat de la classe pare Electrodomestic on li haurem de sumar els suplements.
     * @return preuFinal: Preu final del producte calculat amb el suplement de la càrrega de la Rentadora.
     */
    override fun preuFinal(): Float {
        var preuFinal = preuBase

        preuFinal += when (consum) {
            "A" -> 35.0f
            "B" -> 30.0f
            "C" -> 25.0f
            "D" -> 20.0f
            "E" -> 15.0f
            "F" -> 10.0f
            else -> 0.0f
        }

        preuFinal += when {
            pes >= 6 && pes <= 20 -> 20
            pes <= 50 -> 50
            pes <= 80 -> 80
            else -> 100
        }
        return preuFinal
    }

    /**
     *Mètode override per ensenyar els atributs de la classe.
     * @author Silvia Serra
     * @since 04/02/2024
     * @return String amb la informació de la Rentadora
     */
    override fun toString(): String {
        return "$BLUE_BOLD El teu electrodomèstic: Rentadora, de la marca: ${marca} amb preu base: ${preuBase} en tamany: ${this.carrega}, en color: ${color} i consum: ${consum}, $RESET $CYAN_BOLD té un preu de: ${preuFinal()} $RESET"
    }

}
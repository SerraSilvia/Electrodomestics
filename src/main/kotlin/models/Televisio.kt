package models

import utilities.BLUE_BOLD
import utilities.CYAN_BOLD
import utilities.RESET

class Televisio: Electrodomestic {

        private var tamany: Int = 28

    /**
     * Constructor de la classe filla (inner class) Televisio de l' Electrodomestic
     * @author silvia Serra
     * @since 04/02/2024
     * @param tamany :Polzades de la televisió retornada en Int
     */
    constructor(nom:String, marca:String, preu: Float, color:String, consum: String, kg: Int, tamany: Int) : super(nom, marca, preu, color, consum, kg){

        this.tamany = tamany
    }
    /**
     * Getter del tamany
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna les polzades de la televisió com a Int
     */
    private fun getTamany():Int{
        return this.tamany
    }
    /**
     * Setter del tamany
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Modifica les polzades de la televisió com a Int
     */
    private fun setTamany(tamany: Int){
        this.tamany = tamany
    }
    /**
     * Mètode per calcular el preu final
     * @author Silvia Serra
     * @since 04/02/2024
     * @param preuBase: Preu base agafat de la classe pare Electrodomestic on li haurem de sumar els suplements.
     * @return preuFinal: Preu final del producte calculat amb el suplement de les polzades de la Televisió.
     *
     */
    override fun preuFinal(): Float {
        var preuFinal = preuBase

        preuFinal += when (tamany) {
            in 29..32 -> 50.0f
            in 34..42 -> 100.0f
            in 43..50 -> 150.0f
            in 51..Int.MAX_VALUE -> 200.0f
            else -> 0.0f
        }
        return preuFinal
    }


    /**
     *Mètode override per ensenyar els atributs de la classe.
     * @author Silvia Serra
     * @since 04/02/2024
     * @return String amb la informació de la Televisio.
     */
    override fun toString(): String {
        return "$BLUE_BOLD El teu electrodomèstic: televisió de la marca: ${marca} amb preu base: ${preuBase} i tamany: ${this.tamany} polzades, $RESET $CYAN_BOLD té un preu de: ${preuFinal()} $RESET"
    }
}
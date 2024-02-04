package models

import utilities.BLUE_BOLD
import utilities.CYAN_BOLD
import utilities.RESET


open class Electrodomestic {
    protected var nom:String=""
    protected var preuBase: Float = 0.0f
    protected var color:String = "blanc"
    protected var consum: String = "G"
    protected var pes: Int = 0

    /**
     * Constructor de la super classe Electrodomestic
     * @author silvia Serra
     * @since 04/02/2024
     * @param nom : nom de l'electrodomèstic
     * @param preuPase : Preu base de l'electrodomèstic
     * @param color: String on els colors disponibles són ("blanc", "platejat", "color")
     * @param consum: Consum de l'electrodomèstic dins del rang (A..G)
     * @param pes: Pes de l'electrodomèstic dins del rang (6..>80)
     */
    constructor(nom:String, preu: Float, color:String, consum: String, kg: Int) {
        this.nom = nom
        this.preuBase = preu
        this.color = color
        this.consum = consum
        this.pes = kg
    }
    /**
     * Getter del nom de l'electrodomèstic
     * @author Silvia Serra
     * @since 04/02/2024
     * @return nom com a String
     */
    protected fun getNom():String {
        return this.nom
    }
    /**
     * Setter del nom de l'electrodomèstic
     * @author Silvia Serra
     * @since 04/02/2024
     * @return modifica el nom retornat en String
     */
    protected fun setNom() {
        this.nom = nom
    }
    /**
     * Getter del preu base
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Preu base com a Float
     */
    protected fun getPreuBase():Float{
        return this.preuBase
    }
    /**
     * Setter del preu base
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Preu base modificat com a Float
     */
    protected fun setPreuBase(preuBase:Float){
        this.preuBase = preuBase
    }
    /**
     * Getter del color
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna el color de l'electrodomèstic en String
     */
    protected fun getColor():String{
        return this.color
    }
    /**
     * Setter del color
     * @author Silvia Serra
     * @since 04/02/2024
     * @return canvia el color de l'electrodomèstic retornat en String
     */
    protected fun setColor(color:String){
        this.color = color
    }
    /**
     * Getter del consum
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna el consum de l'electrodomèstic com a String
     */
    protected fun getConsum():String{
        return this.consum
    }
    /**
     * Setter del consum
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Canvia el consum de l'electrodomèstic i el retorna en String
     */
    protected fun setConsum(consum:String){
        this.consum = consum
    }
    /**
     * Getter del pes
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna el pes de l'electrodomèstic com a Int
     */
    protected fun getPes():Int{
        return this.pes
    }
    /**
     * Setter del pes
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Canvia el pes de l'electrodomèstic com a Int
     */
    protected fun setPes(pes:Int){
        this.pes = pes
    }

    /**
     * Mètode per calcular el preu final
     * @author Silvia Serra
     * @since 04/02/2024
     * @param preuBase: Preu base del producte de la classe Electrodomestic on li haurem de sumar els suplements.
     * @return preuFinal: Preu final del producte calculat amb els suplements de consum i pes.
     */
    protected fun preuFinal(): Float {
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
     *Mètode override per ensenyar els atributs de la classe Electrodomèstic.
     * @author Silvia Serra
     * @since 04/02/2024
     * @return String amb la informació de la classe.
     */
    override fun toString(): String {
        return "$BLUE_BOLD El teu electrodomèstic: ${this.nom} de preu base: ${this.preuBase} en color: ${this.color} i consum: ${this.consum}, $RESET $CYAN_BOLD té un preu de: ${preuFinal()} $RESET"
    }

    inner class Rentadora {
        private var carrega: Int = 5

        /**
         * Constructor de la classe filla (inner class) Rentadora de l' Electrodomestic
         * @author silvia Serra
         * @since 04/02/2024
         * @param carrega : carrega que soporta la rentadora retornada en Int
         */
        constructor(carrega: Int) {
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
        private fun preuFinal(): Float {
            var preuFinal = preuBase

            preuFinal += when {
                carrega == 6 || carrega == 7 -> 55.0f
                carrega == 8 -> 70.0f
                carrega == 9 -> 85.0f
                carrega == 9 -> 100.0f
                else -> 0.0f
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
            return "$BLUE_BOLD El teu electrodomèstic: Rentadora, de preu base: ${preuBase} en tamany: ${this.carrega}, en color: ${color} i consum: ${consum}, $RESET $CYAN_BOLD té un preu de: ${preuFinal()} $RESET"
        }
    }

    inner class Televisio {
        private var tamany: Int = 28

        /**
         * Constructor de la classe filla (inner class) Televisio de l' Electrodomestic
         * @author silvia Serra
         * @since 04/02/2024
         * @param tamany :Polzades de la televisió retornada en Int
         */
        constructor(tamany: Int) {
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
        private fun preuFinal(): Float {
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
            return "$BLUE_BOLD El teu electrodomèstic: televisió, de preu base: ${preuBase} i tamany: ${this.tamany} polzades, $RESET $CYAN_BOLD té un preu de: ${preuFinal()} $RESET"
        }

    }
}
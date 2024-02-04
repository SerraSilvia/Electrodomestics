package models

import utilities.BLUE_BOLD
import utilities.CYAN_BOLD
import utilities.RESET


open class Electrodomestic {

    protected var nom:String=""
    protected var marca:String=""
    var preuBase: Float = 0.0f
    protected var color:String = "blanc"
    protected var consum: String = "G"
    protected var pes: Int = 0

    /**
     * Constructor de la super classe Electrodomestic
     * @author silvia Serra
     * @since 04/02/2024
     * @param nom : nom de l'electrodomèstic
     * @param marca : marca de l'electrodomèstic
     * @param preuPase : Preu base de l'electrodomèstic
     * @param color: String on els colors disponibles són ("blanc", "platejat", "color")
     * @param consum: Consum de l'electrodomèstic dins del rang (A..G)
     * @param pes: Pes de l'electrodomèstic dins del rang (6..>80)
     */
    constructor(nom:String, marca:String, preu: Float, color:String, consum: String, kg: Int) {
        this.nom = nom
        this.marca = marca
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
    public fun getMarca():String {
        return this.marca
    }
    /**
     * Setter de la marca de l'electrodomèstic
     * @author Silvia Serra
     * @since 04/02/2024
     * @return modifica la marca i la retorna en String
     */
    public fun setMarca() {
        this.marca = marca
    }
    /**
     * Getter del nom de l'electrodomèstic
     * @author Silvia Serra
     * @since 04/02/2024
     * @return nom com a String
     */
    public fun getNom():String {
        return this.nom
    }
    /**
     * Setter del nom de l'electrodomèstic
     * @author Silvia Serra
     * @since 04/02/2024
     * @return modifica el nom retornat en String
     */
    public fun setNom() {
        this.nom = nom
    }
    /**
     * Getter del preu base
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Preu base com a Float
     */
    public fun getPreuBase():Float{
        return this.preuBase
    }
    /**
     * Setter del preu base
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Preu base modificat com a Float
     */
    public fun setPreuBase(preuBase:Float){
        this.preuBase = preuBase
    }
    /**
     * Getter del color
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna el color de l'electrodomèstic en String
     */
    public fun getColor():String{
        return this.color
    }
    /**
     * Setter del color
     * @author Silvia Serra
     * @since 04/02/2024
     * @return canvia el color de l'electrodomèstic retornat en String
     */
    public fun setColor(color:String){
        this.color = color
    }
    /**
     * Getter del consum
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna el consum de l'electrodomèstic com a String
     */
    public fun getConsum():String{
        return this.consum
    }
    /**
     * Setter del consum
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Canvia el consum de l'electrodomèstic i el retorna en String
     */
    public fun setConsum(consum:String){
        this.consum = consum
    }
    /**
     * Getter del pes
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Retorna el pes de l'electrodomèstic com a Int
     */
    public fun getPes():Int{
        return this.pes
    }
    /**
     * Setter del pes
     * @author Silvia Serra
     * @since 04/02/2024
     * @return Canvia el pes de l'electrodomèstic com a Int
     */
    public fun setPes(pes:Int){
        this.pes = pes
    }

    /**
     * Mètode per calcular el preu final
     * @author Silvia Serra
     * @since 04/02/2024
     * @param preuBase: Preu base del producte de la classe Electrodomestic on li haurem de sumar els suplements.
     * @return preuFinal: Preu final del producte calculat amb els suplements de consum i pes.
     */
    public open fun preuFinal(): Float {
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
        return "$BLUE_BOLD El teu electrodomèstic: ${this.nom} de la marca: ${this.marca} amb preu base: ${this.preuBase} en color: ${this.color} i consum: ${this.consum}, $RESET $CYAN_BOLD té un preu de: ${preuFinal()} $RESET"
    }

}
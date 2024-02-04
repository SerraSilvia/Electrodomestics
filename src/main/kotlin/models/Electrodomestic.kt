package models

open class Electrodomestic {
    protected var preuBase: Float = 0.0f
    protected var color: String = "blanc"
    protected var consum: String = "G"
    protected var pes: Int = 0

    constructor(preu: Float, color: String, consum: String, kg: Int) {
        this.preuBase = preu
        this.color = color
        this.consum = consum
        this.pes = kg
    }

    protected fun getPreuBase():Float{
        return this.preuBase
    }
    protected fun setPreuBase(preuBase:Float){
        this.preuBase = preuBase
    }
    protected fun getColor():String{
        return this.color
    }
    protected fun setColor(color:String){
        this.color = color
    }
    protected fun getConsum():String{
        return this.consum
    }
    protected fun setConsum(consum:String){
        this.consum = consum
    }
    protected fun getPes():Int{
        return this.pes
    }
    protected fun setPes(pes:Int){
        this.pes = pes
    }

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

    inner class Rentadora {
        private var carrega: Int = 5
        constructor(carrega: Int) {
            this.carrega = carrega
        }
        private fun getCarrega():Int{
            return this.carrega
        }
        private fun setCarrega(carrega: Int){
            this.carrega = carrega
        }


        override fun toString(): String {
            return "El preu de la teva rentadora és: ${preuFinal()}"
        }
    }

    inner class Televisio {
        private var tamany: Int = 28

        constructor(tamany: Int) {
            this.tamany = tamany
        }
        private fun getTamany():Int{
            return this.tamany
        }
        private fun setTamany(tamany: Int){
            this.tamany = tamany
        }
        override fun toString(): String {
            return "El preu de la teva televisió és: ${preuFinal()}"
        }

    }
}
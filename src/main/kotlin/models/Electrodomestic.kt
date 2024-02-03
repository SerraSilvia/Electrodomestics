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

    open fun preuFinal(): Float {
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


    private class Rentadora {
        private var carrega: Int = 5
        private var preu: Float = 0.0f

        fun getPreuFinal(): Float {
            return 0.0f
        }

        override fun toString(): String {
            return "El preu de la teva rentadora és: ${this.preu}"
        }
    }

    private class Televisio {
        private var tamany: Int = 28
        private var preu: Float = 0.0f

        fun getPreuFinal(): Float {
            return 0.0f
        }

        override fun toString(): String {
            return "El preu de la teva televisió és: ${this.preu}"
        }

    }
}
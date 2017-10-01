import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

interface Operation {
    fun sum(var1:Double, var2:Double) : Double
    fun subtract(var1:Double, var2:Double) : Double
    fun divide(var1:Double, var2:Double) : Double
    fun multiply(var1:Double, var2:Double) : Double
}

class Calculator:Operation{

    override fun divide(var1:Double, var2:Double): Double {
        return TwoDecPlaceDouble(var1/var2)
    }

    override fun multiply(var1:Double, var2:Double): Double {
        return TwoDecPlaceDouble(var1*var2)
    }

    override fun subtract(var1:Double, var2:Double): Double {
        return TwoDecPlaceDouble(var1-var2)
    }

    override fun sum(var1:Double, var2:Double): Double {
        return TwoDecPlaceDouble(var1+var2)
    }
}

fun main(args : Array<String>){

    var calculator = Calculator()

    var numb1 = TwoDecPlaceDouble((0.0..10.0).random())
    var numb2 = TwoDecPlaceDouble((0.0..10.0).random())

    println("sum two numbers: ${numb1},${numb2} = ${calculator.sum(numb1,numb2)}")
    println("subtract two numbers: ${numb1},${numb2} = ${calculator.subtract(numb1,numb2)}")

    if(numb2==0.0){
        println("cannot perform division between numbers: ${numb1},${numb2}")
    }else {
        println("divide two numbers: ${numb1},${numb2} = ${calculator.divide(numb1,numb2)}")
    }

    println("multiply two numbers: ${numb1},${numb2} = ${calculator.multiply(numb1,numb2)}")

}

fun ClosedRange<Double>.random() = Random().nextDouble()

fun TwoDecPlaceDouble (doubIn: Double) : Double{
    return BigDecimal(doubIn).setScale(2,RoundingMode.CEILING).toDouble()
}
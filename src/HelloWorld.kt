
fun main(args : Array<String>){
    //kotlin's way of instantiating a class
    Greeter("André").greet()

    //like OOP but New word is omitted
    //val g: Greeter = Greeter("Hello's")
    val g = Greeter("Hello's")
    g.greet()

    //flow control
    //cycles
    var x: Int = 1
    while (x < 10) {

        //conditional test
        if(x > 5) {
            g.greet()

            //something different, like a switch..
            when(x){
                9-> println("the last hello.. promise!")
            }
        }

        //increment x
        x++
    }

    g.goodBye()
}

class Greeter(val name: String){

    fun greet(){
        println("Hello " + name)
    }

    fun goodBye(){
        println("bye!")
    }

    fun dosomething(){
        println("does things..")
    }

}


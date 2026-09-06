
class car(var model: String){

    var price: Double = 0.0
    constructor(m: String, p: Double) : this(m) {
        price = p

        init{println("the price is $price")}
    }
}



fun main() {



}
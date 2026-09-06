fun main(){

//    val zeroes = Array<Int>(5) { 2 }
//   println(zeroes.joinToString())

//    val emptyArrayRight = emptyArray<String>()
//    val emptyArrayLeft: Array<String> = emptyArray()


//    val simpleArray = arrayOf(99,13, 56, 43,2)
//    simpleArray.shuffle()
//    println(simpleArray.joinToString())
//
//    simpleArray.sort()
//    println(simpleArray.joinToString())



    val simpleArray = arrayOf(13,56,43,2)
    for(i in simpleArray){
        for(j in simpleArray){

            if(simpleArray[j] > simpleArray[j+1]){
                val temp = simpleArray[j]
                simpleArray[j] = simpleArray[j+1]
                simpleArray[j+1] = temp

            }

        }
        println(simpleArray)
    }

}
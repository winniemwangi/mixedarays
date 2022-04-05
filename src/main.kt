fun main(){
    var s =productinterger(arrayOf(2,4,2,2))
    println(s)
    var t =mixedarrays(arrayOf("Winnie",3.6,3.0,23,1.0F))
    println(t)
}

//Write a function that takes in an array of integers and returns the product of
//all the elements
fun productinterger(product: Array<Int>):Int{
    var multiply=1

    product.forEach { x ->
        multiply*=x
    }
    return multiply

}
//Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements

fun mixedarrays(mixedarray: Array<Any>):Double{
    var mix = 0.0
    mixedarray.forEach { y ->
        if (y is Double){
            mix+=y
        }
    }
    return mix
}
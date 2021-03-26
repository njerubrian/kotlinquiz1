class cars {
    var subarucolor ="black"
    val subaruspeed = "220km/hr"
    var nissancolor = "white"
    val nissanspeed = "180km/hr"
    val teslarcolor ="tinted black window frames white body"
    val teslarspeed ="320km/hr"
    fun accelerate(){
        println("the speed of a subaru should be : " +subaruspeed)
        println("the speed of a nissan should be : " +nissanspeed)
        println("the speed of a teslar should be : " +teslarspeed)

    }

    fun color(){
println("the color of a subaru should be: " +subarucolor)
        println("the color of a subaru should be: " +nissancolor)
        println("the color of a subaru should be: " +teslarcolor)

    }
}

fun main(){
  val  obj =cars()
    println(obj.accelerate())
    println(obj.color())
}
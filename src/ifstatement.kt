fun main () {
    var login ="admin"
    val password:Int= 1234
    print("enter role " )
    val enteredrole=readLine()
    print("enter your password")
val enteredpass= Integer.valueOf(readLine())
    if (enteredrole==login && enteredpass==password ) {

        println("succesful login welcome:" +login)
    }

        else{
            println("you are not an authorised user")

        }
}
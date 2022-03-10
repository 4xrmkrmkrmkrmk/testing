data class foo(val title:String, val tt:String)

fun main() {
    val r1 = foo("asdf", "sdf")
    val r2 = foo("sdaaf", "sdfsdfs")
    val rr = mapOf("cos1" to r1, "cos2" to r2)
    println(rr.getValue("cos1"))
}
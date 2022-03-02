fun main() {
    val likes = 21
    val strLikes = likes.toString()
    val message = if (strLikes.endsWith('1') && !strLikes.endsWith("11")) "человеку" else "людям"
    println("Понравилось $likes $message")

    /**
    1- человеку
    11 - людям
    21 - человеку
    ...
    101 - человеку
    111 - ЛЮДЯМ
    211 - ...
    1011 - ...
    -> исключить все что заканчивается на 1 , но не на 11
     */
}
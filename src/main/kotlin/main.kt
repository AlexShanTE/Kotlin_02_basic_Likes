fun main() {
    val likes = 1011

    //val strLikes = likes.toString()
    //val message = if (strLikes.endsWith('1') && !strLikes.endsWith("11")) "человеку" else "людям"

    val message = if (likes % 10 == 1 && likes % 100 !== 11) "человеку" else "людям"
    println("Понравилось $likes $message")
}
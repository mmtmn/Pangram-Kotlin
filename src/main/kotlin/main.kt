fun pangram() {
    /**
     * This functions checks if an array
     *  has every letter in the alphabet
     */
    val alphabet = arrayListOf<Char>(
        'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','y','z'
    )
    val testArray = arrayListOf<Char>('a', 'b', 'c')
    val n = testArray.size - 1

    for (i in 0..n) {
        if (testArray[i] in alphabet) {
            alphabet.remove(testArray[i])
        } else if (alphabet.size == 0) {
            println("yes")
        } else {
            continue
        }
    }
    if (alphabet.size == 0) {
        println("yes, the test array contains all letters of the alphabet")
    } else {
        println("no, the test array doesn't contains all letters of the alphabet")
    }
}

fun main() {
    pangram()
}
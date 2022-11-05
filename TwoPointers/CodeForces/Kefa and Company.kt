import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max


fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val( n , d)= readInts()


   val inputArray = reader.lineSequence().take(n)
        .map { it.split(' ') }
        .map { Pair(it.first().toLong(),it.last().toLong()) }
        .sortedBy { it.first }
        .toList()

    var maxTillNow = inputArray.first().second
    var maxEver = 0L
    var firstPointer = 0
    var i = 1
    while (i in 1..inputArray.lastIndex)
    {

        if (inputArray[i].first - inputArray[firstPointer].first < d )
        {
            if (i != firstPointer) maxTillNow+= inputArray[i].second else maxTillNow = inputArray[i].second
            i++
        }else{
             maxEver  = max(maxEver,maxTillNow)
            maxTillNow -= inputArray[firstPointer].second
            firstPointer++
        }
    }

    maxEver  = max(maxEver,maxTillNow)

    println(maxEver)


}



//fun readInt() = readLine()!!.toInt()
fun readInts() = readLine()!!.split(" ").map(String::toInt)

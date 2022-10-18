import java.lang.StringBuilder
 
fun main() {
   var testCases = readInt()
    val output = StringBuilder()
    while (testCases-- != 0 )
    {
     val n = readInt()
     val inputs = readInts()
        val frequency = IntArray(n+1)
      val sumsArr = IntArray(2*n+1)
 
        for (i in inputs) { frequency[i]++ }
 
        for ( i in 1 until n+1)
        {
            if (frequency[i] == 0) continue
            sumsArr[i*2] += frequency[i]/2
         for (j in i+1 until n+1)
         {
             if (frequency[j] == 0) continue
            sumsArr[i+j] += frequency[i].coerceAtMost(frequency[j])
         }
        }
        output.appendLine(sumsArr.maxOrNull()!!)
    }
    println(output)
}
 
 
 
 
fun readInt() = readLine()!!.toInt()
fun readInts() = readLine()!!.split(" ").map(String::toInt).toIntArray()

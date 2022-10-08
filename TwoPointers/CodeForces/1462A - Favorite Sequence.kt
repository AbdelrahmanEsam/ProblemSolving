import java.lang.StringBuilder

fun main() {
   var testCases = readInt()
    val output = StringBuilder()
    while (testCases-- != 0 )
    {
       val size =  readInt()
       val input  = readInts()

        var firstPointer = 0
        var secondPointer = input.lastIndex
        val lineOutput = StringBuilder()

        while (firstPointer <= secondPointer )
        {
            lineOutput.append("${input[firstPointer]} ${input[secondPointer]} ")
            firstPointer++
            secondPointer--
        }

        if (size % 2 != 0) lineOutput.append("${input[firstPointer]} ")
        output.appendLine(lineOutput)
    }
    println(output)

}




fun readInt() = readLine()!!.toInt()
fun readInts() = readLine()!!.split(" ").map(String::toInt).toIntArray()

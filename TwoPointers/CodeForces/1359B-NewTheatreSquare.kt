import java.lang.StringBuilder
import kotlin.math.min

fun main() {
   var testCases = readInt()
    val output = StringBuilder()
    while (testCases-- != 0 )
    {
     val (n,m,x,y) = readInts()

        var price = 0
       for( i in 0 until  n)
        {
            val line = readLine()!!.toCharArray()
            var index = 0
            while ( index  in line.indices)
            {
                if (line[index] == '.')
                {
                    if (index+1 in line.indices && line[index+1] == '.') {
                        index+=2
                        price +=  min(2*x,y)
                    }else {
                        index++
                        price +=  x
                    }
                }else
                {
                    index++
                }

            }

        }
        output.appendLine(price)
    }
    println(output)

}




fun readInt() = readLine()!!.toInt()
fun readInts() = readLine()!!.split(" ").map(String::toInt).toIntArray()

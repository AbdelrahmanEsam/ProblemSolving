import java.lang.StringBuilder

fun main(args: Array<String>) {
   readLine()
   val prefixSum = readLongsToPreFix()
   val roomNums = readLongs()
  var prefixPointer = 1
  var roomsPointer = 0
  var lastD = 0L

   val output = StringBuilder()
 while (roomsPointer in roomNums.indices && prefixPointer in prefixSum.indices)
 {

    if (roomNums[roomsPointer] <= prefixSum[prefixPointer] ) {
      output.appendLine("$prefixPointer ${roomNums[roomsPointer]-lastD}")
       roomsPointer++

    }else
    {
       lastD = prefixSum[prefixPointer]
       prefixPointer++
    }
 }

   println(output)
}


fun readLongsToPreFix() = readLine()!!.split(" ").map(String::toLong).scan(0,Long::plus).toLongArray()
fun readLongs() = readLine()!!.split(" ").map(String::toLong).toLongArray()

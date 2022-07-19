/**
 * 11651 좌표 정렬하기 2
 * https://www.acmicpc.net/problem/11651
 * 
 * @date 2022.7.19
 */

import java.io.BufferedReader
import java.io.InputStreamReader

 fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()

    val arr = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until N) {
        arr.add(br.readLine().split(" ")
            .let {
                Pair(it[0].toInt(), it[1].toInt())
            })
    }

    arr.sortedWith(
        compareBy({ it.second }, { it.first })
    )
    .forEach {
        println("${it.first} ${it.second}")
    }

 }
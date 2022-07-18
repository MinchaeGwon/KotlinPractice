/**
 * 1181 단어 정렬
 * https://www.acmicpc.net/problem/1181
 * 
 * @date 2022.7.18
 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()
    val set = mutableSetOf<String>()

    for (i in 0 until N) {
        set.add(br.readLine())
    }

    /*
        distinct -> 중복 제거
        sortedWith -> Comparator 사용
        compareBy<String> { it.length } -> 문자열 길이를 기준으로 오름차순 정렬(dafault ASC), 내림차순 정렬일 경우에는 -it.length로 하면 됨
        thenBy{ it } -> 알파벳순으로 정렬(문자열 길이를 기준으로 정렬 후)
    */
    set.distinct()
        .sortedWith(
            compareBy<String> { it.length }
            .thenBy{ it }
    )
    .forEach {
        println(it)
    }
}

fun max(n1: Int, n2: Int): Int {
	return if (n1 > n2) n1 else n2
}

fun maxShort(n1: Int, n2: Int): Int = if (n1 > n2) n1 else n2

fun maxShortMore(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

fun main(args: Array<String>) {
	println(max(7, 5))
	println(maxShort(7, 5))
	println(maxShortMore(7, 5))
}
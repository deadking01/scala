object IteratorTest {
	def main(args: Array[String]) {
		var ita=Iterator(10,20,40,77)
		var itb=Iterator(10,20,40,77)
		println(ita.max)
		println(itb.min)
	}
}
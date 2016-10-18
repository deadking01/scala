object ArrayTest {
	def main(args: Array[String]) = {
		var myList=Array(1.8,1.9,2.0)
		for(x<-myList){
			println(x)
		}
		var total=0.0;
		for(i<-1 to (myList.length-1)){
			total+=myList(i)
		}
		println(total)
		var max=myList(0)
		for(x<-myList){
			if(x>max){
				max=x
			}
		}
		println(max)
	}
}
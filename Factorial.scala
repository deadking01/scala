object Test{

def main(args: Array[String]) {
	for(i<-1 to 10){
		println("factorial of "+i+"is "+factorial(i))
	}
}
def factorial(n:BigInt):BigInt={
	if (n <= 1){
		1
	}
	else{
		n*factorial(n-1)
	}
}	
}
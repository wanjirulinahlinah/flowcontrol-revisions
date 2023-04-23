fun main() {

    val number = -10
    var result = if (number > 0){
    println("positive number")
    }else{
       println("Negative number")
    }

    var age = 10
    if(age<10){
        println("eligible to vote")
      }
    else{
        println("eligible not to vote")
    }



    var l = 1
    while(l<=5){
        println("line $l")
        ++l
    }

    //compute the sum of natural numbers from 1 to 100
    var sum = 0
    var i = 100

    while (i != 0) {
        sum += i     // sum = sum + i;
        --i
    }
    println("sum = $sum")
if(age<18){
    println("not eligible for voting")
   }
    else if(age<60){
        println("eligible for voting")
        println("Not a senior citizen")
    }
    else{
        println("eligible for voting")
        println("is a senior citizen")
    }
    
    when(age){
        in 1..17->println("not eligble for voting ")
        in 18..60->{
            println("eligible for voting")
            println("not a senior citizen")
        }
        else->{
            println("eligible for voting")
            println("is a senior citizen")
        }
    }



}

fun main(){
      var Account=currentAccount("38361054","Gumato Roba","48000")
      Account.deposit(4800.0)
      println(Account)
    Account.withdraw(2300.0)

     Account.details("3499","32900","Sarah Adan")

    var Savings=savingAcccount("234576","435353","234370")

}
 open class currentAccount( accountNumber:String, accountName:String,  balance:String){
     fun deposit(amount: Double){
         var x= 0.0
         println(amount++)

     }
     fun withdraw(amount: Double){
     var b= 0.0
         println(amount++)
     }
    fun details(accountNumber: String,balance: String,accountName: String){
      println("$accountNumber with  $balance is operated by $accountName")
    }

}
class savingAcccount(accountNumber: String,accountName: String,balance:String){
    fun withdrawals(){
         var c= 1
        println(withdawals--)
    }
    fun withdraw(){

    }

}
data class attributes(var name:String,var weight:Int,var price:String, var category:String)
    fun groceries(name:String){

    }


fun fruits(names: String){
     var fruit= "Banana"
    println(fruit.[0], fruit[4])
}
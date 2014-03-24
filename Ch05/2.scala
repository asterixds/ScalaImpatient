class BankAccount() {
	private var bal:Double = 0
	def deposit(amt:Double) = { if (amt >0)bal += amt}
	def withdraw(amt:Double) = { 
		if (bal >= amt) bal -= amt else throw new Exception("Insufficient funds. Try withdrawing smaller amount")}
	def balance = bal
}

val a = new BankAccount

try{
	a.deposit(10)
	println(a.balance)
	a.withdraw(8)
	println(a.balance)
	a.withdraw(3)
	println(a.balance)
} catch {
	case e: Exception => println(e.getMessage)
}
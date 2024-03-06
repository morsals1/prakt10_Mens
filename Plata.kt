class Plata:Operator() {
    var otv = false
    var qp = 0.0
    fun Answer(){
        var ans = readln()
        if(ans == "да"){
            otv = true
        }
        else if (ans == "нет"){
            otv = false
        }
        else{
            println("Вам нужно ввести только да/нет")
        }
    }
    override fun Check_Payment(): Double {
        if(otv == true){
            qp = 0.7*Price()
        }
        else {
            qp = 1.5*Price()
        }
        return qp
    }
}
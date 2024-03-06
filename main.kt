fun main(){
    val a: Operator = Operator()
    val b: Plata = Plata()
    a.input()
    if(a.inspect == true) {
        a.info()
        a.quest()
        b.Answer()
        a.Check_Payment()
        if(b.otv == true){
            println("Так как вы внесли оплату, вам применена скидка \n К оплате ${a.Check_Payment()}")
        }
        else{
            println("Так как вы не внесли оплату, вам нужно будет оплатить задолжность + штраф \n К оплате ${a.Check_Payment()}")
        }
    }

}
open class Operator: Mobile_operator() {
    override var name_operator = ""
    override var price_minut = 0.0
    override var s_pokr = 0.0
    override fun Price(): Double {
        val price = 100*s_pokr/price_minut
        return price
    }
    override fun Check_Payment(): Double {
        return 0.0
    }
    var inspect = false
    fun input(){
        try {
            println("ввдеите назание опертора")
            name_operator = readln()
            println("ввдеите стоимость разговора в минуту")
            price_minut = readln().toDouble()
            println("ввдеите площадь покрытия")
            s_pokr = readln().toDouble()
            inspect = true
        } catch (e:Exception) { println("Введите:\n -в поле стоимость разговора и площадь покрытия цифры") }
    }
}
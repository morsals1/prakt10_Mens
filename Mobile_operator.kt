abstract class Mobile_operator:infomobile {
    abstract val name_operator: String
    abstract val price_minut: Double
    abstract val s_pokr: Double
    abstract fun Price():Double
    abstract fun Check_Payment():Double
    override fun info() {
        println("название оператора $name_operator стоимость в минуту $price_minut площадь покрытия $s_pokr")
    }

    override fun quest() {
        println("Хотите ли вы внести оплату за услуги мобильного оператора $name_operator за ${String.format("%.2f",Price())} руб? \n да/нет")
    }
}
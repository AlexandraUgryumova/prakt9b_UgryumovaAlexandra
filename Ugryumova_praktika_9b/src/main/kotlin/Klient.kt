import InternetShops.*
open class Klient (var female: String, var pokupka: Int, var chet: Int, var kol: Int,empproduct: String, empprise: Int, empinformation: String): InternetShop(empproduct, empprise, empinformation){
    open fun GetInfo(){
        println("фамилия: $female. Чек ценой: $pokupka. Баланс: $chet")
    }
    open fun PokupkaInfo(){
        println("человек $female покупает $product стоимостью за 1 штуку в $prise рублей в количестве $kol штук")
    }
    open fun BlokPerson(){
        println("вы заблокированы для покупки товара $product в количестве $kol штук")
    }
    open fun UnBlokPerson(){
        println("вы удачно завершили покупку, $female, поздравляю, ожидайте заказ")
    }
}
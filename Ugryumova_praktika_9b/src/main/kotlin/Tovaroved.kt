import InternetShops.*
open class Tovaroved (var blok: Boolean, var female: String, empproduct: String, empprise: Int, empinformation: String): InternetShop(empproduct, empprise, empinformation){
    open fun ProductAdd(){
        println("заказ на фамилию $female принят")
    }
    open fun ZakazInfo(){
        println("$female:\nпокупает $product \nинформация о товаре :$information")
    }
    open fun BlokList(){
        println("вы заблокировали клиента $female для покупки товара $product")
    }
}
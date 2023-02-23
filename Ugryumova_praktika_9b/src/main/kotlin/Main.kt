import InternetShops.InternetShop
fun main(args: Array<String>) {
    try {
        var blok: Boolean = false
        println("Товаровед:")
        println("напишите название продукта")
        val product1: String = readln().toString()
        println("напишите цену продукта")
        val prise1: Int = readln()!!.toInt()
        println("напишите информацию о продукте")
        val info1: String = readln().toString()
        val productOne = InternetShops.InternetShop(product1, prise1, info1)
        println("Клиент:")
        productOne.Tovar()
        productOne.ProductInfo()
        println("напишите свою фамилию")
        val female1: String = readln().toString()
        println("напишите количество продукта")
        val kol: Int = readln()!!.toInt()
        val pokupka1 = kol * prise1
        println("напишите сколько денег у вас есть")
        val chet1: Int = readln()!!.toInt()
        val klient1 = Klient(female1, pokupka1, chet1, kol, product1, prise1, info1)
        if (pokupka1 > chet1) {
            blok = true
        }
        println("Товаровед:")
        klient1.PokupkaInfo()
        klient1.GetInfo()
        val tovaroved1 = Tovaroved(blok, female1, product1, prise1, info1)
        if(blok == true){
            while(true){
                println("вы хотите заблокировать клиента $female1?")
                val answer: String = readln()
                if(answer == "да"){
                    break
                }
                if (answer == "нет"){
                    blok = false
                    break
                }
            }
        }
        if (blok == true) {
            tovaroved1.BlokList()
            println("Клиент:")
            klient1.BlokPerson()
        } else {
            tovaroved1.ProductAdd()
            tovaroved1.ZakazInfo()
            println("Клиент:")
            klient1.UnBlokPerson()
        }
    }
    catch(e:Exception){
        println("ошибка")
    }
}
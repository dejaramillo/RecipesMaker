val ingredientes: List<String> = listOf("Agua","leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

fun main(args: Array<String>) {
    var response: Int?
    do {
        val listMenu: String = """
            :: Bienvenido a Recipe Maker ::


            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()

    println(listMenu)

        response = readLine()?.toInt() ?: 0


        when (response) {
            1 -> printRecipes()
            2 -> print("Su lista de recetas es: ")
            3 -> print("Gracias por usar nuestros servicios")
            0 -> println("Digite un valor")
            else -> println("No está en alguno de los anteriores")
        }


    }while(response != 3)
}

fun printRecipes(){
    println("Los ingredientes son: ")
    for (recipe in ingredientes){
        println(recipe)
    }
}
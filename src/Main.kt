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
            1 -> makeRecipe()
            2 -> viewRecipe()
            3 -> print("Gracias por usar nuestros servicios")
            0 -> println("Digite un valor")
            else -> println("No está en alguno de los anteriores")
        }


    }while(response != 3)
}

fun makeRecipe(){
    val mensaje: String = """
        Hacer receta
        Selecciona por categoria el ingrediente que buscas
    """.trimIndent()
    println(mensaje)
    for (recipe in ingredientes){
        var index = 1
        println("$index. $recipe")
        index++
    }
}

fun viewRecipe(){
    println("Ver mis recetas")
}
/*fun main() {
    var idade = 0
    var nome = ""

    println("Qual seu nome?")   // Input = Entrada > Pedindo dados
    nome = readLine()!!         // Output = Saída  > Lendo dados

    println("Qual sua idade?")
    idade = readLine()!!.toInt()

    println("Seu nome é $nome e sua idade é $idade anos.")


}if (idade >= 18) {
    println("Pode Entrar!")
} else {
    println("Vá para casa!")

}

*/
/*

fun main() {

    var nome: String
    var escola: String
    var idade: Int



    println("Qual o seu nome?")
    nome = readLine()!!

    println("Qual a sua idade?")
    idade = readLine()!!.toInt()

    println("Qual o nome da sua escola? ")
    escola = readLine()!!

    println("O seu nome é $nome, você têm $idade anos e o nome da sua escola é $escola.")

}
*/

/*

fun main() {

    var idade = 0

    println("Qual sua idade?")

    idade = readLine()!!.toInt()

    if (idade <= 18) {
        println("PROIBIDO ENTRAR amigão!")
    } else {
        println("Pode entrar cavalheiro!")
    }

}

*/
/*
fun main() {

    var ano = 0

    println("Em qual ano estamos?")
    ano = readLine()!!.toInt()

    println(" O ano é $ano.")
}

*/


//fun main() {
//
//    var nome = ""
//
//    println("Qual o seu nome?")
//    nome = readLine()!!
//
//
//    println("Seu nome é $nome.")
//
//
//}


//fun main() {
//
//    var nome = ""
//    var idade = 0
//
//    println("Qual seu nome")
//    nome = readLine()!!
//
//    println("Qual sua idade")
//    idade = readLine()!!.toInt()
//
//    println("Seu nome $nome e sua idade é $idade.")
//}


fun main() {

    val numeros = listOf(8, 16, 32)

    val num = numeros.get(1)

    println(num)

}


//fun main() {
//
//    //Variável contador é do tipo inteiro e recebe o valor inicial 0
//    var contador = 0
//
//    //Enquanto o valor de contador que é 0 for menor ou igual a 10 essa condição será verdadeira
//    while (contador <= 10) {
//        //Ele vai imprimir o valor da variável contador até o loop terminar
//        println(contador)
//        //Ele está adicionando um número a mais a cada repetição do loop, até que a condição se torne falsa, quando o contador passar do valor 10
//        contador++
//
//    }
//
//}
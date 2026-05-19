import java.util.Scanner

fun main() {
    val teclado = Scanner(System.`in`)

    print("Informe o valor do Sálario: ")
    val salario: Double = teclado.nextDouble()
    teclado.close()

    if (salario <= 300) {
        val plBruto: Double = 500 + (salario * 0.7)
        val impRenda: Double = plBruto * 0.25
        val plLiquido: Double = plBruto - impRenda
        println("A Participacao de Lucro liquida é de: R$${"%.2f".format(plLiquido)}")
    } else if (salario <= 1000) {
        val plBruto = 200 + (salario * 0.5)
        val impRenda = plBruto * 0.25
        val plLiquido = plBruto - impRenda
        println("A Participacao de Lucro liquida é de: R$${"%.2f".format(plLiquido)}")
    } else {
        val plBruto = salario * 0.3
        val impRenda = plBruto * 0.25
        val plLiquido = plBruto - impRenda
        println("A Participacao de Lucro liquida é de: R$${"%.2f".format(plLiquido)}")
    }
}
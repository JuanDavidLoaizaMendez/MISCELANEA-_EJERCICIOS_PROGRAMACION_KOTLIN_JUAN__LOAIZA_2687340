package com.example.trabajojuandavidloaiza

import kotlin.math.pow

fun main() {
    var optionMain = ""
    println(" 1. Operadores \n 2. Condicionales \n 3. Ciclos \n Por favor seleccione una opcion: ")

    optionMain = readln()

    when (optionMain) {
        "1" -> println("${operators()}")
        "2" -> println("${conditionals()}")
        "3" -> println("${cycles()}")
        else -> println("WTF?")
    }

}//end main

fun operators() {
    var optionOperator = ""
    println(
        " 1. Calcular Area del triangulo \n 2. Ingresar dos números por teclado y sumarlos. \n 3. Ingresar un número y visualizar el número elevado al cuadrado. \n 4. Escribir un algoritmo que convierta de euros a dólares. \n 5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del\n" +
                "perímetro. \n 6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.\n 7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                "el área (pi*r)^2 del círculo inscrito.\n 8. Calcular el promedio de tres (3) números ingresados por teclado.\n 9.Menu principal"
    )

    println("Por favor seleccione una opcion: ")

    optionOperator = readln()

    when (optionOperator) {
        "1" -> println("${triangle()}")
        "2" -> println("${addition()}")
        "3" -> println("${power()}")
        "4" -> println("${convert()}")
        "5" -> println("${square()}")
        "6" -> println("${cylinder()}")
        "7" -> println("${circumference()}")
        "8" -> println("${average()}")
        "9" -> println("${main()}")
        else -> println("WTF?")

    }

}

fun conditionals() {
    var optionConditionals = ""
    println(
        " 1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo \n 2. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el\n" +
                "menor.\n 3. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.\n 4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.\n 5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero\n" +
                "no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.\n 6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos \n 7. Escribir un algoritmo que determine si un año es bisiesto o no.\n 8.Menu principal\""
    )

    println("Por favor seleccione una opcion: ")

    optionConditionals = readln()

    when (optionConditionals) {
        "1" -> println("${positiveOrNegative()}")
        "2" -> println("${greaterOrLess()}")
        "3" -> println("${propositiveIntegers()}")
        "4" -> println("${addOrSubtract()}")
        "5" -> println("${division()}")
        "6" -> println("${additionOrMultiplication()}")
        "7" -> println("${leapYear()}")
        "8" -> println("${main()}")
        else -> println("WTF?")
    }

}

fun cycles() {
    var optionCycles = ""
    println(
        " 1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.\n 2. Imprimir los números impares entre 0 y 100.\n 3. Imprimir los números pares del 1 al 100.\n 4. Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.\n 5. Escribir un programa que sume los cuadrados de los cien primeros números naturales,\n" +
                "mostrando el resultado en pantalla.\n 6. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente.\n 7. Sumar todos los números que se digitan por teclado mientras no sea cero \n 8. Menu principal"
    )

    println("Por favor seleccione una opcion: ")

    optionCycles = readln()

    when (optionCycles) {
        "1" -> println("${multiplesThree()}")
        "2" -> println("${odd()}")
        "3" -> println("${peers()}")
        "4" -> println("${numbersSquare()}")
        "5" -> println("${sumSquares()}")
        "6" -> println("${descendingNumbers()}")
        "7" -> println("${addAllNumbers()}")
        "8" -> println("${main()}")
        else -> println("WTF?")
    }

}


fun triangle() {

    println(" Operadores ejercicio 1")
    println("Ingrese a la base")
    val base = readln().toInt()
    println("Ingrese la altura")
    val height = readln().toInt()
    val area = (base * height) / 2
    println("El area es: $area")
    println("${operators()}\n")

}

fun addition() {
    println(" Operadores ejercicio 2 ")
    println("Ingrese el primer numero")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero")
    val num2 = readln().toInt()
    val additionS = num1 + num2
    println("El resultado es: $additionS")
    println("${operators()}\n")
}

fun power() {
    println(" Operadores ejercicio 3 ")
    println("Digite un numero")
    val num1 = readln().toInt()
    val exponent = 2
    val powerP = Math.pow(num1.toDouble(), exponent.toDouble())
    println("$powerP")
    println("${operators()}\n")
}

fun convert() {
    println(" Operadores ejercicio 4 ")
    println("Ingrese la cantidad de Euros")
    val euro = readln().toDouble()
    val dollar = 1.12269.toDouble()
    val conversion = euro * dollar
    println("$conversion")
    println("${operators()}\n")
}

fun square() {
    println(" Operadores ejercicio 5")
    println("Digite el lado del cuadrado: ")
    val side = readln().toDouble()
    val perimeter = side * 4.toDouble()
    val area = side * side.toDouble()
    println("El Area del cuadrado es: $area cm2 \n El perimetro del cuadrado es: $perimeter cm")
    println("${operators()}\n")
}

fun cylinder() {
    println(" Operadores ejercicio 6")
    println("Digite el Radio del cilindro")
    val radius = readln().toDouble()
    println("Digite la altura del cilindro")
    val heigh = readln().toDouble()
    val pi = 3.14
    val operationArea = 2 * pi * radius * (radius + heigh)
    val operationVolume = pi * heigh * radius.toDouble().pow(2)
    println("El Area del cilindro es: $operationArea cm2 \n El volumen del cilindro es: $operationVolume cm3")
    println("${operators()}\n")
}

fun circumference() {
    println(" Operadores ejercicio 7")
    println("Digite el Radio de la circunferencia")
    val radius = readln().toDouble()
    val pi = 3.14
    val operationLength = 2 * pi * radius
    val operationArea = pi * radius.toDouble().pow(2)
    println("La longitud de la circuferencia es: $operationLength \n El area de la circuferencia es: $operationArea")
    println("${operators()}\n")
}

fun average() {
    println(" Operadores ejercicio 8")
    println(" Digite el primer numero")
    val num1 = readln().toInt()
    println(" Digite el segundo numero")
    val num2 = readln().toInt()
    println(" Digite el tercer numero")
    val num3 = readln().toInt()
    val operationAverage = num1 + num2 + num3 / 3
    println("El promedio es: $operationAverage")
    println("${operators()}\n")

}
/*condicionales*/

fun positiveOrNegative() {
    println(" Condicionales ejercicio 1")
    println("Digite un numero ")
    val num = readln().toInt()
    if (num < 0) {
        println("El numero es negativo")
    } else {
        println("El numero es positivo")
    }
    println("${conditionals()}\n")
}

fun greaterOrLess() {
    println(" Condicionales ejercicio 2")
    println("Digite el primer numero ")
    val num1 = readln().toInt()
    println("Digite el segundo numero ")
    val num2 = readln().toInt()
    if (num1 == num2) {
        println("Los numeros son iguales")
    } else if (num1 < num2) {
        println("El $num1 es menor que $num2")
    } else if (num1 > num2) {
        println("El $num1 es mayor que $num2")
    }
    println("${conditionals()}\n")
}

fun propositiveIntegers() {
    println(" Condicionales ejercicio 3")
    println("Ingrese el primer numero")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero")
    val num2 = readln().toInt()
    println("Ingrese el tercer numero")
    val num3 = readln().toInt()
    if (num1 >= 0 && num2 >= 0 && num3 >= 0) {

        if ((num1 > num2) && (num2 > num3)) {
            println("$num1 es mayor y $num3 es menor")
        }
        else if ((num1 > num3) && (num3 > num2)) {
            println("$num1 es mayor y $num2 es menor")
        }
        else if ((num2 > num1) && (num1 > num3)) {
            println("$num2 es mayor y $num3 es menor")
        }
        else if ((num2 > num3) && (num3 > num1)) {
            println("$num2 es mayor y $num1 es menor")
        }
        else if ((num3 > num1) && (num2 > num1)) {
            println("$num3 es mayor y $num1 es menor")
        }
        else if ((num3 > num2) && (num1 > num2)) {
            println("$num3 es mayor y $num2 es menor")
        }
    }
    else {
        println("ERROR")
    }
    println("${conditionals()}\n")
}

fun addOrSubtract() {
    println(" Condicionales ejercicio 4")
    println("Digite el primer numero")
    val a = readln().toInt()
    println("Digite el segundo numero")
    val b = readln().toInt()
    if (a < b) {
        val add = a + b
        println(" $a + $b = $add ")
    } else {
        val sustract = a - b
        println(" $a - $b = $sustract ")
    }
    println("${conditionals()}\n")
}

fun division() {
    println(" Condicionales ejercicio 5")
    println("Digite el primer numero")
    val a = readln().toInt()
    println("Digite el segundo numero")
    val b = readln().toInt()
    if (b > 0) {
        val quotient = a / b
        println("$a / $b = $quotient")
    } else {
        println("La division no es posible")
    }
    println("${conditionals()}\n")
}

fun additionOrMultiplication() {
    println(" Condicionales ejercicio 6")
    println("Digite el primer numero")
    val a = readln().toInt()
    println("Digite el segundo numero")
    val b = readln().toInt()
    if (a < 0 || b < 0) {
        val add = a + b
        println(" $a + $b = $add ")
    } else {
        val multiplication = a * b
        println(" $a * $b = $multiplication ")
    }
    println("${main()}\n")
}

fun leapYear() {
    println(" Condicionales ejercicio 7")
    println("Digite el año que quiere averiguar si es bisiesto")
    val year = readln().toInt()

    if (year / 400 == 0) {
        println(" El $year es bisiesto ")
    } else if (year / 4 == 0 || year / 100 == 0) {
        println(" El $year es bisiesto ")
    } else {
        println("El $year no es un año bisiesto")
    }
    println("${conditionals()}\n")
}

/*ciclos*/

fun multiplesThree() {
    println(" Ciclos ejercicio 1")
    var i = 0
    while (i < 100) {
        println(i)
        i += 3
    }
    println("${cycles()}\n")
}

fun odd() {
    println(" Ciclos ejercicio 2")
    var i = 1
    while (i < 100) {
        println(i)
        i += 2
    }
    println("${cycles()}\n")
}

fun peers() {
    println(" Ciclos ejercicio 3")
    var i = 0
    while (i < 100) {
        println(i)
        i += 2
    }
    println("${cycles()}\n")
}

fun numbersSquare() {
    println(" Ciclos ejercicio 4")
    var i = 0
    while (i < 31) {
        val square = i.toDouble().pow(2)
        println(" $i ^ 2 = $square")
        i++
    }
    println("${cycles()}\n")
}

fun sumSquares() {
    println(" Ciclos ejercicio 5")
    var i = 0
    var answer = 0
    while (i < 101) {
        val square = i.toDouble().pow(2)
        val addition = square + i
        answer = addition.toInt()
        i++
    }
    println("la suma de los primeros 100 cuadrados es: $answer")
    println("${cycles()}\n")
}

fun descendingNumbers() {
    println(" Ciclos ejercicio 6")
    println("Digite el primer numero menor y el segundo mayor")
    println("Digite el numero menor")
    val minor = readln().toInt()
    println("Digite el numero mayor")
    val greater = readln().toInt()
    if (minor > greater) {
        println("ERROR")
    } else {
        for (i in minor..greater) {
            println(i)
        }
    }
    println("${cycles()}\n")
}

fun addAllNumbers() {
    println(" Ciclos ejercicio 7")
    println("Suma de todos los numeros mimentras no sea 0")
    println("Digite el numero")

    var addition = 0

    while (true) {
        var number = readln().toInt()
        if (number == 0) {
            break
        }
        addition += number
    }
    println("la suma de todos los numeros dados es: $addition")
    println("${cycles()}\n")
}










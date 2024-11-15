Algoritmo EncontrarNumeroMayor
    Definir num1, num2, num3, num4, num5, mayor Como Entero
	
    Escribir "Introduce el primer número:"
    Leer num1
    Escribir "Introduce el segundo número:"
    Leer num2
    Escribir "Introduce el tercer número:"
    Leer num3
    Escribir "Introduce el cuarto número:"
    Leer num4
    Escribir "Introduce el quinto número:"
    Leer num5
	
    mayor = num1
	
    Si num2 > mayor Entonces
        mayor = num2
    FinSi
	
    Si num3 > mayor Entonces
        mayor = num3
    FinSi
	
    Si num4 > mayor Entonces
        mayor = num4
    FinSi
	
    Si num5 > mayor Entonces
        mayor = num5
    FinSi
	
    Escribir "El número mayor es: ", mayor
FinAlgoritmo
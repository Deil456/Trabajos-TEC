Algoritmo EncontrarNumeroMayor
    Definir num1, num2, num3, num4, num5, mayor Como Entero
	
    Escribir "Introduce el primer n�mero:"
    Leer num1
    Escribir "Introduce el segundo n�mero:"
    Leer num2
    Escribir "Introduce el tercer n�mero:"
    Leer num3
    Escribir "Introduce el cuarto n�mero:"
    Leer num4
    Escribir "Introduce el quinto n�mero:"
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
	
    Escribir "El n�mero mayor es: ", mayor
FinAlgoritmo
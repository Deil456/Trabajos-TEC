Algoritmo SumarNumerosYDoblar
    Definir numero, suma, doble Como Entero
	
    Escribir "introduce un numero menor a cien:"
    Leer numero
	
    Si numero < 100 Entonces
        suma = 0
		
        Para i = 1 Hasta numero
            suma = suma + i
        FinPara
		
        doble = suma * 2
		
        Escribir "la suma de los numeros entre 1 y ", numero, " es: ", suma
        Escribir "el doble de la suma es: ", doble
    Sino
        Escribir "el numero ingresado no es menor a cien"
    FinSi
FinAlgoritmo
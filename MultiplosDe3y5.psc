Algoritmo MultiplosDe3y5
    Definir contador Como Entero
    contador = 0
	
    Para i = 1 Hasta 999
        Si i Mod 3 = 0 Y i Mod 5 = 0 Entonces
            contador = contador + 1
        FinSi
    FinPara
	
    Escribir "La cantidad de números menores de 1000 que son múltiplos de 3 y 5 es: ", contador
FinAlgoritmo

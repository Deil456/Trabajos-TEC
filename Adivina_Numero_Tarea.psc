Proceso Adivina_Numero 
	
	intentos<-10
	num_secreto <- azar(100)+1
	
	Escribir "Adivine el numero (de 1 a 100):"
	Leer num_ingresado
	Mientras num_secreto<>num_ingresado Y intentos>1 Hacer
		Si num_secreto>num_ingresado Entonces
			Escribir "Muy Bajo"
		SiNo
			Escribir "Muy alto"
		FinSi
		intentos <- intentos-1
		Escribir "Le quedan ",intentos," intentos:"
		Leer num_ingresado
	FinMientras
	
	Si num_secreto=num_ingresado Entonces
		Escribir "Muy bien usted adivino en ",11-intentos," intentos."
	SiNo
		Escribir "El numero era: ",num_secreto
		FinSi
	
FinProceso
	

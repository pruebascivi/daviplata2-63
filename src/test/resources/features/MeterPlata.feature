
@MeterPlata
Feature: Modulo Meter plata

  @CP020000M @Passed
  Scenario Outline: CP020000M_SYS_Validar Botones pantallas y funcionalidades de las opciones meter plata desde cualquier banco y en efectivo
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And esto es prueba
    And Valido la opcion meter plata desde home daviplata
    And Ingreso a la opción meter plata desde el home daviplata
    And Valido opciones desde donde se quiere meter la plata
    #And Valido opciones desde donde se quiere meter la plata
    And Validar opciones 'Desde cualquier banco' y 'En efectivo'
    And Ingreso a la opción de meter plata 'Desde cualquier banco'
    And Valido formulario de datos para Meter plata
    And Regreso a la opcion de donde quiero meter la plata
    And Ingreso a la opción de meter plata 'En efectivo'
    And Valido popUp informativo 'Cómo meter plata en efectivo' y botón 'Encontrar' activo
    And Acepto informacion de popUp
    And Valido pantalla del georeferenciador
    And Regresar a la pantalla de donde quiere meter plata
    And Ingreso a la opción de meter plata 'Desde cualquier banco'
    And Valido los campos correspondientes del formulario
    And Ingreso Numero celular <numCelularEspecial>
    And Valido longitud del numero ingresado
    And Valido que solo permita carácteres numéricos
    And Limpio campo del número ingresado
    And Ingreso número celular diferente de tres <numCelularDiferenteTres>
    And Valido que solo permita ingresar números que solo inician en tres
    And Limpio campo del número ingresado
    And Ingreso Número celular <numCelular>
    And Ingreso confirmación de número celular <confirmarNumCelularEspecial>
    And Valido longitud de la confirmacion del numero celular ingresado
    And Valido que solo permita caracteres numericos en la confirmacion del numero celular
    And Ingreso confirmacion de numero celular <numCelularConfirmacionDiferenteTres>
    And Valido que al confirmar el numero solo permita numeros que inicien en tres
    And Limpio campo del número ingresado
    And Limpio campo del número de confirmacion ingresado
    And Ingreso Número celular <numCelular>
    And Ingreso confirmación de número celular <numCelularConfirmacionDiferente>
    And Valido mensaje cuando los numeros ingresados no coinciden
    And Ingreso monto <monto>
    And Valido que el campo controle el monto maximo y minimo al meter plata
    And Validar puntos decimales en el campo y longitud de nueve
    And Desplegar la lista de los bancos
    And Validar lista de bancos habilitados para la transacción
    And Valido que no este presente el banco davivienda y la opcion daviplata
    And Ingreso caracteres alfanumericos en el campo de correo <correo>
    Then Validar que el campo de correo contenga caracteres alfanumericos

    Examples: 
      | tipoId | usuario    | contrasena | numCelularEspecial | numCelularDiferenteTres | numCelular   | numCelularConfirmacionDiferente | confirmarNumCelularEspecial | numCelularConfirmacionDiferenteTres | monto        | correo               |
      | "CC"   | "10050066" | "2589"     | "3126258200"       | "2126258200"            | "3126258200" | "3022177146"                    | "3126258200"                | "2126258200"                        | "6000000000" | "prueba45@gmail.com" |

	@CP04239M
  Scenario Outline: CP04239M_SYS_Validar proceso de meter plata al daviplata a traves de PSE Subtipo M35
	 	#Given obtener numero celular actual en redeban bolsillos <usuario>
    #And Consulté saldo disponible en redeban
    #And Validar en redeban subtipo topes <usuario> <subtipo>
    #And logout redeban subtipo
    And ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And Validé saldos iniciales del daviplata
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción 'Desde cuentas Davivienda' en el módulo meter plata
    And Ingreso monto <monto>
    And Doy clic en el botón continuar
    And Valido Pantalla de verificar informacion ingresada
    And Doy clic en el botón continuar información ingresada
    And Lleno información del sample en pse
    And Doy clic en boton finalizar
    Then Validar Saldo Final
    And obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban
    And logout redeban al finalizar consulta
    And Validar afectacion de saldos en redeban y daviplata    
		
    Examples: 
      | tipoId | usuario    | contrasena |  monto  | subtipo |
      | "CC"   | "10050066" | "2589"     |  "6000" | "BMO"   |
	
  @CP020001M @Passed
  Scenario Outline: CP020001M_SYS_Validar informacion y funcionalidades de la opcion meter plata en pse
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción 'Desde cuentas Davivienda' en el módulo meter plata
    And Valido que el correo en la transacción este precargado
    And Edito correo de transaccion <correo>
    And Validar correo nuevo ingresado
    And Ingreso monto a recargar en el daviplata <monto>
    And Doy clic en el botón continuar
    And Valido Pantalla de verificar informacion ingresada
    And Hacer clic en el botón atras
    And Valido Pantalla anterior del formulario
    And Valido boton necesito ayuda
    Then Validar las funciones del popUp salir de la app

    Examples: 
      | tipoId | usuario    | contrasena | correo             | monto  |
      | "CC"   | "10050066" | "2589"     | "prulab2@gmail.com" | "6000" |

  @CP020002M @Passed
  Scenario Outline: CP020002M_SYS_Validar transacciones e informacion suministrada por pse con usuario CC,TI,CE en la opcion banco union colombiano
    Given obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban
    And logout redeban al finalizar consulta
    And ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And Validé saldos iniciales del daviplata
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción de meter plata 'Desde cualquier banco'
    And Ingreso Numero celular <numCelular>
    And Ingreso confirmación de número celular <numCelularConfirmacion>
    And Ingreso monto <monto>
    And Desplegar la lista de los bancos
    And Escojo la opción banco <banco>
    And Ingreso caracteres alfanumericos en el campo de correo <correo>
    And Doy clic en el boton continuar del formulario desde otros bancos
    And Verifico que el costo de la transaccion sea cero
    And Valido información de la transaccion del meter plata
    And Doy clic en boton finalizar
    Then Validar Saldo Final
    And obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban
    And logout redeban al finalizar consulta
    And Validar afectacion de saldos en redeban y daviplata

    Examples: 
      | tipoId | usuario     | contrasena | monto  | numCelular   | numCelularConfirmacion | correo               | banco               		 |
      | "CC"   | "10050066"  | "2589"     | "6000" | "3221005049" | "3221005049"           | "prueba24@gmail.com" | "BANCO UNION COLOMBIANO" |
    	| "TI"   | "10010436"  | "1234"     | "6000" | "3000000000" | "3000000000"           | "prueba23@gmail.com" | "BANCO UNION COLOMBIANO" |
    	| "CE"   | "614567893" | "1234"     | "6000" | "3000000000" | "3000000000"           | "prueba25@gmail.com" | "BANCO UNION COLOMBIANO" |

  @CP020003M @Passed
  Scenario Outline: CP020003M_SYS_Validar meter plata exitoso desde banco "BANCO UNION COLOMBIANO" con usuario GMF
    Given obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban GMF
    And logout redeban al finalizar consulta
    And ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And Validé saldos iniciales del daviplata GMF
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción de meter plata 'Desde cualquier banco'
    And Ingreso Numero celular <numCelular>
    And Ingreso confirmación de número celular <numCelularConfirmacion>
    And Ingreso monto <monto>
    And Desplegar la lista de los bancos
    And Escojo la opción banco <banco>
    And Ingreso caracteres alfanumericos en el campo de correo <correo>
    And Doy clic en el boton continuar del formulario desde otros bancos
    And Verifico que el costo de la transaccion sea cero
    And Valido información de la transaccion del meter plata
    And Doy clic en boton finalizar
    Then Validar Saldo Final
    And obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban GMF
    And logout redeban al finalizar consulta
    And Validar afectacion de saldos en redeban y daviplata GMF

    Examples: 
      | tipoId | usuario     | contrasena | monto  | numCelular   | numCelularConfirmacion | correo               |  banco               		 |
      | "CC"   | "10050066"  | "2589"     | "6000" | "3221005049" | "3221005049"           | "prueba24@gmail.com" | "BANCO UNION COLOMBIANO" |
   
  @CP020004M @Passed
  Scenario Outline: CP020004M_SYS_Validar meter plata exitoso desde banco "BANCO UNION COLOMBIANO" con usuario con tipo documento CE
    Given obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban
    And logout redeban al finalizar consulta
    And ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And Validé saldos iniciales del daviplata
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción de meter plata 'Desde cualquier banco'
    And Ingreso Numero celular <numCelular>
    And Ingreso confirmación de número celular <numCelularConfirmacion>
    And Ingreso monto <monto>
    And Desplegar la lista de los bancos
    And Escojo la opción banco <banco>
    And Ingreso caracteres alfanumericos en el campo de correo <correo>
    And Doy clic en el boton continuar del formulario desde otros bancos
    And Verifico que el costo de la transaccion sea cero
    And Valido información de la transaccion del meter plata
    And Doy clic en boton finalizar
    Then Validar Saldo Final
    And Entro al modulo de movimientos
    And obtener numero celular actual en redeban bolsillos <usuario>
    And Consulté saldo disponible en redeban
    And logout redeban al finalizar consulta
    And Validar afectacion de saldos en redeban y daviplata

    Examples: 
      | tipoId | usuario    | contrasena | monto  | numCelular   | numCelularConfirmacion | correo           | banco                     |
			| "CE"   | "65753445" | "1234"     |"6000"  | "3138323720" | "3138323720"           |"ytre@gmail.com"  |  "BANCO UNION COLOMBIANO" |
      
  @CP020006M @Passed
  Scenario Outline: CP020006M_SYS_Validar el crédito con un DaviPlata que tenga el tope máximo y que ésta se rechace.
    Given obtener numero celular actual en redeban aumento de topes <usuario>
    And consulté saldo tarjeta en redeban aumento de topes
    And Validé tope actual en creditos <topeCredito>
    And logout redeban al finalizar consulta
    And ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And Validé saldos iniciales del daviplata
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción de meter plata 'Desde cualquier banco'
    And Ingreso Numero celular <numCelular>
    And Ingreso confirmación de número celular por teclado <numCelularConfirmacion>
    And Ingreso monto <monto>
    And Desplegar la lista de los bancos
    And Escojo la opción banco <banco>
    And Ingreso caracteres alfanumericos en el campo de correo <correo>
    And Doy clic en el bonton continuar del formulario desde otros bancos sin flujo adicional 
    And Valido rechazo de la transaccion
    And Regreso al home desde trasnsaccion
    #And Doy clic en boton finalizar
    And Validar Saldo Final
    And obtener numero celular actual en redeban aumento de topes <usuario>
    And consulté saldo tarjeta en redeban aumento de topes
    And logout redeban al finalizar consulta
    And Validar igualdad saldos topes

    Examples: 
      | tipoId | usuario    | contrasena | monto  | numCelular   | numCelularConfirmacion | correo           | topeCredito | banco                     |
			|  "CC"  |"10050098"  |"2589"      |"6000"  |"3221005082"  |"3221005082"            |"ytre@gmail.com"  |"1600000"    |  "BANCO UNION COLOMBIANO" |

  @CP020007M @Passed
  Scenario Outline: CP020007M_SYS_Validar en el Home el botón Meter Plata, según imagen 1 de la HU 5
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    When Ingreso a la opción meter plata desde el home daviplata
    Then Ingreso a la opción 'Desde cuentas Davivienda' en el módulo meter plata

    Examples: 
      | tipoId | usuario    | contrasena |
      | "CC"   | "10050066" | "2589"     |
      
  @CP020009M @Passed
  Scenario Outline: CP020009M_SYS_Validar que al realizar un Meter plata exitoso se visualiza en la campana de notificaciones- Transacciones el mensaje "Su Daviplata a sido cargado desde otro banco por $x.xxx"
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción 'Desde cuentas Davivienda' en el módulo meter plata
    And Edito correo de transaccion <correo>
    And Ingreso monto a recargar en el daviplata <monto>
    And Doy clic en el botón continuar
    And Valido Pantalla de verificar informacion ingresada
    And Doy clic en el boton continuar de informacion en recarga
    And Lleno información del sample en pse
    And Valido información de la transaccion del meter plata
    And Doy clic en boton finalizar
    Then Validar Saldo Final
    And ingreso a mensajes y notificaciones
    And Validar mensaje de recarga del daviplata

    Examples: 
      | tipoId | usuario    | contrasena | correo                 | monto   | subtipo |
      | "CC"   | "10050078" | "2589"     | "proplayer3@gmail.com" | "10000" | "BMO"   |
      
	@CP020010M @Passed
  Scenario Outline: CP020010M_SYS_Validar que al ingresar un Daviplata bloqueado genera el mensaje "Daviplata inválido"
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And Valido saldo inicial usuario recien registrado
    When Ingreso a la opción meter plata desde el home daviplata
    And Ingreso a la opción 'Desde cuentas Davivienda' en el módulo meter plata
    And Edito correo de transaccion <correo>
    And Edito número celular
    And Ingreso monto a recargar en el daviplata <monto>
    And Doy clic en el botón continuar
    Then Validar mensaje de numero de usuario invalido

    Examples: 
      | tipoId | usuario    | contrasena | correo                 | monto   | subtipo |
      | "CC"   | "10050078" | "2589"     | "proplayer4@gmail.com" | "10000" | "BMO"   |
   

package daviplata.nacional.iOS.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import daviplata.nacional.iOS.steps.negocioSteps;
import daviplata.nacional.iOS.utilidades.BaseUtil;
import net.thucydides.core.annotations.Steps;

public class negocioDefinitions {
	
	@Steps
	negocioSteps negocioStep;
	BaseUtil base;
	
	
	@Then("^validar campana de notificaciones$")
	public void validarCampanaDeNotificaciones() throws Exception {
		negocioStep.validarCampanaPerfilNegocio();
	}
	
	@Then("^validar visibilidad boton cerrar$")
	public void validarVisibilidadBotonCerrar() throws Exception {
		negocioStep.validarBotonCerrarPerfilNegocio();
	}
	
	@Then("^validar menu hamburguesa$")
	public void validarMenuHamburguesa() throws Exception {
		negocioStep.validarMenuHamburguesaPerfilNegocio();
	}
	
	@Then("^validar boton menu hamburguesa$")
	public void validarBotonMenuHamburguesa() throws Exception {
		negocioStep.validarBtnMenuHamburguesaPerfilNegocio();
	}
	
	@Then("^validar boton menu hamburguesa y opcion usar plata$")
	public void validarBotonMenuHamburguesaYOpcionUsarPlata() throws Exception {
		negocioStep.validarBtnMenuHamburguesaPerfilNegocioUsarPlata();
	}
	
	@When("^Ingreso a perfil negocio$")
	public void ingresoAPerfilNegocio() throws Exception {
		negocioStep.IrANegocio();
	}
	
	@Given("^Validé saldos iniciales del daviplata en perfil negocio$")
	public void validarSaldosInicialesDelDaviplataEnPerfilNegocio() {
		negocioStep.verificarSaldoInicialNegocio();
	}
	
	@When("^Ingreso a perfil persona$")
	public void ingresoAPerfilPersona() throws Exception {
		negocioStep.IrAPersona();	
	}
	
	@When("^Valido boton cambio perfil desde perfil persona$")
	public void ValidoBotonCambioPerfilDesdePerfilPersona() throws Exception {
		negocioStep.validarBtnIrASuNegocio();
		
	}
	
	@When("^Flujo cambiar foto$")
	public void flujoCambiarFoto() throws Exception {
		negocioStep.flujoCambiarFoto();
		
	}
	
	@When("^Ingresar a menu hamburguesa perfil negocio$")
	public void ingresarAMenuHamburguesaPerfilNegocio() throws Exception {
		negocioStep.irAMenuHamburguesaPerfilNegocio();
		
	}
	
	@When("^Flujo cambiar foto perfil negocio$")
	public void flujoCambiarFotoPerfilNegocio() throws Exception {
		negocioStep.flujoCambiarFotoPerfilNegocio();
		
	}
	
	@When("^validar cambio de foto$")
	public void validarCambioDeFoto() throws Exception {
		negocioStep.validarCambioFoto();
		
	}
	
	@When("^validar cambio de foto perfil negocio$")
	public void validarCambioDeFotoPerfilNegocio() throws Exception {
		negocioStep.validarCambioFotoPerfilNegocio();
		
	}
	
	@Then("^nombre del negocio$")
	public void validarNombrePerfilNegocio() throws Exception {
		negocioStep.nombrePerfilNegocio();
		
	}

	@Then("^Valido cuanto tengo$")
	public void validoCuantoTengo() throws Exception {
		negocioStep.ValidarSaldoNegocio();
		
	}
	
	@When("^ingreso a pasar plata$")
	public void ingresoAPasarPlata() throws Exception {
		negocioStep.clickPasarPlataHome();
	}

	@Then("^Valido pasar plata$")
	public void validoPasarPlata() throws Exception {
		negocioStep.ValidarPasarPlataHome();
	}
	
	@When("^ingreso a sacar plata$")
	public void ingresoASacarPlata() throws Exception {
		negocioStep.clickSacarPlataHome();
	}

	@Then("^Valido boton sacar plata$")
	public void validoBotonSacarPlata() throws Exception {
		negocioStep.ValidarSacarPlataHome();
	}
	
	@Then("^flujo crear negocio zona publica \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void flujoCrearNegocioZonaPublica(String contrasena, String nombre, String monto, String casa, String correo) throws Exception {
		negocioStep.creacionNegocioZonaPublica(contrasena,nombre,monto,casa,correo);
	}
	
	@Then("^Valido boton cambio perfil desde perfil negocio$")
	public void ValidoBotonCambioPerfilDesdePerfilNegocio() throws Exception {
		negocioStep.validoBotonIrPerfilUsuario();
	}
	
	@Then("^ingresar a opcion pasar plata$")
	public void ingresarAOpcionPasarPlata() throws Exception {
		negocioStep.ingresarOpcionPasarPlataPerfilNegocio();
	}
	
	@Then("^ingresar a opcion pasar plata MH$")
	public void ingresarAOpcionPasarPlataMH() throws Exception {
		negocioStep.ingresarOpcionPasarPlataPerfilNegocioMH();
	}
	
	@Then("^ingresar a opcion sacar plata$")
	public void ingresarAOpcionSacarPlata() throws Exception {
		negocioStep.ingresarOpcionSacarPlataPerfilNegocio();
	}
	
	@When("^ingresar a otro daviplata perfil negocio$")
	public void ingresarAOtroDaviplataPerfilNegocio() throws Exception {
		negocioStep.ingresarOpcionAOtroDaviplataPerfilNegocio();
	}
	
	@Then("^flujo pasar plata y validacion de la transaccion (.*)$")
	public void flujoPasarPlataYValidacionDeLaTransaccion(String numCelular) throws Exception {
		negocioStep.flujoPasarPlataAOtroDaviplataPerfilNegocio(numCelular);
	}
	
	@When("^Flujo de sacar plata$")
	public void flujoDeSacarPlata() throws Exception {
		negocioStep.flujoSacarPlataPerfilNegocio();
	}
	
	@When("^validar boton mas servicios$")
	public void validarBotonMasServicios() throws Exception {
		negocioStep.validacionBtnMasServicios();
	}
	
	@When("verifico opcion abrir punto de venta")
	public void verificarAbrirPuntoDeVenta() throws Exception {
		negocioStep.verificarAbrirPuntoVenta();
	}
	
	@When("abro nuevo punto de venta")
	public void abroNuevoPuntoDeVenta() throws Exception {
		negocioStep.abrirPuntoDeVenta();
	}
	@When("completo datos para crear el punto de venta \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
	public void completoDatosParaCrearElPuntoDeVenta(String puntoVentaName, String ciudad, String tipoDireccion) throws Exception {
		negocioStep.completarFormularioCrearPuntoDeVenta(puntoVentaName, ciudad, tipoDireccion);
	}
	
	
	@When("^Ingresar a ver movimientos$")
	public void ingresarAVerMovimientos() throws Exception {
		negocioStep.verMovimientosPerfilNegocio();
	}
	
	@When("^validar movimientos de ventas$")
	public void validarMovimientosDeVentas() throws Exception {
		negocioStep.validarMovimientosPerfilNegocio();
	}
	
	@When("^Ingresar a actualizar datos y validar la opcion$")
	public void  ingresarAActualizarDatosYValidarLaOpcion() throws Exception {
		negocioStep.actualizacionDatosPerfilNegocio();
	}
	
	@When("^Ingresar a actualizar datos$")
	public void  ingresarAActualizarDatoDeCorreo() throws Exception {
		negocioStep.actualizarDatosPerfilNegocio();
	}
	
	@When("^Actualizar correo perfil negocio \"([^\"]*)\"$")
	public void  actualizarCorreoPerfilNegocio(String correoNuevo) throws Exception {
		negocioStep.actualizarCorreoPerfilNegocio(correoNuevo);
	}
	
	@When("^Actualizar nombre negocio \"([^\"]*)\"$")
	public void  actualizarNombreNegocio(String nombreNegocioNuevo) throws Exception {
		negocioStep.actualizarNombrePerfilNegocio(nombreNegocioNuevo);
	}
	
	@When("^Actualizar direccion negocio \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void  actualizarDireccionNegocio(String tipoVia, String numeroUno, String numeroDos, String numeroTres) throws Exception {
		negocioStep.actualizarDireccionPerfilNegocio(tipoVia, numeroUno, numeroDos, numeroTres);
	}
	
	@When("^Actualizar ciudad \"([^\"]*)\"$")
	public void  actualizarCiudad(String ciudadNueva) throws Exception {
		negocioStep.actualizarCiudadPerfilNegocio(ciudadNueva);
	}
	
	@When("^Actualizar que vende \"([^\"]*)\"$")
	public void  actualizarQueVende(String ventaNueva) throws Exception {
		negocioStep.actualizarVentasPerfilNegocio(ventaNueva);
	}
	
	
	@When("^Validar actualizacion de datos$")
	public void  validarActualizacionDatos() throws Exception {
		negocioStep.validarActualizacionDatosPerfilNegocio();
	}
	
	@When("^Validar actualizacion de direccion$")
	public void  validarActualizacionDeDireccion() throws Exception {
		negocioStep.validarActualizacionDatosDireccionPerfilNegocio();
	}
	
	@When("^validar boton 'vender' de zona publica$")
	public void validarbotonVenderDeZonaPublica() throws Exception {
		negocioStep.valdacionBotonVender();
	}
	
	@When("^validar ingreso a creacion de negocio$")
	public void validarIngresoACreacionDeNegocio() throws Exception {
		negocioStep.validacionIngresoCreacionNegocio();
	}
	
	@When("^ir opcion crear catalogo$")
	public void irOpcionCrearCatalogo() throws Exception {
		negocioStep.ingresarAOpcionCrearCatalogo();
	}
	
	@When("^flujo crear catalogo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void flujoCrearCatalogo(String nombreCatalogo, String nombreCategoria, String nombreProducto, String nombreContacto, String numeroContacto, String colorReferencias, String unidadesDisponibles, String valorProducto) throws Exception {
		negocioStep.creacionCatalogo(nombreCatalogo, nombreCategoria, nombreProducto, nombreContacto, numeroContacto, colorReferencias, unidadesDisponibles, valorProducto);
	}
	
	@When("^flujo crear catalogo sin referencia \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void flujoCrearCatalogoSinReferencia(String nombreCatalogo, String nombreCategoria, String nombreProducto, String nombreContacto, String numeroContacto, String unidadesDisponibles, String valorProducto) throws Exception {
		negocioStep.creacionCatalogoSinReferencia(nombreCatalogo, nombreCategoria, nombreProducto, nombreContacto, numeroContacto, unidadesDisponibles, valorProducto);
	}
	
	@When("^validar creacion catalogo$")
	public void validarCreacionCatalogo() throws Exception {
		negocioStep.validarCreacionCatalogo();
	}
	
	@When("^Validar catalogo$")
	public void validarCatalogo() throws Exception {
		negocioStep.validarCatalogo();
	}
	
	@When("^Ingreso a catalogo creado$")
	public void ingresoACatalogoCreado() throws Exception {
		negocioStep.ingresarACatalogo();
	}
	
	@Then("^Validar opciones compartir editar eliminar$")
	public void validarOpcionesCompartirEditarEliminar() throws Exception {
		negocioStep.validacionOpcionesCatalogo();
	}
	
	@Then("^Validar opcion editar producto catalogo$")
	public void validarOpcionEditarProductoCatalogo() throws Exception {
		negocioStep.validacionOpcionEditarProductoCatalogo();
	}
	
	@Then("^Validar opcion compartir$")
	public void validarOpcionCompartir() throws Exception {
		negocioStep.validacionOpcionCompartir();
	}
	
	@Then("^Validar opcion eliminar$")
	public void validarOpcionEliminar() throws Exception {
		negocioStep.validacionOpcionEliminarCatalogo();
	}
	
	@Then("^Ingresar a codigo QR$")
	public void ingresarACodigoQR() throws Exception {
		negocioStep.ingresarACodigoQR();
	}
	
	@Then("^Creación QR sin valor$")
	public void creacionQRSinValor() throws Exception {
		negocioStep.creacionQRSinValor();
	}
	
	@Then("^Creación QR con valor \"([^\"]*)\"$")
	public void creacionQRConValor(String valor) throws Exception {
		negocioStep.creacionQRConValor(valor);
	}
	
	@When("^Creación QR con valor tope minimo \"([^\"]*)\"$")
	public void creacionQRConValorMinimo(String valorMinimo) throws Exception {
		negocioStep.creacionQRConValorMinimo(valorMinimo);
	}
	
	@When("^Creación QR con valor tope maximo \"([^\"]*)\"$")
	public void creacionQRConValorMaximo(String valorMaximo) throws Exception {
		negocioStep.creacionQRConValorMaximo(valorMaximo);
	}
	
	@Then("^Validar QR Creado$")
	public void validarQRCreado() throws Exception {
		negocioStep.validarQRCreado();
	}
	
	@Then("^Validar QR Creado con valor aleatorio$")
	public void validarQRCreadoValorAleatorio() throws Exception {
		negocioStep.validarQRCreadoValorAleatorio();
	}
	
	@When("^Validar QR Creado con valor minimo$")
	public void validarQRCreadoValorMinimo() throws Exception {
		negocioStep.validarQRCreadoValorMinimo();
	}
	
	@Then("^Validar QR Creado con valor maximo$")
	public void validarQRCreadoValorMaximo() throws Exception {
		negocioStep.validarQRCreadoValorMaximo();
	}
	
	@Then("^Validar descarga pdf sin valor$")
	public void validarDescargaPdfSinValor() throws Exception {
		negocioStep.validarDescargaQR();
	}
	
	@Then("^Validar descarga pdf con valor$")
	public void validarDescargaPdfConValor() throws Exception {
		negocioStep.validarDescargaQRConValor();
	}
	
	@Then("^Validar compartir QR sin valor$")
	public void validarCompartirQRSinValor() throws Exception {
		negocioStep.validarCompartirQR();
	}
	
	@Then("^Validar compartir QR con valor$")
	public void validarCompartirQRConValor() throws Exception {
		negocioStep.validarCompartirQRConValor();
	}
	
	@Then("^Ingresar a opcion sacar plata home$")
	public void ingresarAOpcionSacarPlataHome() throws Exception {
		negocioStep.ingresarOpcionSacarPlataHomePerfilNegocio();
	}
	
	@Then("^Ingresar a opcion pasar plata home$")
	public void ingresarAOpcionPasarPlataHome() throws Exception {
		negocioStep.ingresarOpcionPasarPlataHomePerfilNegocio();
	}
	
	@Then("^Ingresar a cuenta de ahorros perfil negocio$")
	public void ingresarACuentaDeAhorros() throws Exception {
		negocioStep.irACuentaDeAhorros();
	}
	
	@Then("^flujo pasar plata y validar la transaccion \"([^\"]*)\"$")
	public void flujoPasarPlataYValidarLaTransaccion(String numCuenta) throws Exception {
		negocioStep.flujoPasarPlataACuentaAhorrosPerfilNegocio(numCuenta);
	}
	
	@Then("^Ingresar a cuenta corriente perfil negocio$")
	public void ingresarACuentaCorriente() throws Exception {
		negocioStep.irACuentaCorriente();
	}
	
	@Then("^flujo pasar plata y validar la transaccion a cuenta corriente \"([^\"]*)\"$")
	public void flujoPasarPlataYValidarLaTransaccionACuentaCorriente(String numCuenta) throws Exception {
		negocioStep.flujoPasarPlataACuentaCorrientePerfilNegocio(numCuenta);
	}
	
	@Then("^Ingresar a otros bancos perfil negocio$")
	public void ingresarAOtrosBancos() throws Exception {
		negocioStep.irAOtrosBancos();
	}
	
	@Then("^Ingresar a otros bancos en linea perfil negocio$")
	public void ingresarAOtrosBancosEnLinea() throws Exception {
		negocioStep.irAOtrosBancosEnLinea();
	}
	
	@Then("^flujo pasar plata y validar la transaccion a otros bancos \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void flujoPasarPlataYValidarLaTransaccionAOtrosBancos(String numeroProducto, String numId, String montoAPasar, String motivoPasarPlata) throws Exception {
		negocioStep.flujoPasarPlataAOtrosBancosPerfilNegocio(numeroProducto,numId,montoAPasar,motivoPasarPlata);
	}
	
	@Then("^flujo pasar plata y validar la transaccion a otro banco en linea \"([^\"]*)\"\"([^\"]*)\"$")
	public void flujoPasarPlataYValidarLaTransaccionAOtroBancoEnLinea(String numCelular, String monto) throws Exception {
		negocioStep.flujoPasarPlataAOtroBancoEnLineaPerfilNegocio(numCelular,monto);
	}
	
	@When("^Ingreso a perfil negocio para validar funcionalidad del boton$")
    public void ingresoAPerfilNegocioParaValidarFuncionalidadDelBoton() throws Exception {
        negocioStep.validarCambioDePerfilANegocio();
        
    }
	
	@When("^Valido ingreso al perfil negocio$")
    public void validoIngresoAlPerfilNegocio() throws Exception {
        negocioStep.validarElPerfilNegocio();
    }
	
	@When("^Ingreso a perfil persona para validar funcionalidad del boton$")
    public void ingresoAPerfilPersonaParaValidarFuncionalidadDelBoton() throws Exception {
        negocioStep.ingresarAPerfilPersona();
        
    }
	
	@When("^Valido ingreso al perfil persona$")
    public void validoIngresoAlPerfilPersona() throws Exception {
        negocioStep.validarElPerfilPersona();
    }
	
	@When("^Ingreso a la opcion mas servicios$")
    public void ingresoALaOpcionMasServicios() throws Exception {
        negocioStep.ingresarALaOpcionMasServicios();
    }
    
    @When("^Ingreso a la opcion de administrar mi negocio$")
    public void ingresoALaOpcionDeAdministrarMiNegocio() throws Exception {
        negocioStep.ingresoEnAdministrarMiNegocio();
    }
    
    @When("^Creo punto de venta \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void creoPuntoDeVenta(String nombrePuntoVenta, String ciudad, String primerNumeroDireccion, String segundoNumeroDireccion, String tercerNumeroDireccion) throws Exception {
        negocioStep.crearFlujoDePuntoVenta(nombrePuntoVenta, ciudad, primerNumeroDireccion, segundoNumeroDireccion, tercerNumeroDireccion);
    }
    
    @Then("^Validar creacion punto de venta$")
    public void validarCreacionPuntoDeVenta() throws Exception {
        negocioStep.validarCreacionPuntoVenta();
    }
    
    @When("^Creo vendedor \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void creoVendedor(String tipoDocumento, String nombreVendedor, String numeroDocumento, String numeroDeCelular) throws Exception {
        negocioStep.crearVendedor(tipoDocumento, nombreVendedor, numeroDocumento, numeroDeCelular);
    }
    
    @Then("^Validar que permita actualizar los datos en punto venta y en vendedor \"([^\"]*)\"\"([^\"]*)\"$")
    public void validarQuePermitaActualizarDatosVendedorYVenta(String nombrePuntoVentaDos, String numeroDeCelularDos) throws Exception {
        negocioStep.validarQuePermitaActualizarDatosVendedorYVenta(nombrePuntoVentaDos,numeroDeCelularDos);
    }
    
    @Then("^Validar que permita eliminar punto venta y vendedores$")
    public void validarQuePermitaEliminarVendedorYVenta() throws Exception {
        negocioStep.validarQuePermitaEliminarVendedorYVenta();
    }
    
    @Then("^Selecciono el botón enlace de pago opcion dos$")
    public void seleccionoElBotonEnlaceDePagoOpcionDos() throws Exception {
        negocioStep.seleccionoElBotonEnlaceDePagoOpcionDos();
    }
    
    @Then("^Realizo la creación del enlace de pago mis productos$")
    public void RealizoLaCreacionDeLaVenta() throws Exception {
        negocioStep.RealizoLaCreacionDeLaVenta();
    }
    
    @Then("^Selecciono más ingresos para su negocio desde el home$")
    public void seleccionoMasIngresosParaSuNegocioHome() throws Exception {
        negocioStep.seleccionoMasIngresosParaSuNegocioHome();
    }
    
    @Then("^Ingreso a tienda virtual y realizo una compra$")
    public void ingresoATiendaVirtualYRealizoUnaCompra() throws Exception {
        negocioStep.ingresarATiendaVirtualDesdeMasIngresos();
    }
    
    @Then("^Regreso un módulo atrás$")
    public void regresoUnModuloAtras() throws Exception {
        negocioStep.regresarXVeces();
    }
    
    @Then("^Regreso desde movimientos desde la opcion más ingresos$")
    public void regresoDesdeMovimientosDesdeLaOpcionMasIngresos() throws Exception {
        negocioStep.regresarDesdeMovimientosOpcionIngresos();
    }
    
    @Then("^Ingreso y descargo el extracto de los movimientos$")
    public void ingresoYDescargoElExtractoDeLosMovimientos() throws Exception {
        negocioStep.descargarExtractosDesdeMovimientos();
    }
    
    @Then("^Ingreso a los movimientos desde la opcion más ingresos$")
    public void ingresoALosMovimientosDesdeLaOpcionMasIngresos() throws Exception {
        negocioStep.ingresarAMovimientosDesdeMasIngresos();
    }
    
    @Then("^Regreso al home elemento back visible$")
    public void regresoAlHomeElementoBackVisible() throws Exception {
        negocioStep.backToHome();
    }
    
    @Then("^Selecciono la creación del enlace de pago Otros \"([^\"]*)\" \"([^\"]*)\"$")
    public void SeleccionoLaCreacionDelEnlaceDePagoOtros(String descripcion, String valor) throws Exception {
        negocioStep.SeleccionoLaCreacionDelEnlaceDePagoOtros(descripcion, valor);
    }
}


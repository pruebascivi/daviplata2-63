#Author: Anderson Alexader González Ruiz
@movimientos
Feature: Movimientos casos

  @CP0490M @movimientos12
  Scenario Outline: CP0490M_SYS_Validar que se muestren los movimientos del DaviPlata
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    And selecciono ver movimientos
    Then validar que se muestren los movimientos

    Examples: 
      | tipoId | usuario   | contrasena |
      | "CC"   | "1020770032" | "1342"     |

  @CP0500M @movimientos12
  Scenario Outline: CP0500M_SYS_Validar que permita filtrar los movimientos del DaviPlata
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    #When selecciono menu hamburguesa
    And selecciono ver movimientos
    And filtro movimientos
    Then validar que se muestren los movimientos filtrados

    Examples: 
      | tipoId | usuario   | contrasena |
      | "CC"   | "1020770032" | "1342"     |

  @CP0510M @movimientos12
  Scenario Outline: CP0510M_SYS_Validar que permita enviar por correo los movimientos del DaviPlata
    Given ingreso usuario y contrasena <tipoId> <usuario> <contrasena>
    When selecciono menu hamburguesa
    And selecciono ver movimientos
    And filtro movimientos
    Then validar que se muestren los movimientos filtrados
    And validar envio de movimientos a correo

    Examples: 
      | tipoId | usuario   | contrasena |
      | "CC"   | "1020770032" | "1342"     |

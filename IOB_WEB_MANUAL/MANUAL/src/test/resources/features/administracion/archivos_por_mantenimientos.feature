Feature: Configuración de bancos ACH con código Swift en el sitio administrativo de IOB

  Background:
    Given que soy un usuario parametrizador del sitio administrativo de IOB
    And tengo acceso a la sección de proveedores

  Scenario: Visualización de la nueva sección de configuración de bancos
    When ingreso a la sección de proveedores
    Then debo ver una nueva sección para configurar bancos con código Swift

  Scenario: Ingreso de un nuevo banco con código Swift
    Given que estoy en la sección de configuración de bancos
    When ingreso un nuevo código Swift
    And escribo el nombre del banco correspondiente
    And selecciono si tiene ACH Xpress como "Sí"
    And selecciono si valida cuenta nombre como "No"
    Then el banco debe guardarse correctamente en el sistema

  Scenario: Validación de campos obligatorios
    Given que estoy en la sección de configuración de bancos
    When intento guardar sin ingresar el código Swift o el nombre del banco
    Then el sistema debe mostrar un mensaje de error indicando que los campos son obligatorios

  Scenario: Edición de un banco existente
    Given que un banco ya ha sido configurado
    When modifico el valor de “Valida cuenta nombre” a “Sí”
    And guardo los cambios
    Then el sistema debe actualizar la información correctamente

  Scenario: Visualización de bancos configurados
    Given que existen bancos configurados en el sistema
    When ingreso a la sección de configuración de bancos
    Then debo ver una lista con los códigos Swift, nombres, y configuraciones de ACH Xpress y Validación Cuenta Nombre

  Scenario: Validación de opciones de selección
    Given que estoy configurando un banco
    Then los campos “Tiene ACH Xpress” y “Valida cuenta nombre” deben permitir solo las opciones “Sí” o “No”

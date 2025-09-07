package com.banistmo.certificacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/administracion/archivos_por_mantenimientos.feature",
        glue = "com.banistmo.certificacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {}

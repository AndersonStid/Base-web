package com.banistmo.certificacion.mispagos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target TXT_USER = Target.the("Text field User").
            located(By.id("mat-input-0"));
    public static final Target TXT_PASSWAORD = Target.the("Text field User").
            located(By.id("mat-input-1"));
    public static final Target BTN_GET_INTO = Target.the("Enter button").
            located(By.xpath("//form/div/button/span[2]"));
    public static final Target TEXT_ERROR = Target.the("Compare text").
            located(By.id("swal2-html-container"));
    public static final Target TEXT_SUCCESSFULL_LOGIN = Target.the("Compare text").
            located(By.xpath("//*[@id=\"Madonna\"]/a"));

    private Login() {
    }
}

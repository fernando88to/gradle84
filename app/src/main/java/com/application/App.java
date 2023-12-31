/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.application;

import java.math.BigDecimal;
import java.util.FormatProcessor;
import java.util.Locale;

import static java.util.FormatProcessor.FMT;

public class App {
    public String getGreeting() {
        String a = "a";
        String b = "b";
        String teste = STR. """
         Testando
         \{ a }
         \{ b }
         """ ;

        return teste;
    }

    public String getNumero() {
        // Criação de um BigDecimal
        BigDecimal valor = new BigDecimal("12345.6789");

        // Criação do FormatProcessor com o Locale brasileiro
        FormatProcessor fmt = FormatProcessor.create(new Locale("pt", "BR"));

        // Interpolação e formatação do BigDecimal no formato brasileiro
        String resultado = fmt. "R$ %,.2f\{ valor }" ;
        return resultado;


    }

    public String getJson() {
        String nome = "fernando";
        int idade = 15;
        return FMT. """
      {
        "nome": "\{ nome }",
        "idade": \{ idade }
      }
      """ ;
    }

    public static void main(String[] args) {
        System.out.println(new App().getJson());
    }
}

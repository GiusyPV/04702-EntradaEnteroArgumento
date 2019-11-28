/*
 * Copyright 2019 Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //Constantes numéricas
    public static final String MSG_USR = "Introducir número ....: ";
    public static final String MSG_OUT = "Número introducido ...: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    //Lógica aplicacion
    public final void launchApp() {

        //Cabecera
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        //Introducir dato
        int n = (int) obtener(MSG_USR, MSG_ERR);

        //separador
        System.out.println("---");

        //Mostrar Dato
        System.out.printf(MSG_OUT + "%d%n", n);

    }
    
    public static final double obtener(String msgUsr, String msgErr) {
        double numero = 0;
        boolean errorOK = true;
        
        do {
            try {

                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                errorOK = false;
                
            } catch (Exception e) {
                System.out.println(msgErr);
                
                System.out.println("---");
            } finally {
                SCN.nextLine();
            }

        } while (errorOK);
        return numero;
    }

}

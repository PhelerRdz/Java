/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 * 
 * EQUIPO
 * 
 * INTEGRANTES:
 * NOMBRE1
 * NOMBRE2
 * 
 * CONTACTO EQUIPO: 
 */

package Unidad3_MetodosEspeciales.Ejemplo2;

import java.util.Comparator;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class OrdenarPorMarca implements Comparator<Computadora>{

    @Override
    public int compare(Computadora t, Computadora t1) {
        return t.getMarca().compareTo(t1.getMarca());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import manejodearchivos.ManejoDeArchivos;
/**
 *
 * @author Alumno Mañana
 */
public class PPal {
    public static void main(String[] args) {
        String nombreArchivo="prueba.txt";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
        ManejoDeArchivos.escribirArchivos(nombreArchivo," Soy el contenido");
        ManejoDeArchivos.agregarArchivo(nombreArchivo,"Hola hola a todos");
        
    }
}

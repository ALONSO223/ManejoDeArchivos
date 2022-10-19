/*
Nuestra calse Manejo|deArchivos va a contener los siguientes métods
-Crear marchivo
-Guardar informacion de un archivo
-Eliminar información de un archivo
-Eliminar un archivo
 */
package manejodearchivos;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {

    /**
     * @param nombre
     */
    public static void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
        
    }
    
    
    
    public static void escribirArchivos(String nombre, String contenido){
        
        PrintWriter salida = null;
        File archivo = new File(nombre);
     
        try { //se que el fichero existe
            salida = new PrintWriter(archivo);
            salida.print(contenido);
            System.out.println("Se ha creado el archivo correctamente.");
        } catch (FileNotFoundException ex) { //el fichero existe => excepcion
            ex.printStackTrace(System.out);
        } finally { //siempre se ejecuta
            salida.close();
        
        
        } 
    }
    public static void agregarArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File (nombre);
        try {
            salida = new PrintWriter(new FileWriter(nombre,true));
            salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{
            salida.close();
        }
    }
    public static void leerArchivo (String nombre) throws FileNotFoundException{
        BufferedReader entrada = null;
         
        //Declaramos el archivo
        File archivo = new File (nombre);
        try {
            //Creamos el descriptor de lecctura del fichero
           entrada = new BufferedReader(new FileReader(archivo));
            String lectura= entrada.readLine();
            //recorremos lectura hasta fin de fichero
            while(lectura!=null){
                System.out.println("Lectura= "+lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }finally{
            
        }
      
    }
    
    public static void leerArchivoPorPalabra(String nombre){
        File archivo = new File(nombre);
        try {
            Scanner entrada = new Scanner (archivo);
            int cont=0;
            
            //Recorremos el fichero hasta fin
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont= cont+1;
            }
            System.out.println("Número de palabras de mi fichero = "+cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
}

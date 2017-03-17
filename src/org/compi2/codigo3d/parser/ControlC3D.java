package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */

//HOJA DE TRABAJO 3 - CORTOCIRCUITO LISTO
//Nombre : María Fernanda Rodríguez Santos
//Carné: 201020946

public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    
    private static int etiqueta= 0;
    private static String etiquetaV="";
    private static String etiquetaF="";
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        
        etiqueta=0;
        etiquetaV="";
        etiquetaF="";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    
    public static String generarEtiqueta()
    {
        return "L"+etiqueta++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    public static void agregarEtiquetaV(String etiqueta){
        if(etiquetaV.equals("")){
            etiquetaV=etiqueta;
        }else{
            etiquetaV+=","+etiqueta;
        }
    }
    
    public static void agregarEtiquetaF(String etiqueta){
        if(etiquetaF.equals("")){
            etiquetaF=etiqueta;
        }else{
            etiquetaF+=","+etiqueta;
        }
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        if(etiquetaV.equals("")||etiquetaF.equals("")){
            c3d += "//Ultimo valor: t" +(temp-1);
            return c3d;
        }else{
            c3d += "//Etiqueta de verdadero:"+etiquetaV+"\n";
            c3d += "//Etiqueta de Falso:"+etiquetaF+"\n";
            return c3d;
        }
        
    }
    
}

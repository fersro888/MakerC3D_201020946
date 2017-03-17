package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */

//HOJA DE TRABAJO 3 - CORTOCIRCUITO LISTO
//Nombre : María Fernanda Rodríguez Santos
//Carné: 201020946

public class NodoC3D {
    private String cad;
    private String etiquetaV;
    private String etiquetaF;

    public NodoC3D(String cad) {
        this.cad = cad;
        this.etiquetaF="";
        this.etiquetaV="";
    }
    
    public NodoC3D(String cad, String etiquetaV, String etiquetaF){
        this.cad=cad;
        this.etiquetaV=etiquetaV;
        this.etiquetaF= etiquetaF;
    }
    
    public String getCad(){
        return cad;
    }
    
    public void setEtiquetaV(String etiquetaV)
    {
        this.etiquetaV= etiquetaV;
    }
    
    public String getEtiquetaV()
    {
        return this.etiquetaV;
    }
    
    public void setEtiquetaF(String etiquetaF)
    {
        this.etiquetaF= etiquetaF;
    }
    
    public String getEtiquetaF()
    {
        return this.etiquetaF;
    }
        
}

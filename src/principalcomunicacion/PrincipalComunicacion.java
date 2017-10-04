package principalcomunicacion;

// @author R2

public class PrincipalComunicacion {

public static void main(String[] args) {

System.out.println();    
SerVivo s=new Humano();   
s.Comunicarse();
    
s=new Pato();   
s.Comunicarse();   
  
s=new Perro();   
s.Comunicarse(); } }

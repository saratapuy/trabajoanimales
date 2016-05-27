/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.saratapuy.animales;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class EcEduUniandesSaratapuyAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<clsAnimales> anima =new ArrayList<clsAnimales>();
               clsAnimales ani0 = new  clsAnimales(1,"Perro",null,10, clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.mamiferos);
                clsAnimales ani1 = new  clsAnimales(2,"Araña",null,15,clsAnimales.estructura.invertebrados,clsAnimales.reproduccion.oviparos);
                clsAnimales ani2 = new  clsAnimales(3,"Gallina",null,20,clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.oviparos);
                clsAnimales ani3 = new  clsAnimales(4,"Gato",null,25, clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.mamiferos);
               clsAnimales ani4 = new  clsAnimales(5,"Leon",null,15, clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.mamiferos);
                clsAnimales ani5 = new  clsAnimales(6,"Loro",null,20, clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.mamiferos);
                clsAnimales ani6 = new  clsAnimales(7,"Caballo",null,25, clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.mamiferos);
                clsAnimales ani7 = new  clsAnimales(8,"Tarantula",null,15, clsAnimales.estructura.invertebrados,clsAnimales.reproduccion.oviparos);
                clsAnimales ani8 = new  clsAnimales(9,"Mariposa",null,20, clsAnimales.estructura.invertebrados,clsAnimales.reproduccion.oviparos);
              clsAnimales ani9 = new  clsAnimales(10,"Pavo",null,20, clsAnimales.estructura.vertebrados,clsAnimales.reproduccion.mamiferos);
              
     anima.add(ani0);
     anima.add(ani1);
     anima.add(ani2);
     anima.add(ani3);
     anima.add(ani4);
     anima.add(ani5);
     anima.add(ani6);
     anima.add(ani7);
     anima.add(ani8);
     anima.add(ani9);
     imprimir(anima);
    }
    
    public static void imprimir(ArrayList<clsAnimales> an)
    {
        for (clsAnimales anima :an){
      System.out.println("*****************");
      System.out.println("ID:"+ anima.ID());
      System.out.println("Nombre:"+anima.Nombre());
      System.out.println("Apareamiento:"+anima.Apareamiento());
      System.out.println("Peso:"+anima.Peso());
      System.out.println("Estructura:"+anima.Estructura());
      System.out.println("Reproduccion:"+anima.Reproduccion());
        }
  }
}

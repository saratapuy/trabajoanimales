/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.saratapuy.animales;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class clsAnimales {

    public enum estructura {vertebrados, invertebrados};
    public enum reproduccion {oviparos, mamiferos};
    
    private int _ID;
    private String _Nombre;
    private Date _Apareamiento;
    private float _Peso;
    private estructura _Estructura;
    private reproduccion _Reproduccion;

    public clsAnimales() {
    }

    public clsAnimales(int _ID, String _Nombre, Date _Apareamiento, float _Peso, estructura _Estructura, reproduccion _Reproduccion) {
        this._ID = _ID;
        this._Nombre = _Nombre;
        this._Apareamiento = _Apareamiento;
        this._Peso = _Peso;
        this._Estructura = _Estructura;
        this._Reproduccion = _Reproduccion;
    }
   
    public int ID() {
        return _ID;
    }

    public void ID(int ID) {
        this._ID = ID;
    }

    public String Nombre() {
        return _Nombre;
    }

    public void Nombre(String Nombre) {
        this._Nombre = Nombre;
    }

    public Date Apareamiento() {
        return _Apareamiento;
    }

    public void Apareamiento(Date Apareamiento) {
        this._Apareamiento = Apareamiento;
    }

    public float Peso() {
        return _Peso;
    }

    public void Peso(float Peso) {
        this._Peso = Peso;
    }

    public estructura Estructura() {
        return _Estructura;
    }

    public void Estructura(estructura Estructura) {
        this._Estructura = Estructura;
    }

    public reproduccion Reproduccion() {
        return _Reproduccion;
    }
    
    public void Reproduccion(reproduccion Reproduccion) {
        this._Reproduccion = Reproduccion;
    }
}

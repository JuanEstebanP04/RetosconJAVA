/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variante1;

/**
 *
 * @author Juan Esteban
 */
public class Personaje {
    //Atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double distanciaTotal;
    private int numeroBotiquines;
    private double vida;
    
    public Personaje(String nombre,char sexo){
        this.nombre=nombre;
        this.sexo=sexo;
        posicionY=0;
        posicionY=0;
        distanciaTotal=0;
        numeroBotiquines=0;
        vida=100;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }
    //SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    //Metodos
    public void usarBotiquin(){
        if(numeroBotiquines>0 && vida<100){
            numeroBotiquines=numeroBotiquines-1;
            vida=vida+5;
            if(vida>100){
                vida=100;
            }
        }
    }
    public void recogerBotiquin(){
        numeroBotiquines=numeroBotiquines+1;
    }
    public void moverDerecha(double d){
        posicionX=posicionX+d;
        distanciaTotal=distanciaTotal+d;
    }
    public void moverIzquierda(double d){
        posicionX=posicionX-1;
        distanciaTotal=distanciaTotal+1;
    }
    public void moverArriba(double d){
        posicionY=posicionY+d;
        distanciaTotal=distanciaTotal+d;
    }
    public void moverAbajo(double d){
        posicionY=posicionY-1;
        distanciaTotal=distanciaTotal+1;
    }
    public double calcularDistanciaRespectoOrigen(){
        return Math.sqrt(Math.pow(posicionX,2)+Math.pow(posicionY,2)); 
    }
    public void muestra(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sexo: "+sexo);
        System.out.println("Núumero de botiquines: "+numeroBotiquines);
        System.out.println("Vida: "+vida);
        System.out.println("Posición X: "+posicionX);
        System.out.println("Posición Y: "+posicionY);
        System.out.println("Distancia total: "+distanciaTotal);
        
    }
}

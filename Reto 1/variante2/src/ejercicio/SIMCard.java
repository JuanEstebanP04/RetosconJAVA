package ejercicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Esteban
 */
public class SIMCard {
    private String empresaTelefonia;
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado;
    private boolean modoAvionActivado;
    private boolean datosActivados;
    private int saldoDatos;
    
    public SIMCard(String numeroTelefono){
        empresaTelefonia="HI";
        saldo=0;
        this.numeroTelefono=numeroTelefono;
        celularApagado=true;
        modoAvionActivado=false;
        datosActivados=false;
        saldoDatos=0;
    }
    
    public String getEmpresaTelefonia(){
        return empresaTelefonia;
    }
    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public String getNumeroTelefono(){
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono){
        this.numeroTelefono=numeroTelefono;
    }
    
    public boolean isCelularApagado(){
        return celularApagado;
    }
    
    public void setCelularApagado(boolean celularApagado){
        this.celularApagado=celularApagado;
    }
    
    public boolean isModoAvionActivado(){
        return modoAvionActivado;
    }
    
    public void setModoAvionActivado(boolean modoAvionActivado){
        this.modoAvionActivado=modoAvionActivado;
    }
    
    public boolean isDatosActivados(){
        return datosActivados;
    }
    
    public void setDatosActivados(boolean datosActivados){
        this.datosActivados=datosActivados;
    }
    
    public int getSaldoDatos(){
        return saldoDatos;
    }
    
    public void setSaldoDatos(int saldoDatos){
        this.saldoDatos=saldoDatos;
    }
    
    public void comprarDatos(int c){
        int costo=0;
        int aux=0;
        if(c<=10){
            costo=c*3000;
        }
        else if(c>10 && c<30){
            aux=(c-10)*2500;
            costo=(10*3000)+aux;
        }
        else if(c>30){
            aux=(c-20)*1500;
            costo=(20*3000)+aux;
        }
        if(costo<=saldo){
            this.saldo=this.saldo-costo;
            this.saldoDatos=this.saldoDatos+c;
        }
    }
    
    public void consumirDatos(int c){
       if((isCelularApagado()==true)||(isModoAvionActivado()==true)){
           
       }
       else{
           if(isDatosActivados()==true){
               this.saldoDatos=this.saldoDatos-c;
           }
       }
    }
    
    public void llamar(int s){
        double costo;
        if(s<=60){
            costo=s;
        }
        else{
            costo=((s-60)*0.5)+60;
        }
        if((isCelularApagado()==true)||(isModoAvionActivado()==true)){
           
        }
        else{
               this.saldo=this.saldo-costo;
           }
       }
        
    public void recargarSaldo(double s){
        this.saldo=this.saldo+s;
    }
    
    public void gestionarEncendidoCelular(){
        if(isCelularApagado()==false){
            this.celularApagado=true;
            this.datosActivados=false;
            this.modoAvionActivado=false;
        }
        else{
            this.celularApagado=false;
        }
    }
    public void gestionarModoAvion(){
        if(isCelularApagado()==false){
            if(isModoAvionActivado()==false){
                this.modoAvionActivado=true;
                this.datosActivados=false;
            }
            else{
                this.modoAvionActivado=false;
            }
        } 
    }
    public void gestionarDatos(){
        if(isCelularApagado()==false && isModoAvionActivado()==false){
            if(isDatosActivados()==false)
            {
                this.datosActivados=true;
            }
            else{
                this.datosActivados=false;
            }
        }
    }
    public void mostrarAtributos(){
        System.out.println("Empresa telefonia: "+empresaTelefonia);
        System.out.println("Saldo: "+saldo);
        System.out.println("Número de telefono: "+numeroTelefono);
        System.out.println("Celular apagado: "+celularApagado);
        System.out.println("Modo avion activado: "+modoAvionActivado);
        System.out.println("Datos activados: "+datosActivados);
        System.out.println("Saldo datos "+saldoDatos);    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadecampo;

/**
 *
 * @author KudiezoJr
 */
public abstract class Animal {
    private int energia;
    protected enum tipoEstado {domindo, morto, vivo};
    protected tipoEstado estado;

    public Animal(int energia) {
        this.energia = energia;
        this.estado = tipoEstado.vivo;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public tipoEstado getEstado() {
        return estado;
    }
    public void setEstado(tipoEstado estado) {
        this.estado = estado;
    }
    
    public abstract void dormir();
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadecampo;

/**
 *
 * @author KudiezoJr
 */
public class Passaro extends Animal implements IPassaro {
    
    public Passaro() {
        super(20);
    }

    @Override
    public void dormir() {
        super.estado = tipoEstado.domindo;
        setEnergia(20);
    }

    @Override
    public void assubiar() {
        System.out.println("Piu piu piu...");
    }

    @Override
    public void voar() {
        if(this.getEnergia() > 2){
            this.setEstado(tipoEstado.vivo);
            this.setEnergia(this.getEnergia() - 2);
        }
        else if(this.getEnergia() > 0)
            this.setEnergia(0);
        else
            System.out.println("Pássaro sem energia para voar...");
    }
}

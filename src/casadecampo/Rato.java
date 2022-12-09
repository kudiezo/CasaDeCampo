/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadecampo;

/**
 *
 * @author KudiezoJr
 */
public class Rato extends Animal implements IRato {
    
    public Rato() {
        super(50);
    }

    @Override
    public void dormir() {
        super.estado = tipoEstado.domindo;
        setEnergia(50);
    }

    @Override
    public void soar() {
        System.out.println("Kuikui Kuikui Kuikui...");
    }

    @Override
    public void correr() {
        if(this.getEnergia() > 5){
            this.setEstado(tipoEstado.vivo);
            this.setEnergia(this.getEnergia() - 5);
        }
        else if(this.getEnergia() > 0)
            this.setEnergia(0);
        else
            System.out.println("Rato sem energia para correr...");
    }
    
}

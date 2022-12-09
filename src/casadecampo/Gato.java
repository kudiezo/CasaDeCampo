/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadecampo;

/**
 *
 * @author KudiezoJr
 */
public class Gato extends Animal implements IGato, IPredador {
    private String nome;
    private short racioDeCapturarRato = 0;
    private short racioDeCapturarPassaro = 0;
    
    public Gato() {
        super(500);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void dormir() {
        super.estado = tipoEstado.domindo;
        setEnergia(500);
    }

    @Override
    public void miar() {
        System.out.println("Miau miau miau...");
    }

    @Override
    public void correr() {
        if(this.getEnergia() > 25){
            this.setEstado(tipoEstado.vivo);
            this.setEnergia(this.getEnergia() - 25);
        }
        else if(this.getEnergia() > 0)
            this.setEnergia(0);
        else
            System.out.println(this.getNome() + " está sem energia para correr...");
    }

    @Override
    public void atacar(Animal presa) {
        if(this.getEnergia() == 0) {
            System.out.println(this.getNome() + " está sem energia para atacar...");
            return;
        }
        
        this.setEstado(tipoEstado.vivo);
        this.correr();
        if (presa instanceof Rato rato) {
            if(rato.estado == tipoEstado.morto) {
                System.out.println("Rato morto não pode ser comido...");
                return;
            }
            if ((this.racioDeCapturarRato == 5-1) || (this.racioDeCapturarRato >= 2-1 && rato.estado == tipoEstado.domindo)) {
                this.setEnergia(this.getEnergia() + rato.getEnergia());
                rato.setEnergia(0);
                rato.setEstado(Animal.tipoEstado.morto);
                System.out.println(this.getNome() + " capturou um rato...");
                this.racioDeCapturarRato = 0;
            } else {
                if(rato.estado != tipoEstado.domindo) {
                    rato.correr();//Escapando
                    rato.setEnergia(rato.getEnergia() + 5);//Bónus por escapar
                }
                this.racioDeCapturarRato++;
            }
        } else if (presa instanceof Passaro passaro) {
            if(passaro.estado == tipoEstado.morto) {
                System.out.println("Pássaro morto não pode ser comido...");
                return;
            }
            if (this.racioDeCapturarPassaro == 10-1 || (this.racioDeCapturarPassaro >= 2-1 && passaro.estado == tipoEstado.domindo)) {
                this.setEnergia(this.getEnergia() + passaro.getEnergia());
                passaro.setEnergia(0);
                passaro.setEstado(Animal.tipoEstado.morto);
                System.out.println(this.getNome() + " capturou um pássaro...");
                this.racioDeCapturarPassaro = 0;
            } else {
                if(passaro.estado != tipoEstado.domindo) {
                    passaro.voar();//Escapando
                    passaro.setEnergia(passaro.getEnergia() + 5);//Bónus por escapar
                }
                this.racioDeCapturarPassaro++;
            }
        }
    }
    
}

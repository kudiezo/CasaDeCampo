/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadecampo;

/**
 *
 * @author KudiezoJr
 */
public class Cao extends Animal implements ICao, IPredador {
    private String nome;
    private short racioDeCapturarRato = 0;

    public Cao() {
        super(1000);
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
        setEnergia(1000);
    }

    @Override
    public void latir() {
        System.out.println("Uau uau uau...");
    }

    @Override
    public void correr() {
        if(this.getEnergia() > 50){
            this.setEstado(tipoEstado.vivo);
            this.setEnergia(this.getEnergia() - 50);
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
            if (this.racioDeCapturarRato == 25-1 || (this.racioDeCapturarRato >= 2-1 && rato.estado == tipoEstado.domindo)) {
            //Caso de captura
                this.setEnergia(this.getEnergia() + presa.getEnergia());//Predador ganhando energia da presa
                rato.setEnergia(0);//Morte
                rato.setEstado(Animal.tipoEstado.morto);//Morte
                System.out.println(this.getNome() + " capturou um rato...");
                this.racioDeCapturarRato = 0;
            } else {
            //Caso de fuga do rato
                if(rato.estado != tipoEstado.domindo) {
                    rato.correr();
                    rato.setEnergia(rato.getEnergia() + 5);//Bónus por escapar
                }
                this.racioDeCapturarRato++;
            }
        } else if (presa instanceof Gato gato) {
            this.setEnergia(this.getEnergia() - 100);//Cão perdendo energia por atacar gato
            gato.correr();
        }
    }
    
    
    
}

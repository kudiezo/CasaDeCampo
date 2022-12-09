/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casadecampo;

import java.util.Scanner;

/**
 *
 * @author KudiezoJr
 */
public class CasaDeCampo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cao c1 = new Cao();
        c1.setNome("Piloto");
        Cao c2 = new Cao();
        c2.setNome("Átila");
        
        Gato g1 = new Gato();
        g1.setNome("Tareco");
        Gato g2 = new Gato();
        g2.setNome("Pantufa");
        Gato g3 = new Gato();
        g3.setNome("Kitty");
        
        Rato[] ratos;
        ratos = new Rato[5];
        for(int i = 0; i < 5; i++) {
            ratos[i] = new Rato();
        }
        
        Passaro[] passaros;
        passaros = new Passaro[3];
        for(int i = 0; i < 3; i++) {
            passaros[i] = new Passaro();
        }
        
        System.out.println("ESTADO INICIAL DOS ANIMAIS");
        apresentarStatus(c1, c2, g1, g2, g3, ratos, passaros);
        System.out.println("");
        
        /**
         * Fazer interações aqui
         */
        
        System.out.println("\nESTADO DOS ANIMAIS DEPOIS DAS INTERAÇÕES");
        apresentarStatus(c1, c2, g1, g2, g3, ratos, passaros);
    }
    
    public static void apresentarStatus(Cao c1, Cao c2, Gato g1, Gato g2, Gato g3, Rato[] ratos, Passaro[] passaros) {
        System.out.println("Cães: ");
        System.out.println("\t"+c1.getNome()+ " - " + c1.estado +" - "+ c1.getEnergia() + " de energia");
        System.out.println("\t"+c2.getNome()+ " - " + c2.estado +" - "+ c2.getEnergia() + " de energia");
        System.out.println("Gatos: ");
        System.out.println("\t"+g1.getNome() + " - " + g1.estado +" - "+ g1.getEnergia() + " de energia");
        System.out.println("\t"+g2.getNome() + " - " + g2.estado +" - "+ g2.getEnergia() + " de energia");
        System.out.println("\t"+g3.getNome() + " - " + g3.estado +" - "+ g3.getEnergia() + " de energia");
        
        System.out.println("Ratos: ");
        for(int i = 0; i < 5; i++) {
            System.out.println("\tRato" + (i+1) + " - " + ratos[i].estado + " - " + ratos[i].getEnergia() + " de energia");
        }
        
        System.out.println("Pássaros: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("\tPássaro" + (i+1) + " - " + passaros[i].estado + " - " + passaros[i].getEnergia() + " de energia");
        }
    }
    
    public static void menu() {
        
    }
    
}

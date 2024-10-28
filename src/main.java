/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaProgresso progresso= new TelaProgresso();
        progresso.setVisible(true);
        TelaSecundaria secundaria= new TelaSecundaria();
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(50);
                progresso.porcentagem.setText(Integer.toString(i)+"%");
                progresso.barra.setValue(i);
                
                if(i==100){
                    progresso.setVisible(false);
                    secundaria.setVisible(true);
                }
            }
        }catch (Exception e){
        }
    }
    
}

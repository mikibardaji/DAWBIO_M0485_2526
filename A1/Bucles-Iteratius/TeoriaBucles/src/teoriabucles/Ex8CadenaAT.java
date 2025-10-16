/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

/**
 *
 * @author mabardaji
 */
public class Ex8CadenaAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char aminoacid='A';
        for (int i=0; i<20;i++){
            
            if (i%2==0){
                aminoacid='A';
            }
            else{
                aminoacid='T';
            }
             System.out.print(aminoacid);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print("AT");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritor;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class Escritor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMA PRUEBA: ESCRITOR AUTOMÁTICO
        
        Scanner teclado = new Scanner(System.in);
        
       System.out.println("Introduzca un adjetivo singular: ");
       String adjetivoSingular = teclado.nextLine();
       System.out.println();
       System.out.println();
       System.out.println("Introduzca un adjetivo singular masculino: ");
       String adjetivoSingularMasculino = teclado.nextLine();
       System.out.println();
       System.out.println("Introduzca un adjetivo plural masculino: ");
       String adjetivoPluralMasculino = teclado.nextLine();
       System.out.println();
       System.out.println("Introduzca un adjetivo singular femenino: ");
       String adjetivoSingularFemenino = teclado.nextLine();
       System.out.println();
       System.out.println("Introduzca un adjetivo plural femenino: ");
       String adjetivoPluralFemenino = teclado.nextLine();
       System.out.println();
       
       // Presente de Indicativo del verbo ser
       System.out.println("PRESENTE DE INDICATIVO DEL VERBO SER");
       System.out.println();
       System.out.println("Yo soy " + adjetivoSingular);
       System.out.println("Tu eres " + adjetivoSingular);
       System.out.println("El es " + adjetivoSingularMasculino);
       System.out.println("Ella es " + adjetivoSingularFemenino);
       System.out.println();
       System.out.println("Nosotros somos " + adjetivoPluralMasculino);
       System.out.println("Nosotras somos " + adjetivoPluralFemenino);
       System.out.println("Vosotros sois " + adjetivoPluralMasculino);
       System.out.println("Vosotras sois " + adjetivoPluralFemenino);
       System.out.println("Ellos son " + adjetivoPluralMasculino);
       System.out.println("Ellas son " + adjetivoPluralFemenino);
       System.out.println();
        // Futuro de Indicativo del verbo ser
       System.out.println("FUTURO DE INDICATIVO DEL VERBO SER");
       System.out.println();
       System.out.println("Yo seré " + adjetivoSingular);
       System.out.println("Tu serás " + adjetivoSingular);
       System.out.println("El será " + adjetivoSingularMasculino);
       System.out.println("Ella será " + adjetivoSingularFemenino);
       System.out.println();
       System.out.println("Nosotros seremos " + adjetivoPluralMasculino);
       System.out.println("Nosotras seremos " + adjetivoPluralFemenino);
       System.out.println("Vosotros sereis " + adjetivoPluralMasculino);
       System.out.println("Vosotras sereis " + adjetivoPluralFemenino);
       System.out.println("Ellos serán " + adjetivoPluralMasculino);
       System.out.println("Ellas serán " + adjetivoPluralFemenino);
       System.out.println();
        // Pretérito Imperfecto del Verbo Ser
       System.out.println("PRETÉRITO IMPERFECTO DEL VERBO SER");
       System.out.println();
       System.out.println("Yo era " + adjetivoSingular);
       System.out.println("Tu eras " + adjetivoSingular);
       System.out.println("El era " + adjetivoSingularMasculino);
       System.out.println("Ella era " + adjetivoSingularFemenino);
       System.out.println();
       System.out.println("Nosotros éramos " + adjetivoPluralMasculino);
       System.out.println("Nosotras éramos " + adjetivoPluralFemenino);
       System.out.println("Vosotros erais " + adjetivoPluralMasculino);
       System.out.println("Vosotras erais " + adjetivoPluralFemenino);
       System.out.println("Ellos eran " + adjetivoPluralMasculino);
       System.out.println("Ellas eran " + adjetivoPluralFemenino);
       System.out.println();
         // Pretérito Perfecto Compuesto del Verbo Ser
       System.out.println("PRETÉRITO PERFECTO COMPUESTO DEL VERBO SER");
       System.out.println();
       System.out.println("Yo he sido " + adjetivoSingular);
       System.out.println("Tu has sido " + adjetivoSingular);
       System.out.println("El ha sido " + adjetivoSingularMasculino);
       System.out.println("Ella ha sido " + adjetivoSingularFemenino);
       System.out.println();
       System.out.println("Nosotros hemos sido " + adjetivoPluralMasculino);
       System.out.println("Nosotras hemos sido " + adjetivoPluralFemenino);
       System.out.println("Vosotros habéis sido " + adjetivoPluralMasculino);
       System.out.println("Vosotras habéis sido " + adjetivoPluralFemenino);
       System.out.println("Ellos han sido " + adjetivoPluralMasculino);
       System.out.println("Ellas han sido " + adjetivoPluralFemenino);
       System.out.println();
       
    }
    
}

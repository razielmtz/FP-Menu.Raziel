/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_rmartinezc_menu;
import java.util.*;
/**
 *
 * @author alumno
 */
public class FP_RMartinezC_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Forma 1 
         /*int m;
         float a;
         m = menu();
         a = calcularÁreas(m);
         muestraResultado(a,m);
         */
                 
         //Forma 2
         muestraResultado(calcularÁreas(menu()));                
    }
    public static void muestraResultado(float area){
        System.out.print("el área es" +  area);
    }
    public static void muestraResultado(float area, int r) {
        String figura;
        if (r == 1) { figura = "cuadrado";}
        else{
            if (r == 2) { figura = "círculo";
            }else { figura = "triángulo";
                }
       
            System.out.print("El área del " + figura + "es iguala  a:" + area);    
    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menu ****");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        System.out.println("0. Salir");
        System.out.print("Introdusca la opcion deseada: ");
        opcion = entrada.nextInt();
        }while(opcion<0 || opcion>3);
        return opcion;
    }
    public static float calcularÁreas(int op){
        float area;
        switch (op){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajeSalida();
                area = 0;
        }
        return area;
    }
    public static float areaCuadrado(){return (float)1.0000;}
    public static float areaCírculo(){return (float)1.0000;}
    public static float areaTriángulo(){return (float)1.0000;}
    public static float areaCuadrado(){return (float)1.0000;}
    }

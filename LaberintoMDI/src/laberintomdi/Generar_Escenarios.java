package laberintomdi;

import java.util.Scanner;

public class Generar_Escenarios {
    
    private int columnas = 17;
    private int filas = 19;
    private String matriz [][];
    
    private final int ARRIBA=1;
    private final int ABAJO=2;
    private final int IZQUIERDA=3;
    private final int DERECHA=4;

//    public Generar_Escenarios(int columnas, int filas, String[][] matriz) {
//        this.columnas = columnas;
//        this.filas = filas;
//        this.matriz = matriz;
//    }
    
    Scanner lector = new Scanner(System.in);
    
    
    
    
    
    public String[][] escenarioStandard() {
        String[][] matriz = {
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "*", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "F", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"}
        };
        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz1[j].equals(" ")) { //Reemplaza
                    System.out.print(matriz1[j].replace(" ", "o") + "  ");
                } else {
                    System.out.print(matriz1[j] + "  "); //Agrega valor y espacio.
                }
            }
            System.out.println();
        }
        return matriz;
    }
    
    public int filaasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = i;
                }
            }
        }
        return fila;
    }
    
    public int columasterico(String[][] matriz) {
        int columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    columna = j;
                }
            }
        }
        return columna;
    }
    
    int [] arreglo= new int[2];
    public int [] posX(String [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("F")) {
                    arreglo[0]=i;
                    arreglo[1]=j;
                }
            }
        }
        return arreglo;
    }
}

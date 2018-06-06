package laberintomdi;

import java.util.Scanner;

public class Escenarios {

    Scanner lector = new Scanner(System.in);

    public String[][] escenarioUno() {
        String[][] matriz = {
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "o", "o", "o", " ", " ", " ", " ", "o", "o", "o", "o", "o", "o", "o", "o", "|"},
            {"|", "o", "o", "o", " ", "o", "o", " ", "o", "o", "o", "o", "o", "o", "o", "o", "|"},
            {"|", "o", "o", "o", " ", "o", "o", " ", "o", "o", "o", "o", " ", " ", " ", " ", "|"},
            {"|", "o", "o", "o", " ", "o", " ", " ", "o", "o", "o", "o", " ", "o", "o", " ", "|"},
            {"|", "o", "o", "o", " ", "o", "o", "o", "o", "o", "o", "o", " ", " ", "o", " ", "|"},
            {"|", "o", "o", "o", " ", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", " ", "|"},
            {"|", "o", "o", " ", " ", " ", "o", "o", "o", "o", "o", "o", "o", "o", "o", " ", "|"},
            {"|", " ", " ", " ", "o", " ", "o", " ", " ", "o", "o", "o", "o", " ", " ", " ", "|"},
            {"|", " ", "o", "o", "o", " ", "o", " ", "o", "o", "o", "o", "o", " ", "o", "o", "|"},
            {"|", "*", "o", "o", "o", " ", "o", " ", " ", " ", " ", "o", "o", " ", "o", "o", "|"},
            {"|", "o", "o", "o", "o", " ", "o", "o", " ", "o", " ", "o", "o", " ", "o", "o", "|"},
            {"|", "o", "o", "o", "o", " ", "o", "o", " ", "o", " ", "o", "o", " ", "o", "o", "|"},
            {"|", "o", "o", "o", "o", " ", "o", "o", " ", "o", " ", " ", " ", " ", "o", "o", "|"},
            {"|", "o", "o", "o", "o", " ", "o", " ", " ", "o", " ", "o", "o", " ", " ", "o", "|"},
            {"|", "o", "o", "o", "o", " ", "o", " ", "o", "o", " ", "o", "o", "o", " ", "F", "|"},
            {"|", "o", "o", "o", "o", " ", "o", " ", "o", "o", " ", "o", "o", "o", "o", "o", "|"},
            {"|", "o", "o", "o", "o", " ", " ", " ", "o", " ", " ", "o", "o", "o", "o", "o", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"}};
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
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = j;
                }
            }
        }
        return fila;
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

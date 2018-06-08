package laberintomdi;

import java.util.Scanner;

public class LaberintoMDI {

    public static void main(String[] args) {
        
        Generar_Escenarios gesce= new Generar_Escenarios();
        Escenarios esce = new Escenarios();
        Metodo metodo = new Metodo();

        Scanner lector = new Scanner(System.in);
        int opc;
        int mod = 0;
        do {
            System.out.println("1.- Laberinto 1");
            System.out.println("2.- Laberinto 2");
            System.out.println("0.- Salir");
            System.out.print("Opción -> ");
            opc = lector.nextInt();
            if (opc != 0) {
                System.out.println("1.- Manual");
                System.out.println("2.- Automático");
                System.out.print("Opción -> ");
                mod = lector.nextInt();
            }

            switch (opc) {
                case 0:
                    System.out.println("Adiós!");
                    break;
                case 1:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    }else{
                        metodo.Auto(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    }
                    break;
                case 2:
                    if (mod == 2) {
                        metodo.Auto(gesce.escenarioStandard(), gesce.filaasterico(gesce.escenarioStandard()), gesce.columasterico(gesce.escenarioStandard()));
                    }else{
                        metodo.Avanzar(gesce.escenarioStandard(), gesce.filaasterico(gesce.escenarioStandard()), gesce.columasterico(gesce.escenarioStandard()));
                    }
                    break;
                default:
                    System.out.println("Opción no valida, vuelva a intentar.");
            }
        } while (opc != 0);

    }
}
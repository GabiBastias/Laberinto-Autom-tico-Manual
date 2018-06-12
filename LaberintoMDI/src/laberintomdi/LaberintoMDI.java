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
            System.out.println("1.- Nivel 1.");
            System.out.println("2.- Nivel 2.");
            System.out.println("3.- Nivel 3.");
            System.out.println("4.- Nivel 4.");
            System.out.println("0.- Salir");
            System.out.print("Opción -> ");
            opc = lector.nextInt();
            if (opc != 0) {
                System.out.println("1.- Manual.");
                System.out.println("2.- Automático.");
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
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioDos(), esce.filaasterico(esce.escenarioDos()), esce.columasterico(esce.escenarioDos()));
                    }else{
                        metodo.Auto(esce.escenarioDos(), esce.filaasterico(esce.escenarioDos()), esce.columasterico(esce.escenarioDos()));
                    }
                    break;
                case 3:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioTres(), esce.filaasterico(esce.escenarioTres()), esce.columasterico(esce.escenarioTres()));
                    }else{
                        metodo.Auto(esce.escenarioTres(), esce.filaasterico(esce.escenarioTres()), esce.columasterico(esce.escenarioTres()));
                    }
                    break;
                case 4:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioCuatro(), esce.filaasterico(esce.escenarioCuatro()), esce.columasterico(esce.escenarioCuatro()));
                    }else{
                        metodo.Auto(esce.escenarioCuatro(), esce.filaasterico(esce.escenarioCuatro()), esce.columasterico(esce.escenarioCuatro()));
                    }
                    break;
                default:
                    System.out.println("Opción no valida, vuelva a intentar.");
            }
        } while (opc != 0);

    }
}
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
            System.out.println("5.- Nivel 5.");
            System.out.println("6.- Nivel 6.");
            System.out.println("7.- Nivel 7.");
            System.out.println("8.- Nivel 8.");
            System.out.println("9.- Nivel 9.");
            System.out.println("10.- Nivel 10.");
            System.out.println("11.- Nivel 11.");
            System.out.println("12.- Nivel 12.");
            System.out.println("13.- Nivel 13.");
            System.out.println("14.- Nivel 14.");
            System.out.println("15.- Nivel 15.");
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
                case 5:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioCinco(), esce.filaasterico(esce.escenarioCinco()), esce.columasterico(esce.escenarioCinco()));
                    }else{
                        metodo.Auto(esce.escenarioCinco(), esce.filaasterico(esce.escenarioCinco()), esce.columasterico(esce.escenarioCinco()));
                    }
                    break;
                case 6:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioSeis(), esce.filaasterico(esce.escenarioSeis()), esce.columasterico(esce.escenarioSeis()));
                    }else{
                        metodo.Auto(esce.escenarioSeis(), esce.filaasterico(esce.escenarioSeis()), esce.columasterico(esce.escenarioSeis()));
                    }
                    break;
                case 7:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioSiete(), esce.filaasterico(esce.escenarioSiete()), esce.columasterico(esce.escenarioSiete()));
                    }else{
                        metodo.Auto(esce.escenarioSiete(), esce.filaasterico(esce.escenarioSiete()), esce.columasterico(esce.escenarioSiete()));
                    }
                    break;
                case 8:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioOcho(), esce.filaasterico(esce.escenarioOcho()), esce.columasterico(esce.escenarioOcho()));
                    }else{
                        metodo.Auto(esce.escenarioOcho(), esce.filaasterico(esce.escenarioOcho()), esce.columasterico(esce.escenarioOcho()));
                    }
                    break;
                case 9:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioNueve(), esce.filaasterico(esce.escenarioNueve()), esce.columasterico(esce.escenarioNueve()));
                    }else{
                        metodo.Auto(esce.escenarioNueve(), esce.filaasterico(esce.escenarioNueve()), esce.columasterico(esce.escenarioNueve()));
                    }
                    break;
                case 10:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioDiez(), esce.filaasterico(esce.escenarioDiez()), esce.columasterico(esce.escenarioDiez()));
                    }else{
                        metodo.Auto(esce.escenarioDiez(), esce.filaasterico(esce.escenarioDiez()), esce.columasterico(esce.escenarioDiez()));
                    }
                    break;
                case 11:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioOnce(), esce.filaasterico(esce.escenarioOnce()), esce.columasterico(esce.escenarioOnce()));
                    }else{
                        metodo.Auto(esce.escenarioOnce(), esce.filaasterico(esce.escenarioOnce()), esce.columasterico(esce.escenarioOnce()));
                    }
                    break;
                case 12:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioDoce(), esce.filaasterico(esce.escenarioDoce()), esce.columasterico(esce.escenarioDoce()));
                    }else{
                        metodo.Auto(esce.escenarioDoce(), esce.filaasterico(esce.escenarioDoce()), esce.columasterico(esce.escenarioDoce()));
                    }
                    break;
                case 13:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioTrece(), esce.filaasterico(esce.escenarioTrece()), esce.columasterico(esce.escenarioTrece()));
                    }else{
                        metodo.Auto(esce.escenarioTrece(), esce.filaasterico(esce.escenarioTrece()), esce.columasterico(esce.escenarioTrece()));
                    }
                    break;
                case 14:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioCatorce(), esce.filaasterico(esce.escenarioCatorce()), esce.columasterico(esce.escenarioCatorce()));
                    }else{
                        metodo.Auto(esce.escenarioCatorce(), esce.filaasterico(esce.escenarioCatorce()), esce.columasterico(esce.escenarioCatorce()));
                    }
                    break;
                case 15:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioQuince(), esce.filaasterico(esce.escenarioQuince()), esce.columasterico(esce.escenarioQuince()));
                    }else{
                        metodo.Auto(esce.escenarioQuince(), esce.filaasterico(esce.escenarioQuince()), esce.columasterico(esce.escenarioQuince()));
                    }
                    break;
                default:
                    System.out.println("Opción no valida, vuelva a intentar.");
            }
        } while (opc != 0);

    }
}
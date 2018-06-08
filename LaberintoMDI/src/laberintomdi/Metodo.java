package laberintomdi;

import java.util.Scanner;

public class Metodo {

    Scanner lector = new Scanner(System.in);

    public void Avanzar(String[][] matriz, int filas, int columnas) {
        int intentos = 0;
        Escenarios x = new Escenarios();
        int []arreglo = x.posX(matriz);
        while (intentos < 5) {
            if (matriz[filas][columnas] == matriz[arreglo[0]][arreglo[1]]) {
                System.out.println("HAS GANADO !!");
                intentos += 5;
            } else {
                imprimirMatriz(matriz);
                System.out.print("Mover -> ");
                String cara = lector.next();
                //Derecha
                if (cara.equalsIgnoreCase("d")) {
                    if (!matriz[filas][columnas + 1].equals("o") && !matriz[filas][columnas + 1].equals("|") && !matriz[filas][columnas + 1].equals("-")) {
                        matriz[filas][columnas + 1] = "*";
                        matriz[filas][columnas] = " ";
                        columnas++;
                    } else {
                        intentos++;
                        System.out.println("Has golpeado " + intentos + " de 5 veces con la pared ");
                    }
                }

                //Izquierda
                if (cara.equalsIgnoreCase("a")) {
                    if (!matriz[filas][columnas - 1].equals("o") && !matriz[filas][columnas - 1].equals("|") && !matriz[filas][columnas - 1].equals("-")) {
                        matriz[filas][columnas - 1] = "*";
                        matriz[filas][columnas] = " ";
                        columnas--;
                    } else {
                        intentos++;
                        System.out.println("Has golpeado " + intentos + " de 5 vecescon la pared ");
                    }
                }

                //Arriba
                if (cara.equalsIgnoreCase("w")) {
                    if (!matriz[filas - 1][columnas].equals("o") && !matriz[filas - 1][columnas].equals("|") && !matriz[filas - 1][columnas].equals("-")) {
                        matriz[filas - 1][columnas] = "*";
                        matriz[filas][columnas] = " ";
                        filas--;
                    } else {
                        intentos++;
                        System.out.println("Has golpeado " + intentos + " de 5 veces con la pared ");
                    }
                }

                //Abajo
                if (cara.equalsIgnoreCase("s")) {
                    if (!matriz[filas + 1][columnas].equals("o") && !matriz[filas + 1][columnas].equals("|") && !matriz[filas + 1][columnas].equals("-")) {
                        matriz[filas + 1][columnas] = "*";
                        matriz[filas][columnas] = " ";
                        filas++;
                    } else {
                        intentos++;
                        System.out.println("Has golpeado " + intentos + " de 5 veces con la pared ");
                    }
                }
            }
        }
    }

    public void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void Auto(String[][] matriz, int filas, int columnas) {
        String labe = "F";
        String direccion = "derecha";
        Escenarios x = new Escenarios();
        int []arreglo = x.posX(matriz);
        while (matriz[filas][columnas] != matriz[arreglo[0]][arreglo[1]]) {
            imprimirMatriz(matriz);
            switch (direccion) {
                case "derecha"://DERECHA
                    if (!matriz[filas - 1][columnas].equals("o") && !matriz[filas - 1][columnas].equals("|") && !matriz[filas-1][columnas].equals("-")) {
                        matriz[filas - 1][columnas] = "*";
                        matriz[filas][columnas] = " ";
                        filas--;
                        direccion = "arriba";
                    } else {
                        if (!matriz[filas][columnas + 1].equals("o") && !matriz[filas][columnas + 1].equals("|") && !matriz[filas][columnas + 1].equals("-")) {
                            matriz[filas][columnas + 1] = "*";
                            matriz[filas][columnas] = " ";
                            columnas++;
                        } else {
                            if (!matriz[filas + 1][columnas].equals("o") && !matriz[filas + 1][columnas].equals("|") && !matriz[filas+1][columnas].equals("-")) {
                                matriz[filas + 1][columnas] = "*";
                                matriz[filas][columnas] = " ";
                                filas++;
                                direccion = "abajo";
                            } else {
                                matriz[filas][columnas - 1] = "*";
                                matriz[filas][columnas] = " ";
                                columnas--;
                                direccion = "izquierda";
                            }
                        }
                    }
                    break;
                case "arriba"://ARRIBA
                    if (!matriz[filas][columnas - 1].equals("o") && !matriz[filas][columnas - 1].equals("|") && !matriz[filas][columnas - 1].equals("-")) {
                        matriz[filas][columnas - 1] = "*";
                        matriz[filas][columnas] = " ";
                        columnas--;
                        direccion = "izquierda";
                    } else {
                        if (!matriz[filas - 1][columnas].equals("o") && !matriz[filas - 1][columnas].equals("|") && !matriz[filas-1][columnas].equals("-")) {
                            matriz[filas - 1][columnas] = "*";
                            matriz[filas][columnas] = " ";
                            filas--;
                        } else {
                            if (!matriz[filas][columnas + 1].equals("o") && !matriz[filas][columnas + 1].equals("|") && !matriz[filas][columnas + 1].equals("-")) {
                                matriz[filas][columnas + 1] = "*";
                                matriz[filas][columnas] = " ";
                                columnas++;
                                direccion = "derecha";
                            } else {
                                matriz[filas + 1][columnas] = "*";
                                matriz[filas][columnas] = " ";
                                filas++;
                                direccion = "abajo";
                            }
                        }
                    }
                    break;
                case "izquierda":
                    if (!matriz[filas + 1][columnas].equals("o") && !matriz[filas + 1][columnas].equals("|") && !matriz[filas+1][columnas].equals("-")) {
                        matriz[filas + 1][columnas] = "*";
                        matriz[filas][columnas] = " ";
                        filas++;
                        direccion = "abajo";
                    } else {
                        if (!matriz[filas][columnas - 1].equals("o") && !matriz[filas][columnas - 1].equals("|") && !matriz[filas][columnas - 1].equals("-")) {
                            matriz[filas][columnas - 1] = "*";
                            matriz[filas][columnas] = " ";
                            columnas--;
                        } else {
                            if (!matriz[filas - 1][columnas].equals("o") && !matriz[filas - 1][columnas].equals("|") && !matriz[filas-1][columnas].equals("-")) {
                                matriz[filas - 1][columnas] = "*";
                                matriz[filas][columnas] = " ";
                                filas--;
                                direccion = "arriba";
                            } else {
                                matriz[filas][columnas + 1] = "*";
                                matriz[filas][columnas] = " ";
                                columnas++;
                                direccion = "derecha";
                            }
                        }
                    }
                    break;

                case "abajo"://ARRIBA
                    if (!matriz[filas][columnas + 1].equals("o") && !matriz[filas][columnas + 1].equals("|") && !matriz[filas][columnas + 1].equals("-")) {
                        matriz[filas][columnas + 1] = "*";
                        matriz[filas][columnas] = " ";
                        columnas++;
                        direccion = "derecha";
                    } else {
                        if (!matriz[filas + 1][columnas].equals("o") && !matriz[filas + 1][columnas].equals("|") && !matriz[filas+1][columnas].equals("-")) {
                            matriz[filas + 1][columnas] = "*";
                            matriz[filas][columnas] = " ";
                            filas++;
                        } else {
                            if (!matriz[filas][columnas - 1].equals("o") && !matriz[filas][columnas - 1].equals("|") && !matriz[filas][columnas - 1].equals("-")) {
                                matriz[filas][columnas - 1] = "*";
                                matriz[filas][columnas] = " ";
                                columnas--;
                                direccion = "izquierda";
                            } else {
                                matriz[filas - 1][columnas] = "*";
                                matriz[filas][columnas] = " ";
                                filas--;
                                direccion = "arriba";
                            }
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            try {
                Thread.sleep(250);
            }
            catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            } 
        }
        imprimirMatriz(matriz);
        System.out.println("Ha llegado a la salida");
    }
}

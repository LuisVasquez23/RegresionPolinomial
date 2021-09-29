package Entidades;

public class Matriz {
    private double[][] matrizOriginal;

    public Matriz() {
        this.matrizOriginal = new double[3][3];
    }

    // Metodo set
    public void setMatrizOriginal(double[][] matrizOriginal) {
        this.matrizOriginal = matrizOriginal;
    }
    
    // Metodo get
    public double[][] getMatrizOriginal() {
        return matrizOriginal;
    }
    
    public double[][] matrizInversa(){
        
        double[][] matrizInversa = new double[3][3];
        double[][] matrizAdjunta = this.matrizAdjunta();
        double determinante = this.Determinante();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               matrizInversa[i][j] = matrizAdjunta[i][j] / determinante;
            }
        }
        
        return matrizInversa;
    }
    
    public double Determinante(){
        double[][] matriz = this.matrizOriginal;
        double resultado = 0;
        
        resultado =((matriz[0][0] * matriz[1][1]* matriz[2][2]) + (matriz[0][1] * matriz[1][2]* matriz[2][0]) +(matriz[2][1] * matriz[1][0]* matriz[0][2])) 
                   -((matriz[0][2] * matriz[1][1]* matriz[2][0])+(matriz[0][0] * matriz[2][1]* matriz[1][2])+(matriz[2][2] * matriz[1][0]* matriz[0][1]));
        
        return resultado;
    }
    
    double[][] matrizAdjunta(){
        double[][] matrizAdjunta = new double[3][3];
        double[][] matrizTranspuesta = this.matrizTraspuesta();
        
        for (int fila = 0; fila < matrizTranspuesta.length; fila++) {
            for (int columna = 0; columna < matrizTranspuesta.length; columna++) {
                matrizAdjunta[fila][columna] = (matrizTranspuesta[(fila+1)% 3][(columna +1) % 3] * matrizTranspuesta[(fila+2)%3][(columna+2)%3]) -
                                               (matrizTranspuesta[(fila+1)% 3][(columna +2) % 3] * matrizTranspuesta[(fila+2)%3][(columna+1)%3]);
            }
        }
        return matrizAdjunta;
    }
    
    double[][] matrizTraspuesta(){
        double auxiliar;
        double[][] matrizAuxiliar = this.matrizOriginal;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar = matrizAuxiliar[i][j];
                matrizAuxiliar[i][j] = matrizAuxiliar[j][i];
                matrizAuxiliar[j][i] = auxiliar;
            }
        }
        
        return matrizAuxiliar;
    }
    
     double calcularDeterminante(double[][] matriz){
        double resultado = 0;
        
        resultado =((matriz[0][0] * matriz[1][1]* matriz[2][2]) + (matriz[0][1] * matriz[1][2]* matriz[2][0]) +(matriz[2][1] * matriz[1][0]* matriz[0][2])) 
                   -((matriz[0][2] * matriz[1][1]* matriz[2][0])+(matriz[0][0] * matriz[2][1]* matriz[1][2])+(matriz[2][2] * matriz[1][0]* matriz[0][1]));
        
        return resultado;
    }
}

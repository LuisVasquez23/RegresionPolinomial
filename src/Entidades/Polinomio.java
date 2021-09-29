package Entidades;

public class Polinomio {
    private double[][] puntos;
    private double[][] matriz;
    //getter y setter

    public void setPuntos(double[][] puntos) {
        this.puntos = puntos;
    }

    public double[][] getPuntos() {
        return puntos;
    }
    
    public void sumatoria(){
    
    }
    
    public void promedio(){
    
    }
    
    private double[][] matrizInversa(){
        double[][] matrizInversa = {};
        
        try {
            Matriz matrizBase = new Matriz();
            matrizBase.setMatrizOriginal(this.matriz);

            if (matrizBase.Determinante() != 0) {
                matrizInversa = matrizBase.matrizInversa();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return matrizInversa;
    }
    
}

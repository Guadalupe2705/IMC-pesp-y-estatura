public class IMC {
    private int peso; // en kilogramos
    private double altura;  // en metros

    // constructor
    public IMC(int peso, double altura){
        this.peso = peso;
        this.altura = altura;

    }

    //getters
    public int getpeso(){
        return peso;
    }
    public double getaltura(){
        return altura;

    }

    //setters
    public void setpeso(int peso){
        this.peso = peso;

    }
    public void setaltura(double altura){
        this.altura = altura;

    }
    // metodo para calcular IMC
    public double calcularIMC(){
        return peso / Math.pow(altura, 2);

    }

    // metodo para imprimir la informacion del IMC
    public void imprimir(){
        double IMC = calcularIMC();
        System.out.println("La persona tiene una masa de "+ peso +" kg y una estatura de " + altura +"m.");
        System.out.printf("IMC calculado: ", IMC);

        if (IMC< 16){
            System.out.println("La persona tiene delgadez severa");
        } else if (IMC < 17) {
            System.out.println("La persona tiene delgadez moderada");
        } else if (IMC < 18) {
            System.out.println("La persona tiene delgadez leve");
        } else if (IMC < 25) {
            System.out.println("La persona tiene un peso normal");
        } else if (IMC < 30) {
            System.out.println("La persona tiene sobrepeso");
        } else if (IMC < 35) {
            System.out.println("La persona tiene obesidad leve");
        } else if (IMC < 40) {
            System.out.println("La persona tiene obesidad media");
        } else {
            System.out.println("La persona tiene obesidad mórbida");
        }
    }
}


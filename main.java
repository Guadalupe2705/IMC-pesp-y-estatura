public class main {
    public static void main(String[]args){

        int masa = 61;  //Masa se establece en kgs
        double estatura = 1.60; //En metros
        double IMC = masa/Math.pow(estatura, 2);
        /*IMC = 75 / (1.65)2 */
        System.out.println("La persona tiene una masa kg. estatura m. ");

        if(IMC < 16){
            System.out.println("La persona tiene delgadez severa");
        }else if(IMC < 17){
            System.out.println("La persona tiene delgadez moderada");
        }else if (IMC < 18){
            System.out.println("La persona tiene delgadez leve");
        }else if(IMC < 25){
            System.out.println("La persona tiene un peso normal");
        }else if(IMC < 30){
            System.out.println("La persona tiene sobre peso");
        }else if(IMC < 35){
            System.out.println("La persona tiene obecidad leve");
        }else if(IMC < 40){
            System.out.println("La persona tiene obecidad media");
        }else{
            System.out.println("La persona tiene obecidad morbida");
        }


    }
}

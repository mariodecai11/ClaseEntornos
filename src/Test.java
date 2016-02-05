
public class Test {
    
    public static void main(String[]args){
        
        
        int numRandom= (int)(Math.random()*1000);
        System.out.printf("El numero aleatorio es %d\n", numRandom);
        Primos primos = new Primos(numRandom);
        System.out.print("hola");
        primos.getLista();
        
        
    }    
}

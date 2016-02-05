
public class Primos {

    int[] listaPrimos;
    
    public Primos(int num){
        
        generaPrimos(num);
        
    }
    
    private void generaPrimos(int num){
        
        int contador = 0;
        int[] newarray;
        for (int i = 2; i <= num; i++) {
            
            boolean primo = true;
            
            for(int j = 2; j<i; j++)
                primo = i%j == 0;
                
            if (primo == true){
                contador++;
            }
        }
        newarray = new int[contador];
        
        int contador2 = 0;
        
        for (int k = 2; k <= num; k++) {
            
            boolean primo = true;
            
            for(int m = 2; m<k; m++)
                primo = k%m == 0;
                
            if (primo == true){
                
                newarray[contador2] = k;
                contador2++;
                
            }
            
        }
        listaPrimos = newarray;
        
    }
    
    public void getLista(){
        
        for (int i = 0; i < listaPrimos.length; i++) 
            System.out.printf("%d es un numero primo.\n", i);
        
    }
    
}

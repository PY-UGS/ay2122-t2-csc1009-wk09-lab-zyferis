import java.util.Random;
public class RandomCharacter {
    private Random random ;




    public static void main(String[] args) {
        RandomCharacter rc  = new RandomCharacter();
        String rLower = "";
        String rUpper = "";
        String rDigit = "";
        String rChar = "";
        for (int i = 0 ; i < 15 ; i++ ){
            rLower +=  rc.getRandomLowerCaseLetter()+ " " ;
            rUpper += rc.getRandomUpperCaseLetter() + " " ;
            rDigit += rc.getRandomDigitCharacter()+ " " ;
            rChar += rc.getRandomCharacter()+ " " ;
            
        }
        
        System.out.println("\n15 Random lowercase letter string: " + rLower);
        System.out.println("\n15 Random Uppercase letter string: " + rUpper);
        System.out.println("\n15 Random Digit string: " + rDigit);
        System.out.println("\n15 Random Character string: " + rChar + '\n');

        
        char rL = rc.getRandomLowerCaseLetter();
        char rU = rc.getRandomUpperCaseLetter();
        char rD = rc.getRandomDigitCharacter();
        char rC = rc.getRandomCharacter();

        System.out.println("Random lowercase letter character = "+ rL  + " , ASCII value = " + String.valueOf((int)rL) + " , Prime : " + String.valueOf(rc.isPrime(rL)));
        System.out.println("Random Uppercase letter character = " + rU  + " , ASCII value = " + String.valueOf((int)rU) + " , Prime : " + String.valueOf(rc.isPrime(rU)));
        System.out.println("Random Digit character = "+ rD  + " , ASCII value = " + String.valueOf((int)rD) + " , Prime : " + String.valueOf(rc.isPrime(rD)));
        System.out.println("Random character = " + rC  + " , ASCII value = " + String.valueOf((int)rC) + " , Prime : " + String.valueOf(rc.isPrime(rC)));
    }

    

    public RandomCharacter() {
        random = new Random();
    }   
    public char getRandomLowerCaseLetter(){
        int var = this.random.nextInt(26) + 97; 
        return  (char)var;
    }
    public char getRandomUpperCaseLetter(){
        int var = this.random.nextInt(26) + 65; 
        return  (char)var;
    }
    public char getRandomDigitCharacter(){
        int var = this.random.nextInt(10) + 48 ; 
        return (char)var;
    }
     
    public char getRandomCharacter(){
        char var = ' '; 
        switch (this.random.nextInt(3)) {
            case 0:
                var=  this.getRandomLowerCaseLetter();
                break;
            case 1:
                var= this.getRandomUpperCaseLetter();
                break;
            case 2:
                var= this.getRandomDigitCharacter();
                break;
        }
        
        return var;

    }


    public boolean isPrime(int a){
        int numbers = (int)Math.sqrt(a);

        for (int i = 2; i< numbers ; i++ ){
            if (a % i == 0 ){
                return false;
            }
        }

        return true;
    }

}

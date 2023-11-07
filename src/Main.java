public class Main {
    public static void main(String[] args) {
        int number=220;
        int number2=284;
        int total=0;
        int total2=0;
        for(int i=1;i<number;i++){
            if (number%i==0){
                total+=i;

            }
        }
        for(int j=1;j<number2;j++){
            if(number2%j==0){
                total2+=j;
            }
        }
        if(total==number2 && total2==number){
            System.out.println(number +" ve "+number2+" arkadaş sayidir.");
        }
        else{
            System.out.println(number +" ve "+number2+" arkadaş sayi değildir.");

        }


    }
}
import  java.util.Scanner;

public class NumberInWords {
    public  int n;

    public NumberInWords(int n){

        this.n = n;

    }


    public String res(){
//99999
        if(n / 10000 == 9)
            System.out.print("ninety ");
        else if(n / 10000 == 8)
            System.out.print("eighty ");
        else if(n / 10000 == 7)
            System.out.print("seventy ");
        else if(n / 10000 == 6)
            System.out.print("sixty ");
        else if(n / 10000 == 5)
            System.out.print("fifty ");
        else if(n / 10000 == 4)
            System.out.print("forty ");
        else if(n / 10000 == 3)
            System.out.print("thirty ");
        else if(n / 10000 == 2)
            System.out.print("twenty ");

//9999
        if(n / 1000 == 11)
            System.out.print("eleven thousand ");
        else if (n / 1000 == 12)
            System.out.print("twelve thousand ");
        else if (n / 1000 == 13)
            System.out.print("thirteen thousand ");
        else if (n / 1000 == 14)
            System.out.print("fourteen thousand ");
        else if (n / 1000 == 15)
            System.out.print("fiveteen thousand ");
        else if (n / 1000 == 16)
            System.out.print("sixteen thousand ");
        else if (n / 1000 == 17)
            System.out.print("seventeen thousand ");
        else if (n / 1000 == 18)
            System.out.print("eighteen thousand ");
        else if (n / 1000 == 19)
            System.out.print("nineteen thousand ");
        else {   //9999
            if ((n % 10000) / 1000 == 9)
                System.out.print("nine thousand ");
            else if ((n % 10000) / 1000 == 8)
                System.out.print("eight thousand ");
            else if ((n % 10000) / 1000 == 7)
                System.out.print("seven thousand ");
            else if ((n % 10000) / 1000 == 6)
                System.out.print("six thousand ");
            else if ((n % 10000) / 1000 == 5)
                System.out.print("five thousand ");
            else if ((n % 10000) / 1000 == 4)
                System.out.print("four thousand ");
            else if ((n % 10000) / 1000 == 3)
                System.out.print("three thousand ");
            else if ((n % 10000) / 1000 == 2)
                System.out.print("two thousand ");
            else if ((n % 10000) / 1000 == 1)
                System.out.print("one thousand ");
        }
//999

        if((n % 1000) / 100 == 9)
            System.out.print("nine hundred ");
        else if((n % 1000) / 100 == 8)
            System.out.print("eight hundred ");
        else if((n % 1000) / 100 == 7)
            System.out.print("seven hundred ");
        else if((n % 1000) / 100 == 6)
            System.out.print("six hundred ");
        else if((n % 1000) / 100 == 5)
            System.out.print("five hundred ");
        else if((n % 1000) / 100 == 4)
            System.out.print("four hundred ");
        else if((n % 1000) / 100 == 3)
            System.out.print("three hundred ");
        else if((n % 1000) / 100 == 2)
            System.out.print("two hundred ");
        else if((n % 1000) / 100 == 1)
            System.out.print("one hundred ");
//99

        if(n % 100 == 11)
            System.out.print("eleven");
        else if (n % 100 == 12)
            System.out.print("twelve");
        else if (n % 100 == 13)
            System.out.print("thirteen");
        else if (n % 100 == 14)
            System.out.print("fourteen");
        else if (n % 100 == 15)
            System.out.print("fiveteen");
        else if (n % 100 == 16)
            System.out.print("sixteen");
        else if (n % 100 == 17)
            System.out.print("seventeen");
        else if (n % 100 == 18)
            System.out.print("eighteen");
        else if (n % 100 == 19)
            System.out.print("nineteen");
        else {
            if ((n % 100) / 10 == 9)
                System.out.print("[and] ninety ");
            else if ((n % 100) / 10 == 8)
                System.out.print("[and] eighty ");
            else if ((n % 100) / 10 == 7)
                System.out.print("[and] seventy ");
            else if ((n % 100) / 10 == 6)
                System.out.print("[and] sixty ");
            else if ((n % 100) / 10 == 5)
                System.out.print("[and] fifty ");
            else if ((n % 100) / 10 == 4)
                System.out.print("[and] forty ");
            else if ((n % 100) / 10 == 3)
                System.out.print("[and] thirty ");
            else if ((n % 100) / 10 == 2)
                System.out.print("[and] twenty ");


//9

            if (n % 10 == 9)
                System.out.print("nine");
            else if (n % 10 == 8)
                System.out.print("eight");
            else if (n % 10 == 7)
                System.out.print("seven");
            else if (n % 10 == 6)
                System.out.print("six");
            else if (n % 10 == 5)
                System.out.print("five");
            else if (n % 10 == 4)
                System.out.print("four");
            else if (n % 10 == 3)
                System.out.print("three");
            else if (n % 10 == 2)
                System.out.print("two");
            else if (n % 10 == 1)
                System.out.print("one");
        }
        if(n == 0)
            System.out.print("zero");
        return "";
    }


    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        NumberInWords NIW = new NumberInWords(n);
        System.out.print(NIW.res());



    }
}
    /*
    public  NumberInWords(int n){
        this.n=n;
    }
      String s[] = {"","one","two","three","four","five","six","seven"};
    public  String res(){
        String word=null;


        return  word;
    }*/


/*
if(n < 20)
        {
            cout<<a[n]<<' ';
        }
        else if(n>20)
        {
            cout<<b[n/10] << ' ' << a[n%10];
        }

ninety nine thouthands nine hundred nineteen


["", "one"..."nine".."nineteen"]

[twenty...ninety]

99999/1000;

99999%1000;
999 hundred
999%100
99
99 thouthand*/
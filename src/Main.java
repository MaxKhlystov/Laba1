
public class Main {
    public static void main(String[] args) {
        int sizeArray = 10;
        //пункт а
        int[] FibbonachiNumbersArray = new int[sizeArray];
        System.out.println(sizeArray + " первых чисел Фиббоначи: ");
        for (int i = 0; i < sizeArray; i++) {
            if (i < 2) {
                FibbonachiNumbersArray[i] = 1;
            } else FibbonachiNumbersArray[i] = FibbonachiNumbersArray[i - 1] + FibbonachiNumbersArray[i - 2];
            System.out.println(FibbonachiNumbersArray[i]);
        }
        //пункт б
        int numberFirstElements = 10;
        System.out.println("Первые " + numberFirstElements + " чисел массива: ");
        for (int i = 0; i < numberFirstElements; i++)
        {
            if (FibbonachiNumbersArray[i] % 2 == 0) {
                System.out.println(FibbonachiNumbersArray[i] + "-*");
            } else System.out.println(FibbonachiNumbersArray[i]);
        }
        //пункт с
        float sumNumbers = 0;
        for (int i = 0; i < sizeArray; i++) {
            sumNumbers = sumNumbers + FibbonachiNumbersArray[i];
        }
        System.out.print("Среднее значение одномерного массива: ");
        sumNumbers = sumNumbers / sizeArray;
        System.out.println(sumNumbers);
        //Пункт д.
        int newNumber = 791;
        int i=0;
        //занести в массив
        String [] unitNumber = new String [10];
        unitNumber[1]="один";
        unitNumber[2]="два";
        unitNumber[3]="три";
        unitNumber[4]="четыре";
        unitNumber[5]="пять";
        unitNumber[6]="шесть";
        unitNumber[7]="семь";
        unitNumber[8]="восемь";
        unitNumber[9]="девять";
        String [] dozenMore19Num = new String [9];
        dozenMore19Num [0]="двадцать ";//20
        dozenMore19Num [1]="тридцать ";//30
        dozenMore19Num [2]="сорок ";
        dozenMore19Num [3]="пятьдесят ";//50
        dozenMore19Num [4]="шестьдесят ";//60
        dozenMore19Num [5]="семьдесят ";//70
        dozenMore19Num [6]="восемьдесят ";//80
        dozenMore19Num [7]="девяносто ";
        String [] dozenNotMore19Num = new String [10];
        dozenNotMore19Num [0]="десять";
        dozenNotMore19Num [1]="одиннадцать";
        dozenNotMore19Num [2]="двенадцать";
        dozenNotMore19Num [3]="тринадцать";
        dozenNotMore19Num [4]="четырнадцать";
        dozenNotMore19Num [5]="пятнадцать";
        dozenNotMore19Num [6]="шестнадцать";
        dozenNotMore19Num [7]="семнадцать";
        dozenNotMore19Num [8]="восемнадцать";
        dozenNotMore19Num [9]="девятнадцать";
        String [] hundredNum = new String [9];
        hundredNum [0]="сто ";
        hundredNum [1]="двести ";
        hundredNum [2]="триста ";
        hundredNum [3]="четыреста ";
        hundredNum [4]="пятьсот ";
        hundredNum [5]="шестьсот ";
        hundredNum [6]="семьсот ";
        hundredNum [7]="восемьсот ";
        hundredNum [8]="девятьсот ";
        String num1="";
        String num2="";
        String num3="";
        if (newNumber/100 !=0){
                num1=hundredNum[(newNumber/100)-1];
        }
        if ((newNumber%100)/10 !=0) {
            if (newNumber % 100 >= 10 && newNumber % 100 <= 19) {
                num2 = dozenNotMore19Num[(newNumber % 100) % 10];
                i=1;
            } else {
                num2 = dozenMore19Num[((newNumber % 100) / 10) - 2];
                i=0;
            }
        }
        if ((newNumber%100)% 10 != 0 && i==0){
            num3 = unitNumber[((newNumber % 100) % 10)];
        }
        System.out.println("Заданное число: " + newNumber);
        System.out.println("Заданное число словами: " + num1 + num2 + num3);
    }
}
public class Main {
    public static void main(String[] args)
    {
    //task1//
      for (int i = 0; i <= 10; i ++)
          System.out.println(" Число " + i);

        //task2//
      for (int k = 10; k >= 0; k --)
          System.out.println(" Число " + k);

      //task3//
     for (int l = 2; l < 17; l = l + 2)
         System.out.println(" Число " + l);

     //task4//
     for (int m = 10; m >= -10; m --)
         System.out.println(" Число " + m);

     //task5//
        for (int y = 1904; y <= 2096; y += 4)
            System.out.println(y + " год является високосным ");

        //task6//
     for (int n = 7; n <= 98; n += 7)
         System.out.println(" Число " + n);

     for (int j = 1; j <= 512; j *= 2)
         System.out.println(" Число " + j);

     //task7//
     int deposit = 29000;
     int total = 0;
     for (int month = 1; month <= 12; month ++)
         {total = total + deposit;
         System.out.println(" Месяц " + month + " сумма накоплений равна " + total + " рублей ");}
    }
 }
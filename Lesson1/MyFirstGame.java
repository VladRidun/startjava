public class MyFirstGame {   
    public static void main(String[] args)  {
      int  number_comp = 13;
      int number_user= 5;
      System.out.println("Ugadaite chislo, kotoroe zagadal computer");
      do { 
       if (number_user > number_comp){
            System.out.println("Dannoe chislo bolshe togo chto zagadal computer              "+number_user);
        number_user--;}
        else  if (number_user < number_comp){
            System.out.println("Dannoe chislo menshe togo chto zagadal computer              "+number_user);
        number_user++;}

      } while (number_user != number_comp);
        if (number_user == number_comp){
            System.out.println("Vy ugadali chislo        "+number_comp);       
  }
}
}

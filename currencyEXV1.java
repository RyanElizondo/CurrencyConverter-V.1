import java.util.HashMap;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class currencyEXV1 {
  
  public static double usd(String convertTo, double amount){
    if(convertTo == "CAD"){
     amount = amount * 1.2888949;
    }
    else if (convertTo == "EUR"){
      amount = amount * 0.95561485;
    }
    else if (convertTo == "YEN"){
      amount = amount * 128.24741;
    }
    else if (convertTo == "WON"){
      amount = amount * 1275.7869;
    }
    else if (convertTo == "CRC"){
      amount = amount * 670.11865;
    }
    return amount;
  }

  public static double cad(String convertTo, double amount){
    if(convertTo == "USD"){
     amount = amount * 0.77560144;
    }
    else if (convertTo == "EUR"){
      amount = amount * 0.74141541;
    }
    else if (convertTo == "YEN"){
      amount = amount * 99.473841;
    }
    else if (convertTo == "WON"){
      amount = amount * 989.87007;
    }
    else if (convertTo == "CRC"){
      amount = amount * 519.02067;
    }
    return amount;
  }

  public static double eur(String convertTo, double amount){
    if(convertTo == "USD"){
     amount = amount * 1.046356;
    }
    else if (convertTo == "CAD"){
      amount = amount * 1.3488806;
    }
    else if (convertTo == "YEN"){
      amount = amount * 134.13633;
    }
    else if (convertTo == "WON"){
      amount = amount * 1335.0731;
    }
    else if (convertTo == "CRC"){
      amount = amount * 700.00356;
    }
    return amount;
  }

  public static double yen(String convertTo, double amount){
    if(convertTo == "USD"){
     amount = amount * 0.0077998716;
    }
    else if (convertTo == "CAD"){
      amount = amount * 0.010055899;
    }
    else if (convertTo == "EUR"){
      amount = amount * 0.0074543954;
    }
    else if (convertTo == "WON"){
      amount = amount * 9.9504394;
    }
    else if (convertTo == "CRC"){
      amount = amount * 5.2172916;
    }
    return amount;
  }

  public static double won(String convertTo, double amount){
    if(convertTo == "USD"){
     amount = amount * 0.00078377285;
    }
    else if (convertTo == "CAD"){
      amount = amount * 0.0010105219;
    }
    else if (convertTo == "YEN"){
      amount = amount * 0.10049156;
    }
    else if (convertTo == "EUR"){
      amount = amount * 0.00074917228;
    }
    else if (convertTo == "CRC"){
      amount = amount * 0.52493172;
    }
    return amount;
  }

  public static double crc(String convertTo, double amount){
    if(convertTo == "USD"){
     amount = amount * 0.0014932667;
    }
    else if (convertTo == "CAD"){
      amount = amount * 0.0019243909;
    }
    else if (convertTo == "YEN"){
      amount = amount * 0.19139057;
    }
    else if (convertTo == "WON"){
      amount = amount * 1.9044082;
    }
    else if (convertTo == "EUR"){
      amount = amount * 0.0014270706;
    }
    return amount;
  }
  
  public static void conversions(String convertFrom, String convertTo, double amount){
    if (convertFrom == "USD"){
      double conversion = usd(convertTo, amount);
      System.out.println(" ");
      System.out.println(amount + " " + convertFrom + " -> " + conversion + " " + convertTo);
    }

    if (convertFrom == "CAD"){
      double conversion = cad(convertTo, amount);
      System.out.println(" ");
      System.out.println(amount + " " + convertFrom + " -> " + conversion + " " + convertTo);
    }

    if (convertFrom == "EUR"){
      double conversion = eur(convertTo, amount);
      System.out.println(" ");
      System.out.println(amount + " " + convertFrom + " -> " + conversion + " " + convertTo);
    }

    if (convertFrom == "YEN"){
      double conversion = yen(convertTo, amount);
      System.out.println(" ");
      System.out.println(amount + " " + convertFrom + " -> " + conversion + " " + convertTo);
    }

    if (convertFrom == "WON"){
      double conversion = won(convertTo, amount);
      System.out.println(" ");
      System.out.println(amount + " " + convertFrom + " -> " + conversion + " " + convertTo);
    }

    if (convertFrom == "CRC"){
      double conversion = crc(convertTo, amount);
      System.out.println(" ");
      System.out.println(amount + " " + convertFrom + " -> " + conversion + " " + convertTo);
    }

  }
  public static void main(String[] args){
    HashMap<Integer, String> currencyCode = new HashMap<Integer, String>();

      //currency codes
    currencyCode.put(1, "USD");
    currencyCode.put(2, "CAD");
    currencyCode.put(3, "EUR");
    currencyCode.put(4, "YEN");
    currencyCode.put(5, "WON");
    currencyCode.put(6, "CRC");

    System.out.println("Welcome to Squish Convert 1.0!");

    Scanner readChoice = new Scanner(System.in);
    System.out.println("Indicate which currency you would like from:");
    System.out.println("1:USD \t 2:CAD \t 3:EUR");
    System.out.println("4:YEN \t 5:WON \t 6:CRC");
    String convertFrom = currencyCode.get(readChoice.nextInt());

    System.out.println("Indicate which currency you would like to:");
    System.out.println("1:USD \t 2:CAD \t 3:EUR");
    System.out.println("4:YEN \t 5:WON \t 6:CRC");
    String convertTo = currencyCode.get(readChoice.nextInt());

    if(convertFrom == convertTo){
      System.out.println("You cannot convert between the same currency.");
    }
    else{
      System.out.println("Indicate amount you wish to convert:");
      double amount = readChoice.nextDouble();
  
      conversions(convertFrom, convertTo, amount);
    }
    

    
  }

  }

    

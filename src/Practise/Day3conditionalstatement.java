package Practise;

public class Day3conditionalstatement {
    public static void main(String[] args) {

   /*     char firstLetter='A';
         int firstletterInt=107;
        System.out.println("Character value in charger: "+(char)firstletterInt);


         boolean firstletterk=(firstletterInt==107);
         boolean test=true;
        boolean testfalse=true;
        System.out.println("Character value in charger: "+firstletterk);
        System.out.println("Character value in charger: "+testfalse);

        int result=0;
        result +=10;
        System.out.println(result);
       ++result;
        System.out.println(result);
        result++;
        System.out.println(result);

         */

        int productprice=2000;
        boolean isproducttypefood=false;
        if (productprice>50){
            if (isproducttypefood){
                System.out.println("food type");
            }else
            {
                System.out.println("No Food Type");
            }
            System.out.println("productprice lesser");
        }else if(productprice<=150){
            System.out.println("product price greater");
        }
    }
}
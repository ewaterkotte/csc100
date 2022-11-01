// Title: ConditionalsDemo
// Author: Eric Waterkotte
// Date: 11/2/2020
/* 
Description: This is a demonstration of conditional logic.  
             itemCount: current number of items the user is already purchasing 
             itemsInCart: how many additional items the user is purchasing.  
             TIP: Change the variables manually to test the conditional logic. 
*/

class Main {
  public static void main(String[] args) {
    int itemCount = 0;
    int itemsInCart = 5;
    int totalItems = itemCount + itemsInCart;
    String discountCode = "NO DISCOUNT";
    
    // Determine what the output for the user will be
    if(totalItems <= 0){
      System.out.println("Thanks for browsing, please come again.");
    }else{
      System.out.println("You purchased: " + totalItems + " items today, thank you for your business!");

      // #1 TODO: Read the code below and make sure you understand every line.  
      //         Edit the code to add another case where if totalItems is 100 or more 
      //         the discount code is "GalacticDiscount".  

      // Detect discount and print
      if(totalItems > 4 && totalItems < 10){
        discountCode = "SmallButMighty";
        System.out.println("Discount code: "+ discountCode);
      }
      else if(totalItems > 9 && totalItems < 15){
        discountCode = "MediumIsLarge";
        System.out.println("Discount code: "+ discountCode);
      }
      else if(totalItems > 14 && totalItems < 20){
        discountCode = "SuperGigante";
       System.out.println("Discount code: "+ discountCode);
      }  
    }
    
    // #2 TODO: Insert comments here that show the range of values for totalItems
    //          and what their corrosponding discount codes are, 
    //          including the discount code you added but not including
    //          the default discount code of "NO DISCOUNT"

    // DISCOUNT CODE:
    // TotalItems Range: 

    // DISCOUNT CODE: 
    // TotalItems Range:

    // DISCOUNT CODE: 
    // TotalItems Range:

    // DISCOUNT CODE: 
    // TotalItems Range:

  }
}

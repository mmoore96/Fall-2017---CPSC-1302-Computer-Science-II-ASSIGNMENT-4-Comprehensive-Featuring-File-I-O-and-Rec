# Fall-2017---CPSC-1302-Computer-Science-II-ASSIGNMENT-4-Comprehensive-Featuring-File-I-O-and-Rec
Fall 2017 - CPSC 1302 – Computer Science II

ASSIGNMENT 4: Comprehensive (Featuring File I/O and Recursion).

This assignment is due by 8:45 p.m. EST on Wednesday, Nov. 29, 2017. Late submissions will be graded as described in the syllabus. Assignments submitted at or after 12:01 a.m. EST, Dec 03, will not be accepted. Please start working on your assignment early. Please work individually.  

Code that does not compile will receive a grade of 0.

Problem Statement: Discount Store. This discount store carries a variety of furniture products and clothing products. They want us to write an app that stores their inventory of products and displays it to the user, including the unit price of each product, how many units are left of the product, and the discount rate that is applicable to the product. 

The user can then select a product, how many items they want to purchase, insert money (by keying in the amount), and get the selected item dispensed if the amount is right after discount and if there are enough units of the product left to fulfill the order. (The user gets an additional discount of %5 if they buy more than two units of the product.) The app must return the change if the amount entered is above the grand total after all of the discounts.

The app has an option that allows the user to restock the store by setting the units of each product to a positive value of your choosing.

The app must redisplay the updated inventory to allow the user to buy again. The app must update the amount of money that it has collected so far. When the app starts, it must read its inventory from three text files (totalSales.txt, furniture_products.txt and clothing_products.txt). The app must save the inventory, and the amount of money collected over the lifetime of the app, back to the three text files before exiting or when asked to by the user.

Super class (abstract)
abstract class Product: 
private instance variables – String name, double unitPrice, int quantityInStock
private static variable – double totalSales

includes an abstract method called double applyDiscount(), which returns the unit price of the product after discount.

Two subclasses 
class FurnitureProduct: private instance variables–boolean indoors, double discountRate
class ClothingProduct: private instance variable– String gender, double discountRate

Recursive method (Goes in your tester)
int findCheaper(ArrayList<Product> products, double threshold)
Recursively traverses the array list, prints the products whose unit price is less than or equal to threshold.
Mutator (Goes in your tester)
boolean sell(ArrayList<Product> products, int index, int x)
Finds product at position index in the array list and dispenses x units of that product if x units
are available. Returns true if the sale is successful. Returns false otherwise.

void restock(ArrayList<Product> products)
Sets the quantityInStock of each object in the array list to a positive value of your choosing.

Code that does not compile will receive a grade of 0.
Lab (Design and Coding)
Design and code a solution to the above problem statement. Your solution must satisfy the following:
Behavior
(2 points) Correctly read the set of objects from two text files (one holding objects of the first subclass and the other holding objects of the second subclass) and load them into array lists. Correctly read totalSales from a third textfile. Use FileNotFoundException
(2 points) Correctly save the array list of objects back out to the two text files before exiting. Correctly save the totalSales back to the third text file. Use PrintWriter.
(1.5 points) Catch and handle at least one of the following three exceptions: ArithmeticException, NumberFormatException, IndexOutOfBoundsException
(2 points) Your recursive method is coded correctly (behaves correctly, has a base case, has a recursive step, no stack overflows)
(2 points) Your recursive method is called from within your main method
(3 points) The methods that mutate your array list are coded correctly (behaves as expected)
(3 points) The methods that mutate your array list are called from within your main method to mutate the array.
(2 points) The applyDiscount()method is correctly implemented by your superclass
(2 points) The applyDiscount()method is called from within your main method to compute the grand total after discount before the user is asked to make their payment for the product that they selected.

Coding Practices
The superclass and the two subclasses are coded so that:
(0.25 points) the class’ name is a singular noun that starts with an upper case letter
(0.25 points) all of the private instance variables are included in each class.
(0.25 points) totalCost is a static variable of class Product.
(0.25 points) each class has a default constructor that is composed of a sequence of this.set() methods. A subclass will also need to call super(). Each class has a custom constructor that is composed of a sequence of this.set() methods. A subclass will also need to call super().
(0.25 points) each class has a get() method for each instance variable. Each class has a set() method for each instance variable. Each set() method uses the this keyword.
(0.25 points) each class has a toString() method. A subclass will also need to call super.toString().

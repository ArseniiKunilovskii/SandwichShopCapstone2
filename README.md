# SandwichShop

## Description of the Project

This is a Java console application designed to simulate the point of sale (POS) system for "DELI-cious" , a custom sandwich shop. The system was developed to automate the order process, replacing the shop's previous paper-based system.

The application is built using Object-Oriented Analysis and Design (OOAD), making use of abstract classes (Item, Topping) and inheritance to manage complex pricing and customization logic.

[UML class.pdf](UML%20class.pdf)

## User Stories

List the user stories that guided the development of your application. Format these stories as: "As a [type of user], I want [some goal] so that [some reason]."

- As a customer, I want to be able to start a New Order from the Home Screen and then be presented with options to Add Sandwich, Add Drink, Add Chips, Checkout, or Cancel Order so that I can assemble my full purchase.
- As a customer, I want to be able to fully customize my Sandwich order by selecting the size (4", 8", 12"), bread type (white, wheat, rye, or wrap), and various toppings (Meats, Cheeses, Regular Toppings, Sauces, and Sides) with the option to have the sandwich toasted and add extras to premium toppings, so that I get exactly the sandwich I want
- As a customer, I want to be able to Add Drink and Add Chips to my order, specifying the drink size and flavor or the chip type, so that I can purchase sides along with or instead of a sandwich.
- As a customer, I want the application to display the full order details and the total cost upon checkout, and upon Confirmation, I want the order details to be saved to a receipt file named by the date and time (yyyyMMdd-hhmmss.txt) in a dedicated receipts folder, so I have a record of my purchase.
- As a customer, I want to be able to Cancel Order from the Order Screen or the Checkout Screen, which should delete the current order and take me back to the Home Screen, so that I can abandon an order if needed.
- As a customer, I want an option to order pre-configured Signature Sandwiches (like the BLT or Philly Cheese Steak) from the Order Screen, so that I can quickly select a popular item without customizing it from scratch.
- As a customer, after selecting a Signature Sandwich, I want to be able to remove or add more toppings to the sandwich before adding it to my order, so that I can use the template as a starting point for my custom creation.

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.

## Technologies Used

- Java: Mention the version you are using.
- Core Libraries: java.util, java.io (for ReceiptFileManager), and java.time (for timestamping receipts).

## Demo
![Recording 2025-11-13 150134.gif](Recording%202025-11-13%20150134.gif)

![Screenshot 2025-11-13 151533.png](Screenshot%202025-11-13%20151533.png)

## Future Work

Outline potential future enhancements or functionalities you might consider adding:

- Add cash counting.
- Create items deletion.

## Resources

List resources such as tutorials, articles, or documentation that helped you during the project.

- [Java Programming Tutorial](https://www.example.com)
- [Effective Java](https://www.example.com)

## Team Members

- Arsenii Kunilovskii

## Thanks

Express gratitude towards those who provided help, guidance, or resources:

- Thank you to Raymond for continuous support and guidance.
- A special thanks to PotatoSensei.

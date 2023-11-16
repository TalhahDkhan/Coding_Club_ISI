# PersonClass Java Class

## Overview
This repository introduces a Java class named `PersonClass`, designed to represent a person's attributes such as language, height, and weight. The class provides constructors for initializing these attributes and getter methods for retrieving their values. Additionally, private methods for setting height and weight include validation to prevent negative values. The `getAttributes` method facilitates printing a person's information.

## Usage
1. Open your preferred Java development environment.
2. Create a new Java class named `PersonClass` by creating a new Java file and naming it `PersonClass.java`.
3. Inside the `PersonClass` class, declare three private instance variables: `language`, `height`, and `weight` to store a person's language, height, and weight, respectively.
4. Create the first constructor that accepts a language parameter. Inside this constructor, initialize the `language` attribute.
5. Create the second constructor that accepts parameters for language, height, and weight. Inside this constructor, initialize all three attributes (`language`, `height`, and `weight`).
6. Implement private methods `setHeight` and `setWeight` to set the height and weight attributes, respectively. Include validation in these methods to ensure that negative values are not accepted.
7. Create getter methods for the attributes: `getLanguage`, `getHeight`, and `getWeight` to retrieve the values of these attributes.
8. Implement a `getAttributes` method that prints the person's attributes, allowing you to display the person's information.

## Testing
You can add a `main` method in the same class or create another class to test and use the `PersonClass` methods. For example, create `PersonClass` objects using the constructors and call the methods to access and print the attributes.

Compile and run your Java program to test the `PersonClass` functionality using your IDE or the command line. If everything works, push and submit on classrooms with the github link to your repository.

## Bonus: BMI Calculation Enhancement
Extend the BMI calculation method introduced earlier. Ask students to modify it to calculate BMI in both metric (height in meters and weight in kilograms) and imperial (height in inches and weight in pounds) units. Provide a choice for the user to select the unit system and perform the calculation accordingly.

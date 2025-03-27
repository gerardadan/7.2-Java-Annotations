# Readme for Exercise: Hierarchy of Worker Classes

## 📄 Description

### Exercise 1: Worker Hierarchy Example

In this exercise, you need to create a hierarchy of objects with three classes: `Employee`, `EmployeeOnline`, and `EmployeeOffice`.

- **Class `Employee`**:
  - Attributes: `name`, `surname`, `salary` .
  - Method `calculateSalary(int horesTreballades)`: This method takes the number of hours worked as a parameter and multiplies it by the hourly rate to calculate the salary.
  
- **Class `EmployeeOffice`** (extends `Employee`):
  - Overrides the `calculateSalary()` method.
  - The method receives the number of hours worked in a month as a parameter. The salary is calculated by multiplying the hours worked by the hourly rate and adding a static attribute called `benzina` (fuel), which is specific to this class.

- **Class `EmployeeOnline`** (extends `Employee`):
  - Overrides the `calculateSalary()` method.
  - The method receives the number of hours worked in a month as a parameter. The salary is calculated by multiplying the hours worked by the hourly rate and adding the value of a constant attribute called `tarifaInternet` (Internet flat fee), which is specific to this class.

### Requirements:
1. Create the `Employee` class with the necessary attributes and the `calculateSalary()` method.
2. Create the `EmployeeOffice` class that extends `Employee` and overrides the `calculateSalary()` method. Include the static attribute `fuelFeed` and use it in the salary calculation.
3. Create the `EmployeeOnline` class that extends `Employee` and overrides the `calculateSalary()` method. Include the constant attribute `internetFeed` and use it in the salary calculation.
4. In the `main()` method of the `Principal` class, demonstrate the use of the `@Override` annotation by calling the `calculateSalary()` method for instances of `EmployeeOffice` and `EmployeeOnline`.

### Explanation of the `@Override` Annotation:
- The `@Override` annotation is used to indicate that a method is overriding a method from its superclass.
- In this exercise, both `EmployeeOffice` and `EmployeeOnline` override the `calculateSalary()` method of the `Employee` class.
- Using `@Override` ensures that the method is correctly overriding a method from the superclass and can help avoid errors, such as misspelling the method name.

### Exercise 2: Deprecated Methods
- Add some deprecated methods to the child classes (`TreballadorPresencial` and `TreballadorOnline`), and use the `@Deprecated` annotation to mark them as deprecated.
- In a separate class, invoke the deprecated methods and suppress the warnings related to their use by applying the `@SuppressWarnings("deprecation")` annotation.

## 💻 Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Inheritance
- Method Overriding
- Annotations

## 📋 Requirements
- JDK 8 or higher
- A development environment such as IntelliJ IDEA, Eclipse, or VS Code with Java support
```

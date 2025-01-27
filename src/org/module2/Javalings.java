package org.module2;

/*
 * This Javaling highlights some common errors students make while
 * printing to the console, reading user input, and coding with control flow.
 */
public class Javalings {
    /*
     * Some languages like Python allow you to use single-quotes interchangably
     * with double quotes. Java does not. Single-quotes are reserved for char literals.
     * 
     * Example:
     * 
     * String a = "A string";
     * char s = 'a';
     */
    static void printSomething() {
        System.out.println('Foo');
    }
    
    /*
     * This print statement seems correct, but we're missing something...
     */
    static void printSomethingElse() {
        System.out.println("Bar")
    }
    
    /*
     * Be careful if your string contains quotes in it.
     */
    static void printEvenMore() {
        System.out.println("And then he said to me... "Baz!"");
    }
    
    /*
     * We're forgetting something here too. When you fix this, notice how
     * everything is printed on the same line.
     */
    static void printOnTheSameLine() {
        print("This is ");
        print("on the same line ");
        print("as the other statements!\n");
    }

    /*
     * We add semicolons to the end of most statements in Java. It's
     * common for students to add semicolons to the end of a conditional
     * header as well. This is a mistake.
     */
    static void someConditional() {
        if (false);
            System.out.println("!! This should not be printed !!");
    }
    
    /*
     * Sometimes people use the wrong operators to compare different types.
     */
    static void wrongComparison() throws Exception {
        String word = new String("foo");
        String other = new String("foo");
        if (1 = 1) { // What is the correct operator to use here?
            System.out.println("This should be printed. ");
        }
        
        // The `==` operator checks if two references are the same, not the actual value of
        // an object.
        if (word == other) {
            System.out.println("Good work!");
        } else {
            throw new Exception("You aren't comparing Strings correctly.");
        }
    }
    
    /*
     * When you need your code on more than one line, you need to use brackets.
     */
    static void multilineConditionals() throws Exception {
        // What's missing?
        if (false)
            System.out.println("Foo");
            throw new Exception("Fix your multiline conditional");
    }
    
    /*
     * Java has some pretty strict typing, and makes no assumptions about
     * what type you assign a variable. Fix these type declarations.
     */
    static void typeOfVariables() {
        int a = 0.5;
        double b = "2.0";
        string c = 5; // Is `string` a valid primitive type?
        char d = "b";
        boolean f = "false";
    }
    
    
    /*
     * Scanners are a common pitfall for programmer error, since it
     * involves multiple steps to set up and use and isn't very
     * intuitive when you first use it. It also has some quirks
     * that can be difficult to explain.
     * 
     * Correct this block of code.
     */
    static void userInput() {
        // Hmm, I'm forgetting something at the top of this file...
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scan.nextLn();
        System.out.println("Hello " + name);
        scan.close();
    }
    
    /*
     * This is a common problem that people run into when reading from user input.
     * Scanners use newlines (enter key, or literal `\n`) to determine when to stop
     * reading from input. When using methods like `nextInt()`, the scanner will
     * "eat" the integers it reads, but will not "eat" the newline, despite it
     * interpreting the newline as a signal to stop. This usually leads to
     * followup inputs being skipped, sometimes causing infinite loops when
     * a `while` loop is involved.
     */
    static void skippedUserInput() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scan.nextInt();
        System.out.println("You entered " + i);

        System.out.print("Enter your name: ");
        String name = scan.nextLine(); // Why is this input being skipped?
        if (name.equals("")){
            scan.close();
            throw new Exception("\nEmpty name, try again.");
        }
        scan.close();
    }

    public static void main(String[] args) throws Exception {
        printSomething();
        printSomethingElse();
        printEvenMore();
        printOnTheSameLine();
        someConditional();
        wrongComparison();
        multilineConditionals();
        typeOfVariables();
        userInput();
        skippedUserInput();
    }
}

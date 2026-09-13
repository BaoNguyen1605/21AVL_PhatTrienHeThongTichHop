import java.util.Scanner;

class Animal {
    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Weight: " + weight + "kg");
    }
}

class Lion extends Animal {
    double eat;

    public Lion(String name, double weight, double eat) {
        super(name, weight);
        this.eat = eat;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Food per day: " + eat + "kg");
    }
}

class Snake extends Animal {
    double length;

    public Snake(String name, double weight, double length) {
        super(name, weight);
        this.length = length;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Length: " + length + "m");
    }
}

class Monkey extends Animal {
    String favoriteFood;

    public Monkey(String name, double weight, String favoriteFood) {
        super(name, weight);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Favorite food: " + favoriteFood);
    }
}

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a lion
        System.out.println("--- Lion ---");
        System.out.print("Enter lion name: ");
        String lionName = sc.nextLine();
        System.out.print("Enter lion weight (kg): ");
        double lionWeight = sc.nextDouble();
        System.out.print("Enter food per day (kg): ");
        double lionEat = sc.nextDouble();
        sc.nextLine(); // Consume newline

        Lion lion = new Lion(lionName, lionWeight, lionEat);

        // Create a snake
        System.out.println("\n--- Snake ---");
        System.out.print("Enter snake name: ");
        String snakeName = sc.nextLine();
        System.out.print("Enter snake weight (kg): ");
        double snakeWeight = sc.nextDouble();
        System.out.print("Enter snake length (m): ");
        double snakeLength = sc.nextDouble();
        sc.nextLine(); // Consume newline

        Snake snake = new Snake(snakeName, snakeWeight, snakeLength);

        // Create a monkey
        System.out.println("\n--- Monkey ---");
        System.out.print("Enter monkey name: ");
        String monkeyName = sc.nextLine();
        System.out.print("Enter monkey weight (kg): ");
        double monkeyWeight = sc.nextDouble();
        System.out.print("Enter monkey favorite food: ");
        String monkeyFood = sc.nextLine();

        Monkey monkey = new Monkey(monkeyName, monkeyWeight, monkeyFood);

        // Display all animals
        System.out.println("\n=== ZOO ANIMALS ===");
        lion.displayInfo();
        System.out.println();
        snake.displayInfo();
        System.out.println();
        monkey.displayInfo();

        sc.close();
    }
}

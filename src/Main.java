import java.util.Scanner;

class Baseline {
    private String productName;
    private String productDescription;
    private double productPrice;

    public Baseline(String productName, String productDescription, double productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}


class Behaviour {
    private String animalName;
    private int animalAge;
    private boolean isCarnivorous;

    public Behaviour(String animalName, int animalAge, boolean isCarnivorous) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.isCarnivorous = isCarnivorous;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        isCarnivorous = carnivorous;
    }

}


class Blog {
    private String title;
    private String author;
    private int views;

    public Blog(String title, String author, int views) {
        this.title = title;
        this.author = author;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задайте размер массивов (например, 3 объекта каждого класса)
        int arraySize = 3;

        // Создайте массивы объектов для каждого класса
        Baseline[] baselineArray = new Baseline[arraySize];
        Behaviour[] behaviourArray = new Behaviour[arraySize];
        Blog[] blogArray = new Blog[arraySize];

        // Заполните массивы данными, введенными с клавиатуры
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значения для класса Baseline " + (i + 1) + ":");
            System.out.println("ProductName: ");
            String productName = scanner.nextLine();
            System.out.println("ProductDescription: ");
            String productDescription = scanner.nextLine();
            System.out.println("ProductPrice: ");
            double productPrice = scanner.nextDouble();
            baselineArray[i] = new Baseline(productName, productDescription, productPrice);

            scanner.nextLine();
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значения для класса Behaviour " + (i + 1) + ":");
            System.out.println("AnimalName: ");
            String animalName = scanner.nextLine();
            System.out.println("AnimalAge: ");
            int animalAge = scanner.nextInt();
            System.out.println("IsCarnivorous (true or false): ");
            boolean isCarnivorous = scanner.nextBoolean();
            behaviourArray[i] = new Behaviour(animalName, animalAge, isCarnivorous);

            scanner.nextLine();
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значения для класса Blog " + (i + 1) + ":");
            System.out.println("Title: ");
            String title = scanner.nextLine();
            System.out.println("Author: ");
            String author = scanner.nextLine();
            System.out.println("Views: ");
            int views = scanner.nextInt();
            blogArray[i] = new Blog(title, author, views);

            scanner.nextLine();
        }

        // Выведите содержимое массивов объектов
        System.out.println("Содержимое массива объектов Baseline:");
        for (int i = 0; i < baselineArray.length ; i++) {
            System.out.println((i + 1) +" Элемент массива объектов Baseline:");
            System.out.println("productName: " + baselineArray[i].getProductName());
            System.out.println("productDescription: " + baselineArray[i].getProductDescription());
            System.out.println("productPrice: " + baselineArray[i].getProductPrice());
            System.out.println();
        }

        System.out.println("Содержимое массива объектов Behaviour:");
        for (int i = 0; i < behaviourArray.length ; i++) {
            System.out.println((i + 1) + " Элемент массива объектов Behaviour:");
            System.out.println("animalName: " + behaviourArray[i].getAnimalName());
            System.out.println("IsCarnivorous (является ли хищником): " + behaviourArray[i].isCarnivorous());
            System.out.println("AnimalAge: " + behaviourArray[i].getAnimalAge());
            System.out.println();
        }

        System.out.println("Содержимое массива объектов Blog:");
        for (int i = 0; i < blogArray.length ; i++) {
            System.out.println((i + 1) + " Элемент массива объектов Blog");
            System.out.println("title: " + blogArray[i].getTitle());
            System.out.println("author: " + blogArray[i].getAuthor());
            System.out.println("views: " + blogArray[i].getViews());
            System.out.println();
        }

        // Находим наибольший и наименьший элементы в массиве Blog по параметру "views"
        Blog maxViewsBlog = blogArray[0];
        Blog minViewsBlog = blogArray[0];

        for (Blog blog : blogArray) {
            if (blog.getViews() > maxViewsBlog.getViews()) {
                maxViewsBlog = blog;
            }
            if (blog.getViews() < minViewsBlog.getViews()) {
                minViewsBlog = blog;
            }
        }

        System.out.println("Наибольший просмотренный блог:");
        System.out.println("title: " + maxViewsBlog.getTitle());
        System.out.println("author: " + maxViewsBlog.getAuthor());
        System.out.println("views: " + maxViewsBlog.getViews());

        System.out.println("Наименьший просмотренный блог:");
        System.out.println("title: " + minViewsBlog.getTitle());
        System.out.println("author: " + minViewsBlog.getAuthor());
        System.out.println("views: " + minViewsBlog.getViews());

        scanner.close();
    }
}
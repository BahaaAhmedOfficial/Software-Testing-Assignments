class Book {
    private String name;
    private int numberOfPages;
    private float price;

    public Book() {
        this.name = "Unknown";
        this.numberOfPages = 0;
        this.price = 0.0f;
    }

    public Book(String name, int numberOfPages, float price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void displayBookInfo() {
        System.out.println("Book Name: " + name);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Price: " + price);
    }
}

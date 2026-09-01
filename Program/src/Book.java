
public class Book 
{
    private int id;
    private int stock;
    private String author;
    private String name;    
    private Double price;

    public Book(int id, String author, String name) {
        this.id = id;
        
        this.author = author;
        this.name = name;
        
    }

    public Book(String name, String author, int id, Double price)
    {
        this(id, author, name);
        this.price = price;
    }


    public Book(String name, String author, int id, Double price, int stock)
    {
        this(name, author, id, price);
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) throws IllegalArgumentException {
        if (price >= 0) {
            this.price = price;
        }
        else
            {
                throw new IllegalArgumentException("Preço não pode ser 0 ou negativo");
            }
    }

        public void setStock(int stock) throws IllegalArgumentException {
        if (stock >= 0) {
            this.stock = stock;
        }
        else
            {
                throw new IllegalArgumentException("Estoque não pode ser 0 ou negativo");
            }
    }

      @Override
    public String toString() {
        return String.format("Book [id=%d, name='%s', author='%s', price=R$%.2f, stock=%d]", 
                id, name, author, price, stock);
    }
}
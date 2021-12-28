package example.com.client;

public class Model {
    private String imageUrl;
    private String productPrice;
    private String product;

    public Model() {
    }

    public Model(String imageUrl, String productPrice, String product) {
        this.imageUrl = imageUrl;
        this.productPrice = productPrice;
        this.product = product;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProduct() {
        return product;
    }
}

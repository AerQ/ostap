public class ProductInfo {
    private String url;
    private String name;
    private double price;
    private String imageUrl;
    private String availability;
    private String color;
    private String description;

    public ProductInfo(String url, String name, double price, String imageUrl, String availability, String color, String description) {
        this.url = url;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.availability = availability;
        this.color = color;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductInfo{");
        sb.append("url='").append(url).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", availability='").append(availability).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

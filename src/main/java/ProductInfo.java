import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.util.List;

@XmlRootElement
public class ProductInfo {

    private String url;
    private String name;
    private String price;
//    private String imageUrl;
    private String availability;
    private String color;
    private String description;
    private List<String> products;

    public ProductInfo(String url, String name, String price, String availability, String color, String description) {
        this.url = url;
        this.name = name;
        this.price = price;

        this.availability = availability;
        this.color = color;
        this.description = description;
    }

    public ProductInfo() {
        super();
    }

    @XmlElement
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @XmlElement
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @XmlElement
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement
    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductInfo{");
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", availability='").append(availability).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

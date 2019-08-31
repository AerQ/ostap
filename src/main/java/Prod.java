import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;

@XmlRootElement
public class Prod {
    private String url;
    private String name;
    private String price;
    private String availability;
    private String color;
    private String description;

    public Prod() {
    }

    public Prod(String url, String name, String price, String availability, String color, String description) throws IOException {
        url = getUrl();
        name = getName();
        price = getPrice();
        availability = getAvailability();
        color = getColor();
        description = getDescription();
        
    }


    private static Document siteUrl() throws IOException {
        Document doc;
        return doc = Jsoup.connect("https://prom.ua/p843085994-noutbuk-omen-dc0047ur.html").get();
    }

    public String getPrice() throws IOException {
        return siteUrl().getElementsByAttributeValue("class", "x-product-price").get(0).text();
//        System.out.println(res);
    }

    @XmlElement
    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() throws IOException {
        return siteUrl().baseUri();
//        System.out.println(url);
    }

    @XmlElement
    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() throws IOException {
        return siteUrl().select("h1").text();
//        System.out.println(name);
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }


    public String getAvailability() throws IOException {
        return siteUrl().getElementsByClass("x-product-presence").text();
//        System.out.println(availability);
    }

    @XmlElement
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getColor() throws IOException {
        return siteUrl().select("em").get(4).text();
//        System.out.println(color);
    }

    @XmlElement
    public void setColor(String color) {
        this.color = color;
    }


    public String getDescription() throws IOException {
        Element table = siteUrl().select("table").get(3);
        Elements rows = table.select("tr");
        for (int i = 0; i < rows.size(); i++) {
            Element row = rows.get(i);
            Elements cols = row.select("td");
            String result = cols.get(0).text() + " " + cols.get(1).text();
            return result;
        }
        return null;

    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(url).append("\n");
        sb.append(name).append("\n");
        sb.append(price).append("\n");
        sb.append(availability).append("\n");
        sb.append(color).append("\n");
        sb.append(description).append("\n");
        return sb.toString();
    }
}

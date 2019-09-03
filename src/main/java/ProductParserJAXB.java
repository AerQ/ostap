import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class ProductParserJAXB {
    private final String url;
    private Document doc;


    public ProductParserJAXB( String url,Document doc) throws IOException {
        this.url = url;
        this.doc = Jsoup.connect(url).get();

    }

    public void marshall() {
        try {
            Elements divElements = doc.getElementsByAttributeValue("class", "x-layout");
            for (Element divElement : divElements) {
                String nameSelect = divElement.select("h1").text();
                String getUrl = divElement.baseUri();
                String getPrice = divElement.getElementsByAttributeValue("class", "x-product-price").get(0).text();
                String getAvailability = divElement.getElementsByClass("x-product-presence").text();
                String getColor = String.valueOf(divElement.select("em").get(4).text());
                String getDescription = divElement.getElementsByClass("x-title").get(2).text();
                ProductInfo productInfo = new ProductInfo(getUrl, nameSelect, getPrice, getAvailability, getColor, getDescription);
                JAXBContext context = JAXBContext.newInstance(ProductInfo.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(productInfo, new File("src/main/java/product.xml"));
                marshaller.marshal(productInfo, System.out);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//
//    public String getDescription() throws IOException {
//        Element table = siteUrl().select("table").get(3);
//        Elements rows = table.select("tr");
//        for (int i = 0; i < rows.size(); i++) {
//            Element row = rows.get(i);
//            Elements cols = row.select("td");
//            String result = cols.get(0).text() + " " + cols.get(1).text();
//            return result;
//        }
//        return null;
//
//    }
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    private static Document doc;



    public static void main(String[] args) throws JAXBException, IOException {
        Prod prod = new Prod();
        prod.getDescription();
//        System.out.println(prod.getUrl() + prod.getAvailability());
        File file = new File("C:/Users/Остап/IdeaProjects/obychenie/myxml.xml");
        JAXBContext context = JAXBContext.newInstance(Prod.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(prod,file);
        marshaller.marshal(prod,System.out);

    }
//    private static void getInfo() {
//        List<Prod> productInfos = new ArrayList<>();
//        Elements divElements = doc.getElementsByAttributeValue("class", "x-layout");
//        for (Element divElement : divElements) {
//            String nameSelect = divElement.select("h1").text();
//            String getUrl = divElement.baseUri();
//            String getPrice = divElement.getElementsByAttributeValue("class", "x-product-price").get(0).text();
//
//            String getAvailability = divElement.getElementsByClass("x-product-presence").text();
//            String getColor = String.valueOf(divElement.select("em").get(4).text());
//            String des = divElement.getElementsByClass("x-title").get(2).text();
//            productInfos.add(new Prod(nameSelect, getUrl, getPrice, getAvailability, getColor, des));
//            for (Prod s : productInfos) {
//                System.out.println(s);
//            }
//        }
//    }
//    private static void getDescr() {
//
//        Element table = doc.select("table").get(3);
//        Elements rows = table.select("tr");
//        for (int i = 0; i < rows.size(); i++) {
//            Element row = rows.get(i);
//            Elements cols = row.select("td");
//            System.out.println(cols.get(0).text() + " " + cols.get(1).text());
//        }

}
//    //get all images
//    doc = Jsoup.connect("http://yahoo.com").get();
//    Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
//            for (Element image : images) {
//
//        System.out.println("\nsrc : " + image.attr("src"));
//        System.out.println("height : " + image.attr("height"));
//        System.out.println("width : " + image.attr("width"));
//        System.out.println("alt : " + image.attr("alt"));






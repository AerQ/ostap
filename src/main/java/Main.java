import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {

private static String url ="https://prom.ua/p843085994-noutbuk-omen-dc0047ur.html";


    public static void main(String[] args) throws JAXBException, IOException {
        ProductParserJAXB a = new ProductParserJAXB();
        a.marshall();
    }}
//    private static void getInfo() {
//        List<ProductListParser> productInfos = new ArrayList<>();
//        Elements divElements = doc.getElementsByAttributeValue("class", "x-layout");
//        for (Element divElement : divElements) {
//            String nameSelect = divElement.select("h1").text();
//            String getUrl = divElement.baseUri();
//            String getPrice = divElement.getElementsByAttributeValue("class", "x-product-price").get(0).text();
//
//            String getAvailability = divElement.getElementsByClass("x-product-presence").text();
//            String getColor = String.valueOf(divElement.select("em").get(4).text());
//            String des = divElement.getElementsByClass("x-title").get(2).text();
//            productInfos.add(new ProductListParser(nameSelect, getUrl, getPrice, getAvailability, getColor, des));
//            for (ProductListParser s : productInfos) {
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
//    //get all images
//    doc = Jsoup.connect("http://yahoo.com").get();
//    Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
//            for (Element image : images) {
//
//        System.out.println("\nsrc : " + image.attr("src"));
//        System.out.println("height : " + image.attr("height"));
//        System.out.println("width : " + image.attr("width"));
//        System.out.println("alt : " + image.attr("alt"));






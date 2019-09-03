import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class ProductXmlWriter {
    Marshaller marshaller;
    private final String directory = "src/main/java/";

    public void writeProductsToXML(List<ProductInfo> products) throws JAXBException {

        for (ProductInfo productInfo :products) {
            String fileName = "product.xml";
            JAXBContext context = JAXBContext.newInstance(ProductInfo.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(productInfo, new File(directory+"product.xml"));
            marshaller.marshal(productInfo, System.out);
        }

    }
}

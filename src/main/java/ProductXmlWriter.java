import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class ProductXmlWriter {
   private Marshaller marshaller;
    private final String directory = "src/main/java/";

    public ProductXmlWriter() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ProductInfo.class);
        marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    }

    public void writeProductsToXML(List<ProductInfo> products) throws JAXBException {

        for (ProductInfo productInfo :products) {
            String fileName = productInfo.getName().replaceAll(" ", "_");
            marshaller.marshal(productInfo, new File(directory + fileName));
        }
        }

    }


package book8.ch5;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlTest {
    public static void main(String[] args) {
        Document document = getDocument("C:\\Users\\Marco\\Desktop\\BootCamp2\\JAVA\\JavagroupA\\src\\book8\\ch5\\movies.xml");
        System.out.println("DOM created");

        int count = 0;
        Element root = doc.getDocumentElement();
        Node movie = root.getFirstChild();
        while (movie != null)
        {
            count++;
            movie = movie.getNextSibling();
        }
        System.out.println("There are " + count + " movies.");
    }

    private static Document getDocument(String name)
    {
        try
        {
            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder =
                    factory.newDocumentBuilder();
            return (Document) builder.parse(new InputSource(name));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

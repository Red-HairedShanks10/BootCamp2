package book8.ch5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlTest {
    public static void main(String[] args) {


        //create a document from XML file
        Document doc = getDocument("C:\\Users\\Marco\\Desktop\\BootCamp2\\JAVA\\JavagroupA\\src\\book8\\ch5\\movies.xml");
        System.out.println("DOM created");


        /*PROCESSING ELEMENTS*/
        int count = 0;
         Element root = doc.getDocumentElement();
         Node movie = root.getFirstChild();//get first node which is Movie
         //count all movie nodes available
        //while movie node-list has elements in it:
        while (movie != null)
        {
            count++;//increment count value
            movie = movie.getNextSibling();//move to next sibling node of the current node
        }
        //print the number of movies found:
        System.out.println("There are " + count + " movies.");
    }

    //getDocument() reads and XML file into a DOM document
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

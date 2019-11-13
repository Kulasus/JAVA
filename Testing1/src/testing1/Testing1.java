
package testing1;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public class Testing1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Loader l = new Loader();
        l.loadPersonsFromFile("input.txt");
        Writer w = new Writer(l.getPersons());
        w.printToFile("output.txt");
    }
    
}

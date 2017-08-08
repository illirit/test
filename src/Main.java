import org.apache.axiom.*;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFactory;



public class Main {


	public static void main(String[] args){

		OMFactory factory = OMAbstractFactory.getOMFactory();
		OMElement method = factory.createOMElement("getPriceResponse", "23", null);
		OMElement value = factory.createOMElement("price", "24", null);
        value.addChild(factory.createOMText(value, ""));
        method.addChild(value);
		System.out.println(method);
		
    }
}

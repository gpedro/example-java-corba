import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import CalculadoraApp.Calculadora;
import CalculadoraApp.CalculadoraHelper;

public class Server {

	public static void main(String args[]) {

		try {

			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
			POA rootPoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootPoa.the_POAManager().activate();

			CalculadoraHP calcImpl = new CalculadoraHP();

            org.omg.CORBA.Object ref = rootPoa.servant_to_reference(calcImpl);
            Calculadora mRef = CalculadoraHelper.narrow(ref);
 
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			String name = "calculadora";
			NameComponent path[] = ncRef.to_name(name);
			ncRef.rebind(path, mRef);

			orb.run();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

import java.text.SimpleDateFormat;

/**
 * MySQL Final Project
 * CS-HU 310
 * 
 * 
 * @author juanbecerra
 * @author carsonsmith
 *
 */
public class FinalProject {

	 public static void main(String[] args) {
		 
		 switch (args[0]) {
		 	case "/?":
		 		printUsage();
		 	case "CreateItem":
		 		if (args.length == 4) {
		 			String itemCode = args[1];
		 			String itemDescription = args[2];
		 			double price = Double.valueOf(args[3]);
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "CreatePurchase":
		 		if (args.length == 3) {
		 			String itemCode = args[1];
		 			int purchaseQuantity = Integer.valueOf(args[2]);
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "CreateShipment":
		 		if (args.length == 4) {
		 			String itemCode = args[1];
		 			int shipmentQuantity = Integer.valueOf(args[2]);
		 			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		 			//	TODO Not sure how to format date
		 			//String shipmentDate = sdf.format(new Date(args[3]));
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "GetItems":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "GetPurchases":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "GetShipment":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "ItemsAvailable":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "UpdateItem":
		 		if (args.length == 3) {
		 			String itemCode = args[1];
		 			double price = Double.valueOf(args[2]);
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "DeleteItem":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "DeletePurchase":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	case "DeleteShipment":
		 		if (args.length == 2) {
		 			String itemCode = args[1];
		 			
		 			//	TODO mysql shit
		 			
		 		} else {
		 			printUsage();
		 		}
		 	default:
		 		printUsage();
		 }
	 }
	 
	 /**
	  * Prints usage for program
	  */
	 private static void printUsage() {
		 //	TODO insert meaningful usage statement
		 System.err.println();
		 System.exit(1);
	 }
}

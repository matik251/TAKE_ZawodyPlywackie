package pl.kurs;

public class Test {
	public static void main(String[] args) {
		String serverUrl = "http://localhost:8080/take/komis";
//		String serverUrl = "http://localhost:8080/take/menu";
		try{
			String url = serverUrl;
			String message = "<car id=\"0\"><make>Fiat</make><model>Brava</model><regNum>SH12345</regNum><price>1000</price></car>";
//			String message = "{\"make\":\"Opel\",\"model\":\"Astra\",\"regNum\":null,\"price\":null}";
//			String message = "<swimmerId=\"0\"><name>aa</name><surname>bb</surname><gender>m</gender><weight>70</weight><height>190</height><nationality>cc</nationality><team>dd</team>";

			System.out.println("DOPOST "+url );
			String txt = HttpHelper.doPost(url,message,"application/xml");
			System.out.println("-----------------------");
			System.out.println(txt);
			System.out.println("-----------------------");

			
			url = serverUrl;
			System.out.println("DOGET "+url );
			txt = HttpHelper.doGet(url);
			System.out.println("-----------------------");
			System.out.println(txt);
			System.out.println("-----------------------");
		} catch (Exception e) {e.printStackTrace();}
	}
}

package pl.kurs;

public class Test {
	public static void main(String[] args) {
//		String serverUrl = "http://localhost:8080/take/komis";
		String serverUrl = "http://localhost:8080/take/Swimmers";
		try{
			String url = serverUrl;
//			String message = "<car id=\"0\"><make>Fiat</make><model>Brava</model><regNum>SH12345</regNum><price>1000</price></car>";
//			String message = "{\"make\":\"Opel\",\"model\":\"Astra\",\"regNum\":null,\"price\":null}";
			String message = "{\"name\":\"a\",\"surname\":\"b\",\"gender\":\"m\",\"weight\":\"70\",\"height\":\"180\",\"nationality\":\"c\",\"team\":\"d\"}";

			System.out.println("DOPOST "+url );
			String txt = HttpHelper.doPost(url,message,"application/json");
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

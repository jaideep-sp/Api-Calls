import java.io.*;
import java.net.*;

class SimpleGetRequest {
  public static void main(String[] args) throws IOException {
    URL url = new URL("https://restcountries.com/v3.1/all");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    int responseCode = con.getResponseCode();
    BufferedReader in = new BufferedReader(
      new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();
    // Print the response
    System.out.println(response.toString()+" code: "+responseCode);

  }
}

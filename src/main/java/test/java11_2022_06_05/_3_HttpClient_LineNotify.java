package test.java11_2022_06_05;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//JavaNotify權杖：Uuw8Ni6zFmsLcZLMZ0492nzvcELUwO2h5Y33tqG7ICC
public class _3_HttpClient_LineNotify {
	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "https://notify-api.line.me/api/notify";
        String token = "Uuw8Ni6zFmsLcZLMZ0492nzvcELUwO2h5Y33tqG7ICC";
        
        // 建立 request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + token)
                .header("Content-type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString("message=Hello Java11"))
                .build();
        
        // 建立 Response BodyHandler 物件
        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        
        // 建立 HttpClient
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, bodyHandler);
        System.out.println(response.body());
	}
	
}

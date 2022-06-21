package test.java11_2022_06_05;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class _2_HttpClientTest {
	public static void main(String[] args) throws Exception{
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.example.com"))
				.GET().build();
		//建立 Response BodyHandler物件
		HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
		//發送request 與回應response經由HttpClient
		HttpClient client = HttpClient.newHttpClient();
		//同步
		HttpResponse response = client.send(request, bodyHandler);
		//非同步
		CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, bodyHandler);
		future.thenApply(HttpResponse::body)
			.thenAccept(System.out::println)
			.join();//完成後回傳結果資料
	}
	
}

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("http://localhost:3000/test"))
                .POST(HttpRequest.BodyPublishers.noBody())
                .timeout(java.time.Duration.ofSeconds(10))
                .build();
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

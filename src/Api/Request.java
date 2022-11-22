package Api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Request {

	public static void main(String[] args) throws IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?results=2")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String uglyJsonString = response.body();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(uglyJsonString);
		String prettyJsonString = gson.toJson(je);
		System.out.println(prettyJsonString);
		Gson gs = new Gson();
		Data data = gs.fromJson(uglyJsonString, Data.class);
//		Results res = gs.fromJson(uglyJsonString, Results.class);
		System.out.println(data.getResults().get(0).getId());
		System.out.println(data.getResults().get(1).getId());
	}

}

package Api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Request {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);

		HttpClient client = HttpClient.newHttpClient();

		System.out.println("Please Choose An Option ! ");
		System.out.println("1 : Enter How Many Users To generate ! ");
		System.out.println("2 : Choose The Type Of Passowrd To Be generate ! ");
		System.out.println("3 : Show The Seeding ! ");
		System.out.println("4 : Show The Pagination ! ");
		String option = sc.nextLine();
		int choices = Integer.parseInt(option);
		switch (choices) {
		case 1:

			System.out.println("Please Enter How Many Users To generate ! ");
			int numberOfUsers = sc.nextInt();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://randomuser.me/api/?results=" + numberOfUsers)).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			String uglyJsonString = response.body();

			if (uglyJsonString.contains("error")) {
				System.out.println("We have error");
				Gson gs = new Gson();
				ErrorHandler errorHandler = gs.fromJson(response.body(), ErrorHandler.class);
				System.out.println(errorHandler.getError());
			} else {

				Gson gs = new Gson();
				Data data = gs.fromJson(uglyJsonString, Data.class);
//
//				Gson gson = new GsonBuilder().setPrettyPrinting().create();
//				JsonParser jp = new JsonParser();
//				JsonElement je = jp.parse(uglyJsonString);
//				String prettyJsonString = gson.toJson(je);
//				System.out.println(prettyJsonString);
				System.out.println("The User Name Is : " + data.getResults().get(0).getName());
				System.out.println("The User Gender Is : " + data.getResults().get(0).getGender());
				System.out.println("The User Date Of Birth Is : " + data.getResults().get(0).getDob());
				System.out.println("The Number Of Users  Is : " + data.getInfo().getResults());
				System.out.println("The Page Number Is : " + data.getInfo().getPage());
				System.out.println("The Seed Is : " + data.getInfo().getSeed());
				System.out.println("The Version Is : " + data.getInfo().getVersion());

			}

			break;
		case 2:
			System.out.println("Please Choose The Type Of Passowrd To Be generate ! ");
			System.out.println("1 : Special ");
			System.out.println("2 : Upper ");
			System.out.println("3 : Lower ");
			System.out.println("4 : Number ");
			System.out.println("5 : Compination Of All Above ");
			System.out.println("6 : Enter Your Own Compination ");
			String pOption = sc.nextLine();
			int pChoices = Integer.parseInt(pOption);
			switch (pChoices) {
			case 1:
				HttpRequest request1 = HttpRequest.newBuilder()
						.uri(URI.create("https://randomuser.me/api/?password=special,32")).build();
				HttpResponse<String> response1 = client.send(request1, HttpResponse.BodyHandlers.ofString());

				String uglyJsonString1 = response1.body();

				if (uglyJsonString1.contains("error")) {
					System.out.println("We have error");
					Gson gs = new Gson();
					ErrorHandler errorHandler = gs.fromJson(response1.body(), ErrorHandler.class);
					System.out.println(errorHandler.getError());
				} else {
					Gson gs = new Gson();
					Data data = gs.fromJson(uglyJsonString1, Data.class);

					System.out.println("The User Password Is : " + data.getResults().get(0).getLogin().getPassword());

				}
			case 2:
				HttpRequest request2 = HttpRequest.newBuilder()
						.uri(URI.create("https://randomuser.me/api/?password=upper,1-8")).build();
				HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());

				String uglyJsonString2 = response2.body();

				if (uglyJsonString2.contains("error")) {
					System.out.println("We have error");
					Gson gs = new Gson();
					ErrorHandler errorHandler = gs.fromJson(response2.body(), ErrorHandler.class);
					System.out.println(errorHandler.getError());
				} else {
					Gson gs = new Gson();
					Data data = gs.fromJson(uglyJsonString2, Data.class);

					System.out.println("The User Password Is : " + data.getResults().get(0).getLogin().getPassword());

				}
				break;
			case 3:
				HttpRequest request3 = HttpRequest.newBuilder()
						.uri(URI.create("https://randomuser.me/api/?password=lower,6-8")).build();
				HttpResponse<String> response21 = client.send(request3, HttpResponse.BodyHandlers.ofString());

				String uglyJsonString21 = response21.body();

				if (uglyJsonString21.contains("error")) {
					System.out.println("We have error");
					Gson gs = new Gson();
					ErrorHandler errorHandler = gs.fromJson(response21.body(), ErrorHandler.class);
					System.out.println(errorHandler.getError());
				} else {
					Gson gs = new Gson();
					Data data = gs.fromJson(uglyJsonString21, Data.class);

					System.out.println("The User Password Is : " + data.getResults().get(0).getLogin().getPassword());
					break;
				}
			case 4:
				HttpRequest request4 = HttpRequest.newBuilder()
						.uri(URI.create("https://randomuser.me/api/?password=number,1-8")).build();
				HttpResponse<String> response211 = client.send(request4, HttpResponse.BodyHandlers.ofString());

				String uglyJsonString211 = response211.body();

				if (uglyJsonString211.contains("error")) {
					System.out.println("We have error");
					Gson gs = new Gson();
					ErrorHandler errorHandler = gs.fromJson(response211.body(), ErrorHandler.class);
					System.out.println(errorHandler.getError());
				} else {
					Gson gs = new Gson();
					Data data = gs.fromJson(uglyJsonString211, Data.class);

					System.out.println("The User Password Is : " + data.getResults().get(0).getLogin().getPassword());

				}
			case 5:
				HttpRequest request5 = HttpRequest.newBuilder()
						.uri(URI.create("https://randomuser.me/api/?password=special,upper,lower,number")).build();
				HttpResponse<String> response5 = client.send(request5, HttpResponse.BodyHandlers.ofString());

				String uglyJsonString5 = response5.body();

				if (uglyJsonString5.contains("error")) {
					System.out.println("We have error");
					Gson gs = new Gson();
					ErrorHandler errorHandler = gs.fromJson(response5.body(), ErrorHandler.class);
					System.out.println(errorHandler.getError());
				} else {
					Gson gs = new Gson();
					Data data = gs.fromJson(uglyJsonString5, Data.class);

					System.out.println("The User Password Is : " + data.getResults().get(0).getLogin().getPassword());

				}
			case 6:
				System.out.println(" Enter Your Own Compination ");
				String myCompnation = sc.nextLine();
				HttpRequest request6 = HttpRequest.newBuilder()
						.uri(URI.create("https://randomuser.me/api/?password=" + myCompnation)).build();
				HttpResponse<String> response6 = client.send(request6, HttpResponse.BodyHandlers.ofString());

				String uglyJsonString6 = response6.body();

				if (uglyJsonString6.contains("error")) {
					System.out.println("We have error");
					Gson gs = new Gson();
					ErrorHandler errorHandler = gs.fromJson(response6.body(), ErrorHandler.class);
					System.out.println(errorHandler.getError());
				} else {
					Gson gs = new Gson();
					Data data = gs.fromJson(uglyJsonString6, Data.class);

					System.out.println("The User Password Is : " + data.getResults().get(0).getLogin().getPassword());

				}

			}
		case 3:

			HttpRequest request6 = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?seed=foobar"))
					.build();
			HttpResponse<String> response6 = client.send(request6, HttpResponse.BodyHandlers.ofString());

			String uglyJsonString6 = response6.body();

			if (uglyJsonString6.contains("error")) {
				System.out.println("We have error");
				Gson gs = new Gson();
				ErrorHandler errorHandler = gs.fromJson(response6.body(), ErrorHandler.class);
				System.out.println(errorHandler.getError());
			} else {
				Gson gs = new Gson();
				Data data = gs.fromJson(uglyJsonString6, Data.class);

				System.out.println("The Seeding Is : " + data.getInfo().getSeed());

			}
		case 4:
			HttpRequest request3 = HttpRequest.newBuilder()
					.uri(URI.create("https://randomuser.me/api/?page=3&results=10&seed=abc")).build();
			HttpResponse<String> response3 = client.send(request3, HttpResponse.BodyHandlers.ofString());

			String uglyJsonString3 = response3.body();

			if (uglyJsonString3.contains("error")) {
				System.out.println("We have error");
				Gson gs = new Gson();
				ErrorHandler errorHandler = gs.fromJson(response3.body(), ErrorHandler.class);
				System.out.println(errorHandler.getError());
			} else {
				Gson gs = new Gson();
				Data data = gs.fromJson(uglyJsonString3, Data.class);

				System.out.println("The Pagination Is : " + data.getInfo().getPage());

			}

		}
	}
}
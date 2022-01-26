// Always the first line
package com.revature.hello_web;

// Next Comes imports

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.IOException;
import java.util.concurrent.Executors;

public class HelloWeb {

	public static void main(String[] args){

		try {
			// Assigning to localhost:3000/
			HttpServer webServer = HttpServer.create(new InetSocketAddress(3000), 0);
			webServer.setExecutor(Executors.newFixedThreadPool(5));
			
			// definining the URL to call this application.
			webServer.createContext("/hello", httpExchange -> {
				String payload = "Hello, web";
				httpExchange.sendResponseHeaders(200, payload.length());
				httpExchange.getResponseBody().write(payload.getBytes());
			});
			webServer.start();
			System.out.println("Our web app has started");
		} catch (IOException e){
			e.printStackTrace();
		}
//
	}

}

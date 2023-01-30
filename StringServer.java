import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String sentence = " ";

    public String handleRequest(URI url) {
        if(url.getPath().equals("/")) {
          return String.format("String: %s",sentence);
        }
        else{
          System.out.println("Path: " + url.getPath());
          if(url.getPath().contains("/add-message")) {
              String[] parameters = url.getQuery().split("=");
              if (parameters[0].equals("s") {
                  sentence += "\n" + parameters[1];
                  return String.format(sentence);
              }
          }
        return "404 Not Found!";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

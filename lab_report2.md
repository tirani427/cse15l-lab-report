# Lab Report 2
---
## Web Server - String Server
---
### StringServer.java Code:
```
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
              if (parameters[0].equals("s")) {
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
```
### Screenshots of ```/add-message``` being used:
---
#### Before ```/add-message```:
![Image](https://user-images.githubusercontent.com/111078165/215376037-c0788431-96df-40ed-b648-9cdbfd1c5a35.png)

Without using /add-message, the methods called by my code are the handleRequest() method, which basically determines the path being entered into the url. The relevant argument to this method is the url being used, which in this case is ```http://localhost:4001```. The java command line argument method in main for the StringServer class is also called, but since the port was valid, the server continued to run as it was supposed to.

This is then passed through the method, determining if the url has a path - which in this case it does not. Because it doesn't have a path, it simply returns ```String:```. And because it doesn't have a path, none of the values within the method change since none of the qualifying actions that need to occur in order for the variables to change were tripped.

---

#### After ```/add-message?s=Hello, nice to meet you``` : 
![Image](https://user-images.githubusercontent.com/111078165/215376380-2f607c14-6890-4005-8fa8-da11647d100b.png)

Now, after using the ```/add-message?s=Hello, nice to meet you``` path in the url, the method called by my code are handleRequest(). The relevant argument for the method is still the url, but this time it's:
```http://localhost:4001/add-message?s=Hello, nice to meet you```

Now, since there was a path that didn't just equal ```/```, the else statement for the method was tripped.
It then looked for if the path contained ```/add-message```. 
Since it did, a String array ```String[] parameters``` was initialized to have the values of the query after "/add-message". 
This query was split at "=", thus meaning that ```parameters[0] = "s"``` and ```parameters[1] = "Hello, nice to meet you"```. 

And since ```parameters[0] = "s"```, then the value for ```String sentence``` is changed to ```sentence += "\n" + parameters[1]```, thus changing the instance variable for the class. 

---

#### After ```/add-message?s=I like watching movies, especially Top Gun``` : 
![Image](https://user-images.githubusercontent.com/111078165/215376575-d2a1b89a-1da5-4315-8d19-376e6dd53859.png)





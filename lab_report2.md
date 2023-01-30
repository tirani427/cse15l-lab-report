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

Here, the screen is presenting:

```Hello, nice to meet you```

since the last command that was passed was ```/add-message?s=Hello, nice to meet you```.

When this method is called, the argument passed into the handleRequest() method is ```http://localhost:4001/add-message?s=I like watching movies, especially Top Gun```.

And once again, since the argument's path isn't just ```/```, the else statement for the method is tripped again. 
The same steps from before are passed again, with ```String[] parameters = url.getQuery().split("=");``` since the ```url.getPath()``` contained ```/add-message```. And once again, ```parameters[0] = "s"``` and ```parameters[1] = "I like watching movies, especially Top Gun"```.
And like before, the method checked to see if ```parameters[0] = "s"```, and since it did, the ```sentence``` instance variable is set to ```sentence += "\n" + parameters[1]``` thus once again changing the instance variable to the new string.

---

## Buggy Code - Lab 3
---
### Fail-Inducing Test:
---
```
@Test
public void testReverseInPlace(){
    int[] input = {5,6,7,8,9};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {9,8,7,6,5}, input);
}
```

### Non-Fail-Inducing Test:
---
```
@Test
public void testReverseInPlaceTwo(){
    int[] input = {3,2,3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {3,2,3}, input);
}
```

### Symptom + ScreenShots
---
The symptom that runs with this code is that the code switches the first and last indexes up until the middle index. So if the array is {0,1,2,3,4}, then the method reverseInPlace() would return {4,3,2,3,4} instead of {4,3,2,1,0}. 

The first test case would return {9,8,7,8,9}, thus throwing an error since it doesn't equal the array it was supposed to.

![Image](https://user-images.githubusercontent.com/111078165/215386109-3b804d83-84f4-440c-981e-2a1c5b4454c8.png)


The second test case would return {3,2,3}, which is coincidentally the same as the output it should return, thus meaning that it wouldn't throw an error.

![Image](https://user-images.githubusercontent.com/111078165/215386232-3d465ca4-b040-4757-85c4-3e22c3648e5a.png)

### The Bug + The Fix
---
#### Bug:
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
The bug in this program is that it doesn't preserve the values of the indexes that were changed. In the ``` for loop ```, the code changes the index 0 to the last index value, but because it doesn't store the 0 index anywhere, that value is deleted. Then the program continues on, and once it gets to index 0, the last index is going to be set to what index 0 is at that moment, which is the last index's value.

#### Solution:
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int variableSwitch = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = variableSwitch;
    }
  }
```
The solution is pretty simple. Basically what first needs to happen is that the number of iterations that the loop goes over needs to be halved so that it doesn't end up switching the values back once the fix is made. The next thing that needs to happen is that a variable needs to be added to preserve the value of the index that is going to be changed. Then the second index's value will be set to the value of the first.

Using the example input {5,6,7,8,9}, the process would be:

**Index 0**
```
int variableSwitch = 5;
arr[0] = 5;
->{9,8,7,6,9}
arr[arr.length - i - 1] = variableSwitch;
-> {9,6,7,8,5}
```
And so on until the loop stops running at Index 3.

---
### Something I Learned
---
Something that learned from lab 2 or 3 that I didn't know before was how to set up a web server. It was really interesting to learn how the url's work and how I could code something to actually look at the path being used and then modify itself and its response based off of that. We'd learned about it in class, but actually doing it was an amazing experience and I had a lot of fun with the implementation of it. Definitely a worthwhile experience and I'm excited to see how else we'll implement it in the future.

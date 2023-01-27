# Lab Report 1

So basically you're in CSE 15L and don't really understand what you have to do to set up your workspace. I'm here to help with that.
Here I'll be going over a few steps you have to take to:
1. Get your ssh login on ieng6.
2. Installing VSCode on your device, Windows and Mac.
3. Remotely connecting to your ieng6 account
and finally,
4. Trying some commands on the terminal.

## Getting your ssh login on ieng6.
---
Getting your ssh login is actually pretty simple. 
The first thing you should do is go to this url: [https://sdacs.ucsd.edu/~icc/index.php](https://sdacs.ucsd.edu/~icc/index.php)
This url will take you to the Educational Technology Services page and your screen should look something like this:
![Image](https://user-images.githubusercontent.com/111078165/212213202-4107a363-a049-403a-a0ab-8d3237be05b3.png)
Once you get here, put in your username and student ID number into the appropriate fields. For example, if you're a continuing student then use the first set and if you're a new student then use the second set.
Now your screen should display your account for CSE 15L. To be sure, note that your account should begin with cs15lwi23 and then be followed by characters unique to your account.

Once you find that, in order to save some time you should reset your password for this account. It should be shown at the top of the screen, under your id. When you click on the link, you'll be sent to a website called Global Password Change.
If you weren't able to find the link on your account, the url to it is here: [https://sdacs.ucsd.edu/~icc/password.php](https://sdacs.ucsd.edu/~icc/password.php)

The time for your password to change will be about 15 minutes, which is more than enough time to complete the following steps.

## Step 2: Downloading VS Code, or Visual Studios Code.
---
I didn't have to complete this step because VSCode was already installed on my computer from a previous class, but if you don't have it, then read the following steps. 

To do this, go to the following url: [https://code.visualstudio.com/](https://code.visualstudio.com/)
Make sure that you follow the correct instructions to download VS Code onto your computer because it differs from Windows to Mac. Once you finish downloading VSCode you should be able to open a window like:

![Image](https://user-images.githubusercontent.com/111078165/212214129-dcfed4e0-05e3-4289-94b3-6fd5ba2bfb3a.png)

Now the process differs from Macbook users to Windows users. If you have a Macbook then feel free to skip to the next step. 

For Windows users, in order for you to connect to the remote server, you first need to install git for windows. The url to do so is: [https://gitforwindows.org/](https://gitforwindows.org/)

Once git is successfully installed, you will need to begin using git bash in VS Code. The instructions on how to do so are in the following url: [https://stackoverflow.com/a/50527994](https://stackoverflow.com/a/50527994)
Once everything is downloaded properly, you can move onto the next step, which is gaining remote access.

Now Step 3 is fairly simple. 

If you closed VS Code (which I hope you didn't) then reopen it and open an integrated terminal. To do this, you should open a file from your computer and then once that file is open, right-click on that area.
![Image](<img width="1431" alt="Screen Shot 2023-01-12 at 5 20 13 PM" src="https://user-images.githubusercontent.com/111078165/212215225-6dfc1d98-f302-472b-920f-8453afff1caa.png">)

Now scroll down and click on the option that says "Open Integrated Terminal." Once you do that, you should get a screen that opened and looks something like:
<img width="1213" alt="Screen Shot 2023-01-12 at 5 22 12 PM" src="https://user-images.githubusercontent.com/111078165/212215361-bc27ac30-4aa1-4085-b423-6f11eb2df203.png">

Now, click on the terminal and type in the following command, inserting your own id in place of the cs15lwi23__ that I put in: ssh cs15lwi23__@ieng6.ucsd.edu.
Click enter and when you're prompted to, type yes into your command line. It will then prompt you for a password. Enter the password you created for your account before.
If the terminal continues to prompt you to enter in the password, then that probably means that not enough time has gone by for your password to have changed in the system. 
In my case, it took about five minutes to get the password to work, and that was after I'd also realized that my password wasn't accepted in the first place. Either way, just wait a few minutes and try again.
Once your password gets accepted, your screen should look something like this:
![Image](<img width="695" alt="Screen Shot 2023-01-12 at 4 35 44 PM" src="https://user-images.githubusercontent.com/111078165/212215778-dd12ab06-d405-4c86-921d-cd5f70efb107.png">)

Now that you've reached this part, congratulations! You have remote access to your server, and now comes the final part of trying some commands.
Here's a list of a few commands that you can use:
'''
pwd - to see your current working directory.
ls - to see what files are in your current directory.
cd - to change your current working directory to another one present in the file.
cd .. - to move back out of a file and into the previous directory.
'''

I used the commands ls and cd to see the files in my server and then change my directory to that file within the server. When I typed in the ls command after logging in, I saw that there was a file named perl5.

<img width="503" alt="Screen Shot 2023-01-12 at 5 31 23 PM" src="https://user-images.githubusercontent.com/111078165/212216448-9601961e-533c-43e6-87ec-b5229f4c7507.png">

Then using the cd command, the command line prompt changes to include the file name, thus meaning that my directory had been changed to that file.

<img width="513" alt="Screen Shot 2023-01-12 at 5 32 23 PM" src="https://user-images.githubusercontent.com/111078165/212216541-74b6d089-6d61-4d32-8312-331cbc7c0326.png">

You can also use a few more commands, such as:
``` cat /home/linux/ieng6/cs15lwi23/public/hello.txt ```
That command actually runs something on your computer so give it a try! This is pretty much how to set up VSCode, Access the Remote Server, and use the commands!


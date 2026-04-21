# ChatApplication
# TCP Chat Application (Java)

## Overview
This is a simple TCP-based chat application using Java sockets and multithreading. It allows multiple clients to connect to a server and chat in real time.

## Files Required
Make sure all these files are in the SAME folder:

- ChatServer.java
- ClientHandler.java
- ChatClient.java

## Requirements
- Java JDK installed (version 8+ recommended)
- Command Prompt (CMD) or Terminal access

## Step 1: Open Command Prompt in Project Folder

Navigate to where your files are stored

## Step 2: Compile the Code

Compile all Java files:

If successful, this will generate `.class` files.

## Step 3: Start the Server

Run the server first:
java ChatServer.java


Expected output: Chat server started on port 5000

Keep this window OPEN.

---

## Step 4: Start Clients

Open a NEW Command Prompt window for each user.

Navigate to where your files are stored again

Run client:
java ChatClient.java

Repeat this step for multiple clients.


## Step 5: Join the Chat

Each client will be prompted:
"Enter your name"
Type in a name and press enter.

## Step 6: Start Chatting

- Type messages in any client window
- Press Enter to send
- Messages will appear in all other clients instantly

## Step 7: Exit Chat

To leave:
- Close the client window OR
- Press `CTRL + C`

Other users will see a leave message.

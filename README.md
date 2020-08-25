# HuaweiCalculatorTest
Huawei Calculator Test 

# 1- Describe what the four major components of Android are and what their respective roles are.

# Activities

An activity is the process where the user start the interaction with a user interface. Also an app caan have more than one activity and all the activities work together to havee a composition of a complete app, each one is independent of the others. An activity facilitates the following key interactions between system and app:
Keeping track of what the user currently cares about (what is on screen) to ensure that the system keeps running the process that is hosting the activity.
Knowing that previously used processes contain things the user may return to (stopped activities), and thus more highly prioritize keeping those processes around.
Helping the app handle having its process killed so the user can return to activities with their previous state restored.
Providing a way for apps to implement user flows between each other, and for the system to coordinate these flows. (The most classic example here being share.)


# Services

A service it's a component or process which runs in the background to perform long-running operations. A service doesn't have an interface, and also seervices can keep running in background attached to any task until it is completed like take a picture, or play a song, etc. Since a service is a process, services can be killed or restarted.

# Broadcast receivers

A broadcast receiver is a component that enables the system to deliver events to the app outside of a regular user flow, allowing the app to respond to system-wide broadcast announcements.The system can deliver broadcasts even to apps that aren't currently running. 

An example of the broadcast could be the battery warning or low battery or when a picture is captured. 

Apps can initiate broadcast for example an app can initiate the camera to take a photo. 

# Content providers

Content provider is a global persistgent data storage location where the app can have access and not only get access and read, it can alsoo modify the information inside

For example, the Android system provides a content provider that manages the user's contact information. As such, any app with the proper permissions can query the content provider, such as ContactsContract.Data, to read and write information about a particular person. 

A content provider is more like a data source point into an app for publishing named data items, identified by a URI scheme.



# 2- Write a piece of code to implement an Activity page that supports the following features

![alt text](http://pinguspace.com/huaweitest1.png)

The code is already created and you only need to clone and play, here is attached a couple of screenshots 

![alt text](http://pinguspace.com/calculator.png)

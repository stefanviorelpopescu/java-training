package clean.code.design_patterns.requirements.command;

/*
################################################################## Definition ###############################################################################################
Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.

################################################################## Problem ##################################################################################################
For example, a text editor app has a toolbar with a bunch of buttons. While all of this look very similar, they have very different functionality, so where to put the code for the various click-handlers of the buttons?
You can create a different class for each button, but this is not a good solution.

################################################################## Solution #################################################################################################
The solution is to create a layer for the graphical user interface and another layer for the business logic.
So a GUI object calls a method of a business logic object, passing it some arguments. This process is usually described as one object sending another a request.
The Command pattern suggests that GUI objects shouldn’t send these requests directly. Instead, you should extract all of the request details, such as the object being called,
the name of the method and the list of arguments into a separate command class with a single method that triggers this request.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}

Series 40 UI Component Demos
============================

This Java ME application is a MIDlet suite consisting of demos that show how to
use LCDUI components in Series 40 applications. The examples have been
carefully built to accommodate to the device in use and they work in full touch, 
touch and type, and non-touch devices. The various examples are implemented as
independent MIDlets.

The application allows designers to get an impression of how the components 
actually look like on different devices, and developers can see how the UI 
components are used in an application by examining the source code.
The example also provides valuable information on how to develop a 
single application binary that can run on full touch, touch and type, and 
non-touch devices.

Version 2.1 adds various different CustomItem form component examples, a
Keypad example, and a Menus example.
 
The MIDlet suite contains examples of the following components:

* Lists, demonstrating various List types. In some lists custom implementation 
  is used to provide improved support for softkeys and Action button 1.
* Text, demonstrating TextField.
* Dialogs, demonstrating different kinds of Alerts.
* Canvas, demonstrating different ways of presenting the Canvas.
* Form, demonstrating different Form items, including CustomItem components.
* Categories, demonstrating the CategoryBar with different amounts of 
  categories. In touch and type and non-touch devices, an additional view 
  has been implemented to show categories instead of the category bar.
* Ticker, demonstrating the Ticker item in Displayables.
* Confirmation, demonstrating the confirmation process.
* Empty content, demonstrating the ways to handle situations when a view 
  does not have any real content yet.
* Multiple items, demonstrating multiselection for positive selection or for
  deletion of items.
* Zoom, demonstrating different ways of zooming images.
* Add new, demonstrating how to generate and display new Form Items on the 
  fly.
* Interdependent, demonstrating how a Form can dynamically adjust itself 
  based on user input.
* Keypads, demonstrating different keypad layouts available for different text
  input needs.
* Menus, demonstrating how to use context menus and action #2 menu items.

This example application demonstrates:
* Different UI components and patterns that can be used in Series 40 devices.
* How to accommodate different input methods in an application.

The application is hosted in Nokia Developer Projects:
* https://github.com/nokia-developer/s40-ui-component-demos

1. Prerequisites
-------------------------------------------------------------------------------
Java ME basics

2. Design considerations
-------------------------------------------------------------------------------
This example application was created to demonstrate the UI components and
does not have any actual engine implementation.

3. Known issues
------------------------------------------------------------------------------
None.

4. Build and installation instructions
-------------------------------------------------------------------------------
The example has been created with NetBeans 7.1.1, Nokia SDK for Java 2.0,
Nokia SDK for Java 1.1, and Series 40 6th Edition SDK.
The project can be easily opened in NetBeans by selecting **Open Project** from
the File menu and selecting the application. Building is done by selecting
**Build Project** from the Run menu.

Before opening the project, make sure the Nokia SDK for Java 2.0 and/or Nokia
SDK for Java 1.1 and/or Series 40 6th Edition SDK is installed and added to
NetBeans. Building is done by selecting **Build main project**.

To install the application on a mobile device, transfer the JAR file via Nokia
Suite or Bluetooth.

To build the example with the Eclipse-based Nokia IDE, choose **Import...** from
the File menu, choose **Existing Projects into Workspace**, then select the Series
40 UI Components Demo as the root directory and click **Finish**. Then run the
example in the emulator by selecting **Run As -> 1 Emulated Java ME JAD** from
the Run menu.

5. Running the example
-------------------------------------------------------------------------------
When you start the example, the MIDlet Suite menu provided by the platform
opens. Select the demo you want to see.

6. Compatibility
-------------------------------------------------------------------------------
Most Series 40 full touch, touch and type, and non-touch devices.

Developed with:
* NetBeans 7
* Nokia SDK 2.0 for Java
* Nokia SDK 1.1 for Java
* Series 40 6th Edition SDK
 
Tested on: 
* Nokia Asha 305
* Nokia Asha 311
* Nokia X3-02
* Nokia X2-00
* Nokia C1-01
* Nokia C3-00
* Nokia 6212 Classic

7. Version history
-------------------------------------------------------------------------------
* 2.1 Additional CustomItem demos; Keypads and Menus examples.
* 2.0 Additional and improved List demos; touch and type and nontouch support
    added.
* 1.0 Initial release.
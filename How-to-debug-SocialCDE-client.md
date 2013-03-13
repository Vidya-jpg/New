There are two types of test that a developer must perform when extending SocialCDEforEclipse:
* Unit test. A unit test is a piece of code written by a developer that executes a specific functionality in the code which is tested.
* Plug-in test. This is a test that has been specifically created to test an Eclipse plug-in. It provides a new workbench where the plug-in can be run. In this context, this type of test is used to test plug-in’s GUI.
Note that each type of test have a dedicated source folder, so you are invited to add  each new test case to the appropriate source folder.

If you want to create a unit test but you don’t know how, please read this wiki first: <br/>
http://code.google.com/p/econference4/wiki/HowToWriteJunitTestCases <br/>
If you want to create a plug-in test there are 2 dependences that you have to add to plug-in manifest:<br/>
1. org.junit4 <br/>
2. org.eclipse.ui.ide. 

To do so, right click on project -> PDE Tools -> Open Manifest. Now you could find dependences tab, then add the dependences that are circled in red in the following image:
<br/>
![Test dependencies](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/Debug_setting.png?raw=true)
<p align="center" >Figure 1: Test dependencies</p>

Note that, at the end of tests, you must remove that dependences from the same tab. If you do not this step, the plug-in could not be recognized from Aptana IDE. 
One important tool for the tests is the xml file called _testData.xml_, a file that contains the information needed to test the authentication procedures. As such, this file must be updated whenever new services are added to the proxy server.

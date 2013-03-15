Before starting note that if you want to update SocialTFS Proxy Server without losing stored data you must follow the guide [How to update SocialTFS Proxy Server](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-update-SocialTFS-Proxy-Server).
To install the SocialTFS Proxy Server, download the last version of SocialTFS from http://socialtfs.codeplex.com/releases and unzip the package.
The Proxy Server is in the file SocialTFSProxyServer.zip.

First of all you must run SQL Server Management Studio (if you don't have it already installed on your system, check this [guide](http://www.sqlserverclub.com/essentialguides/how-to-install-sql-server-2008-step-by-step-guide.aspx) or this [one](http://blog.sqlauthority.com/2008/06/12/sql-server-2008-step-by-step-installation-guide-with-images/)), login via Windows Authentication with an administrator account and open the Server Properties from the context menu of the connection in the Object Explorer pane on the left.

![SQL Server Management Studio Home](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389580)

Then you need to open the Security page from the left menu and switch from "Windows Authentication mode" to "SQL Server and Windows Authentication mode" in the Server authentication section.

![SQL Server - Server Properties](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389581)

Now you must restart the server from the context menu of the connection in the object explorer pane on the left and then you can close the SQL Server Management Studio.

![SQL Server - Restart](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389582)

Now it's time to configure the IIS 7.* web server.
Now you need to run IIS Manager. If you don't find IIS Manager application, then IIS is not installed. To install it, click Start, and then click Control Panel. In Control Panel, click Programs, and then click Turn Windows features on or off.

![Windows control panel - Add features](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=463175)

In the Windows Features dialog box, click Internet Information Services to install the default features, and then select the following additional features:
* ASP.NET
* .NET Extensibility
* Request Filtering
* ISAPI
* ISAPI Extensions
* Server Side Includes

In case of further doubts, this is a screenshot of one our IIS setup for a typical SocialTFS installation.

![IIS Features for SocialTFS installation](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=467359)

Click OK to close the Windows Features dialog box. To verify that IIS installed successfully, type the following into a Web browser: http://localhost and you should see the default IIS Welcome page.
For more information about setting up IIS adn ASP.NET application, refert to this [guide](http://technet.microsoft.com/en-us/library/cc731252%28v=WS.10%29.aspx).

Now that IIS is installed, try to run IIS Manager again, then select the sites folder on the left and add a new web site from the menu on the right.

![IIS - Add Web Site](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389583)

Choose site name (SocialTFS), physical location and let the IIS Manager creates a new application pool (SocialTFS). If you want, change the other settings as you wish.

![IIS - Add Web Site Options](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389584)

Now select the application pools folder on the left, select the application pool you just created (SocialTFS) from the central view; double-click on it and check or change the option Managed Pipeline mode from Integrated to Classic.
Then, and open the advanced settings from the menu on the right.

![IIS - Link to Advanced Settings of Application Pools](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389585)

In the advanced settings window select the version 4.0 for the. NET Framework, LocalSystem for Identity and confirm.

![Advanced Setting Window](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=473044)

Now select the site you just created (SocialTFS) from the sites folder on the left and start the application import procedure from the menu on the right. If you don't see any Import entry in the menu, then you need to install the Web Deploy package from [here](http://www.iis.net/download/DeployAndMigrate).

![IIS - Import Application Link](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389587)

On the first page of the wizard enter the path to the file SocialTfsProxyServer.zip just unzipped and go to the next page.

![IIS - Import Application Wizard - Page 1](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389588)

The second page of the wizard shows the contents of the package. Make sure that everything is selected except UpdateScript.sql and go to the next page.

![IIS - Import Application Wizard - Page 2](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=638517)

On the third page of the wizard enter the path to the application (it is preferable to leave it blank). Please, do not change the database connection strings: the first will be used to create a database (SocialTFS) and a SQL Server user (SocialTFS) owner of that database; the second will be used by the Proxy Server to connect to the database. We strongly recommend to change the database connection password by following the guide [How to change connection password after SocialTFS Proxy Server installation](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-change-connection-password-after-SocialTFS-Proxy-Server-installation).

![Import Application Wizard - Page 3](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389590)

The fourth page of the wizard shows the results of the application import procedure.

![Import Application Wizard - Page 4](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389591)

Now select the folder AdminPanel from the site you just created (SocialTFS) on the left and double click on the Directory Browsing item from the central view.

![Admin Panel - Directory Browsing](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389592)

Finally enable directory browsing from the menu on the right. This allows access from any browser to the admin panel.

![Admin Panel - Directory Browsing - Enable](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=389593)

The installation is complete.
Now you can access the admin panel at http://<socialtfs_proxyserver_host_address>/adminpanel. You can login by setting to admin both username and password. It's suggested to change this credentials as soon as possible.

If browsing the web site gives you a HTTP Error 404.17, then you have to enable .Net Framework4.0 on your IIS server. If you have installed .Net Framework4.0 on your IIS server, please run "aspnet_regiis -i" in C:\Windows\Microsoft.NET\Framework\v4.0.{your version}.

If browsing the web site gives you a HTTP Error 404.2 – Not Found, then you have to go to IIS Manager and properly set the ISAPI and CGI Restrictions for .NET 4.0 applications. To do this, follow these steps:

* Click Start, type Inetmgr in the Start Search box, and then click Inetmgr in the Programs list. 

If you are prompted for an administrator password or for confirmation, type the password, or click Continue.

* Select the server name in the Connections tree view.
* In Features view, double-click ISAPI and CGI Restrictions.
* Right-click the restriction that restricts the requested ISAPI resource or the requested CGI resource, and then click Allow (.NET 4 application in our case). 


**Note**: If you want to uninstall the proxy server you need to delete the site, the application pool and the database. The first two operations are performed via the IIS Manager, while the third should be done using a tool such as SQL Server Management Studio.

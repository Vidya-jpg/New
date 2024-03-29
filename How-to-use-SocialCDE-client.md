## Setting things up
When you open “SocialCDEforEclipse View”, the plug-in checks if you are a new user or not. If you are a new user, the plug-in will shows you the registration panel (see Figure 1), otherwise it will shows you the login panel (see Figure 2). Note that the view can be drag to all position of the active page, but it is recommended to put the view on the right-hand side of the editor. 

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/RegistrationPage.png?raw=true" alt="Registration Panel"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 1:Registration panel</p>

On registration panel, you can create a new account on a proxy server host. This step can be completed only if you have received from the proxy server admin an email containing:
* The proxy server URL
* The invitation code, automatically generated by the proxy server for all new users.
* The email address associated to the invitation code.


Enter all the aforementioned info in the proper fields; please, note that when you enter the server proxy URL, things may slow down a little bit, as the plugin will start checking whether the server is online and the picked username is available or not.
If registration succeeds, the plug-in will show the Login page, with all the fields already set, except for the password.

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/LoginPage.png?raw=true" alt="Login Panel"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 2:Login panel</p>

On Login panel you can see two checkboxes:
* Save password
* Auto login

If you check first checkbox, the plug-in store your password, while, if you check the second checkbox, the plug-in load automatically the home page when the user run the IDE. Note that if you check the “auto login” checkbox, the plug-in will also check automatically “save password.”
The Home panel and all other panels (except Login and Registration) are divided in two section:
* Static section
* Dynamic section

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/HomePage_section.png?raw=true" alt="Home Panel section"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 3:Home Panel section</p>

Each image in the static section is a link to switch the other panels, plus the logout. 

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/Static_section.png?raw=true" alt="The static section of dynamic panel"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 4:The static section of dynamic panel</p>

Furthermore, the home panel shows all the services available on the proxy server and their status (activated or not).  Through this panel, an authenticated user, can do the following actions:
* Subscribe to a service 
* Unsubscribe to a service
* See the features allowed to a service .
* ~~See owner skills (by clicking on the![skills](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/skills.png?raw=true)image)~~ **Currently not available**
* Change the password (by clicking on the![settings](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/settings.png?raw=true)image)

In order to subscribe to any service (currently, GitHub, Twitter and Facebook), click on the service tile. A browser view will shop up (you might need to arrange it in the central position to make it larger) and provide your credentials and allow (via OAuth protocol) SocialCDE to have access. Please, note that **your credentials won't be stored either locally by the plugin or remotely by the server**. 

![Facebook connect](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/facebook%20connect.png)
<p align="center" style="font-size:small;font-weight:bold;">Figure 5a: Connecting the Facebook service</p>

After successful authentication, click OK in the popup window. A new popup will open, as confirmation of the successful association. Please, use this popup to choose what feature to activate it, according to your **privacy needs** (note that the features to select depend of the structure of the service.  For example, Figure 5b shows the features available for Facebook. Although you are allowed to disable some features, you are strongly encouraged to leave enabled the access to the avatar (i.e., profile image), and the list of people connected to you (i.e., followings and followers), otherwise SocialCDE won't be able to work at its best. Finally, please note that using the same view, you can also choose to unsubscribe the service selected. 
Successfully activated services will now show as 'Status: registered' in green.

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/ServiceSettingPage.png?raw=true" alt="Setting panel of Facebook service"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 5b: Settings panel of Facebook service</p>

## Getting your feet wet with SocialCDE
First things first, let's pick the avatar associated with our SocialCDE account. You can pick any image from the services you have enabled. To do so, click on the Profile button in the upper navigation pane (leftmost icon ![avatar](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/defatult%20avatar.png)). A popup will open to let you choose your preferred image. Select one and the click the back arrow (<-) to go back.

From the static section you can select the People panel ![people](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/people%20page.png), which shows the following sections:
* **Suggestions.** A list of other registered users, suggested according to several criteria (e.g., friend on Facebook, modified same file, commented an issue reported by another user).
* **Followings.** The list of users who you chose to follow.
* **Followers.** The list of users who have decided to follow you.
* **Hidden.** The list of users that you don’t want to see either suggested  or shown in the timelines.

To avoid cold start problems, SocialCDE incorporates a recommender system that suggests whom to follow (see Figure 6). To compute the suggestions, the recommender builds a weighted multigraph, whose nodes represent people and links represent connections between them. A link is drawn from current user A to another user B each time one of the following conditions applies:

    B is in the same project team 
    A is following B in a social network
    B is a follower of A in a social network 

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/PeoplePage.png?raw=true" alt="People panel"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 6:People panel</p>

By clicking on an user, you can see the User Timeline, a panel where all the posts from the selected user are displayed. On this panel, you can choose to follow ![follow](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/follow.png), unfollow ![unfollow](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/unfollow.png), and even hide ![hide](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/hide.png) the selected user. ~~Besides, you can see also the user’s skills (currently, only the users-reported skills on LinkedIn are retrieved).~~

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/UserTimelinePage.png?raw=true" alt="User Timeline panel"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 7:User Timeline panel</p>

When a user accepts a suggestion to follow someone, this one becomes a _static _following, that is,  (s)he will always be in the user’s awareness network and his/her updates will appear in chronological order in the so-called Home Timeline.

From the navigation pane the user can select to browse the Home Timeline clicking on this button ![home timeline](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/home%20timeline.png), which will show all of your posts and the posts from the users that you are following. This panel also allows you to share a new post with your followers. This post will stay on the SocialCDE server and won't be cross-posted on Twitter, Facebook or any other service you may have associated.

<p align="center"><img src="https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/posting.png" alt="Posting"/></p>
<p align="center" style="font-size:small;font-weight:bold;">Figure 8:Posting message in Home Timeline</p>

Other than visualizing the stream of static followings in the Home Timeline, we also designed a _dynamic_ type of followings and two other timelines. Unlike static followings, dynamic followings do not require any explicit follow action, as they are automatically added to and removed from a user’s awareness network, depending on two different conditions detailed below.

The first condition relates to changes occurring to task assignments (i.e., open issues in GitHub). Therefore, if for example Fabio reported or even commented on a issue assigned to Nicola, the latter will be able to see Fabio’s posts when selecting the Iteration Timeline, activated when you click on this button ![iteration timeline](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/iteration%20timeline.png). The only considered work items are those still **open**. Therefore, work items that have been already closed are not considered when updating the Iteration Timeline.

The second condition relates to actions performed by a developer within the Eclipse IDE. In fact, the Interactive Timeline, visible when clicking on ![interactive timeline](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/interactive%20timeline.png), displays posts from dynamic followings as “inferred” from the artifact shown in the focused tab of the main editor of the IDE. Artifacts can be _either **work items** or **source files**_. Therefore, if for example Peppe is editing a file that has been committed by Filippo, the latter will appear as a dynamic following when Peppe selects the interactive timeline. Or, if Peppe open an issue through that Filippo assigned to him and Fabio commented on, both Filippo and Fabio's post will be shown in the Interactive Timeline, even if Peppe is not following them.
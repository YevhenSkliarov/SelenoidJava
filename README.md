# Selenoid + Java
SelenoidJava
Clone project 

open project and install dependencies

<b>Download and install Docker https://docs.docker.com/docker-for-windows/install/</b>
<b> Download and install Selenoid Configuration Manager https://aerokube.com/cm/latest/</b>

perform './cm selenoid start --vnc' command in powershell(Selenoid install all dependencies and browsers images

perform './cm selenoid-ui start' command in powershell to start selenoid-ui

open http://127.0.0.1:4444/status in browser (you will see something like this {"total":5,"used":0,"queued":0,"pending":0,"browsers":{"chrome":{"84.0":{},"85.0":{}},"firefox":{"79.0":{},"80.0":{}},"opera":{"69.0":{},"70.0":{}}}})

to check log perform command 'docker logs selenoid'

to check selenoid status perform 'docker ps' command ( there must be at least selenoid and selenoid-ui with statuses UP)

to open Selenoid-ui just set http://127.0.0.1:8080/ in your browser , if everything ok you can see connected statuses

to get capabilities for your tests go to capabilities tab, select your language and browser version and than paste to your WebDriver factory

to check selenoid version just set http://127.0.0.1:4444/wd/hub/ in your browser

Open Grandle panel in Idea => Tasks => build => run clean task

Open Grandle panel in Idea => Tasks => verification => run test task

To check supported browser versions just open browser.json in aerokube folder
To add new browser:
Update browser.json file andPull browser Docker image:

for example $ docker pull selenoid/vnc:firefox_57.0. than restart selenoid docker kill -s HUP selenoid

To get last 5 versions of browser execute ./cm selenoid update --last-versions 5

*<b>4444 port must be free. To check status of the part perform netstat -a command in cmd<b>
  https://www.automatetheplanet.com/execute-webdriver-tests-docker-selenoid/

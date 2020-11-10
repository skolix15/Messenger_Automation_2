Messenger_Automation (2)
"Sending automated messages using messenger chat platform"

This project was written with language "Java" in platform "Eclipse" and with the use of a web automation framework named "Selenium". In order to run this program, it will be needed the "Selenium" driver for the web browser "Chrome". The aforementioned driver exists in the current repository and is named as "chromedriver.exe".

When this source code runs, the web browser "Chrome" will open and the "Messenger" platform will be appeared in the screen. Then, the source code will automate fill the user's data and will press the "Log in" button. After this, the source code will search in the search bar and will write the names that the user has given. When the conversation of the given acounts will be found, the source code will automate write in the text-message area a specific message (the one that the user wants) and then the "Enter" button of messenger will be clicked.

More details:

Main class:

- In lines 18-19 the user needs to insert his/her credentials.

- In line 20 the user needs to write the name of the contact that he or she wants to send a message. (The user can also write more several contacts names).

- In line 23 the user needs to write the message that he or she wants to send.

DriverConstraint class:

- In line 10 the user need to insert the browser's driver path.

Some Notes:

This program works is able to run for many contacts too. In the main class is written in comments a source code for this option.

👉 If you need any further information for the current project feel free to contact by sending me an email: skolix15@gmail.com

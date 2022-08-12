## **Test task: tracking costs**

---

Technologies used: java 17, spring boot, spring data, mysql.

Commands available for user management:
 - list users - to list all available users
 - login [username] - you will be asked your password
 - logout 
 - signin [username] - to create a user. error if a username already exists
 - delete user - to delete your user with all your data (only for logged in user)
 - exit - to finish the application

Commands to Control Costs:
- category add [category name] [amount of money]
- category add [category name] [amount of money] [date]
- category [category name] info
- category [category name] delete
- category info all 
- category info [ day | month | year]
- category delete all

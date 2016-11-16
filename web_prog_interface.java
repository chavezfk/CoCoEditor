
//Create page and Join page interface
/** 
 * Forwards the user to a session, with the alias in the request
 * note: the create page also creates a session
 * @param alias the alias to enter the session with
 **/
void submit(String alias);





//Edit page and statistics page interface

/**
 * Sets the cursor position for the user.
 * @param pos the new position
 **/
void moveCursor(int pos);

/**
 * Deletes some number of characters from the text, from the current position.
 * @param sizeOfDeletion how many characters to delete. Deletes backwards
 **/
void delete(int sizeOfDeletion);

/**
 * Adds text to the hosted text. The text added is as given
 * @param text the text to add
 **/
void addText(String text);

/**
 * Leaves the current session
 **/
void leave();

/**
 * Returns a link to the current session
 * @return the link, in string form
 **/
String getLink();

/**
 * Fetches the total text from the server
 * @return the text from the server, e.g. the server's most recent version
 **/
String fetchText();

/**
 * Fetches statistics from the server, and updates the graphs 
 **/
void refreshStatistics();

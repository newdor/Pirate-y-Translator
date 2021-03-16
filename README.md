# Pirate-y-Translator
This program receives a text input in proper English and converts it to pirate speak.

## To-do:
* [x] Translator can take input from users.
* [x] Translator can do the translation.
* [x] User can keep entering new words until he hits 2.
* [x] Add more translation to text file.
* [x] add code to translate a paragraph instead of a single word.

<h2> Pirate-y-Translator: The Code in Plain English </h2>

<h3> Main </h3>
<ul>
<li> Imports a scanner to take single string input from the user </li>
<li> Creates the translator as a scanner </li> 
<li> Begins a loop to flip through the dictionary entries and find the corresponding entry </li>
<li> Asks user if they want to enter another input </li>
<li> Returns pirate jargon </li>
 <ul>

<h3> PirateTranslator.java <h3>
<li> Imports jav.io for accessing tet document </li>
<li> Imports Hashmap for flipping through dictionary </li>
<li> Imports Scanner to take user input </li>
<li> Creates a hashmap to store strings </li>

<h3> loadRules() <h3>
<li> Refers to the text file as a dictionary </li>
<li> If text files moves/isn’t found, don’t throw error, tell user not found </li>
<li> Creates and loads the rules method to take a term, compare it to the english terms (element 0) (separated by semicolon) and match with the pirate jargon (element 1) </li>

<h3> getTranslatedText <h3>
<li> For a string parameter, the method finds individual words, splits them apart, and enters them into an array as separate elements </li>
<li> Loops through each word and attaches a meaning using the getWordMeaning to compare to the array element i </li>
<li> Takes away spaces before and after the pirate word </li>

<h3> printDictionary <h3>
<li> Prints the dictionary one word at a time </li>

<h3> getWordMeaning <h3>
<li> If the English word cannot be found in the dictionary, return the original English word </li>

# Pirate-y-Translator
This program receives a text input in proper Enbglish and converts it to pirate speak.

## To-do:
* [x] Translator can take input from users.
* [x] Translator can do the translation.
* [x] User can keep entering new words until he hits 2.
* [x] Add more translation to text file.
* [x] add code to translate a paragraph instead of a single word.

_______________________________________________________________________________________________
#Pirate-y-Translator: The Code in Plain English

##Main
-Imports a scanner to take single string input from the user
-Creates the translator as a scanner
-Begins a loop to flip through the dictionary entries and find the corresponding entry
-Asks user if they want to enter another input
-Returns pirate jargon

##PirateTranslator.java
-Imports jav.io for accessing tet document
-Imports Hashmap for flipping through dictionary
-Imports Scanner to take user input
-Creates a hashmap to store strings

######loadRules()
-Refers to the text file as a dictionary
-If text files moves/isn’t found, don’t throw error, tell user not found
-Creates and loads the rules method to take a term, compare it to the english terms (element 0) (separated by semicolon) and match with the pirate jargon (element 1)

######getTranslatedText
-For a string parameter, the method finds individual words, splits them apart, and enters them into an array as separate elements
-Loops through each word and attaches a meaning using the getWordMeaning to compare to the array element i
-Takes away spaces before and after the pirate word

######printDictionary
-Prints the dictionary one word at a time

######getWordMeaning
-If the English word cannot be found in the dictionary, return the original English word

###Are We Keeping captainHook translator??

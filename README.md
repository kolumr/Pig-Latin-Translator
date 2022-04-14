# Pig-Latin-Translator
This is a java app that takes in a String and translates it to Pig Latin. It takes in user input from the console.

## Task: 
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

### Examples
pig_it('Pig latin is cool') # igPay atinlay siay oolcay

pig_it('Hello world !')     # elloHay orldway !

#### Steps taken to solve the task
1. Create a new String variable to save our translated String
2. Split the String to be translated into an array of words
3. Loop through the array
    1. Check if each word is a punctuation mark
    2. If the word is not a punctuation mark, remove the 1st letter of the word and append it at the end then add "ay"
    3. Add each traslated word to the new string adding a space to separate the words
    4. If the word is a puctuation mark, make no changes
    5. Add the punctuation mark to the new string
4. You have your String in Pig Latin

## Author
Kolum Ronald

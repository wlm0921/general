"""Number Guessing Game, where the computer randomly selects a number and the user must guess it"""

__author__: str = "Weston Murdock, wlm0921@live.unc.edu"

import random

# Write game_over() function
def game_over(f):
    pass

def guess():
    print("Let's play a game! I'll think of a random number, and you'll try and guess it!")
       
    # Want To Play?
    while True:
        try:
            want_to_play: str = input("Do you want to play? (Y/N) ")
        except ValueError:
            print("I didn't understand that, please either type Y or N.")
        if not (want_to_play == "Y") or (want_to_play == "N"):
            print("I didn't understand that, please either type Y or N.")
        else:
            break
    
    if want_to_play == "N":
        game_over(guess)
    
    # Get x
    while True:
        try:
            x: int = int(input("Great! First, what is the smallest number you'd be fine with me choosing? "))
        except ValueError:
            print("I didn't understand that, please give me a number.")
        else:
            break
    
    # Get y
    while True:
        try:
            y: int = int(input("And what is the largest number you'd be fine with me choosing? "))
        except ValueError:
            print("I didn't understand that, please give me a number.")
        if y < x:
            print(f"Please give me number larger than {x}.")
        if x == y:
            print(f"Ok... the game won't be much fun with those numbers, but whatever.")
            break
        else:
            break

    random_number: int = random.randint(x,y)
    guess_number: int = 0 # Figure out what to initialize this to...
    
    while random_number != guess_number:
        guess_number = int(input(f"Guess a number between 1 and {x}! Guess 0 to give up! "))
        # Figure out how to handle bad inputs here - in particular, strings

        # implement counter
        while guess_number == 0:
            confirm: str = input("Are you sure you want to give up? (Y/N): ")
            if confirm == "Y":
                break
            elif confirm == "N":
                print("Great! Let's keep playing!")
                continue
            else:
                print("Not a valid statement! Please type either Y or N!")

        if guess_number < random_number:
            print("Too low!")
        elif guess_number > random_number:
            print("Too high!")
        else:
             print(f"Correct! I was thinking of {random_number}! You win!")
    print("GAME OVER")

    # implement counter
    game_over: bool = True
    while game_over:
        again: str = input("Would you like to play again? (Y/N) ")
        if again == "Y":
            guess()
        elif again == "N":
            print("Goodbye!")
        else:
            print("Not a valid statement! Please type either Y or N!")

if __name__ == '__main__':
    guess()
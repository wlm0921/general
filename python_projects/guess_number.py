"""Number Guessing Game, where the computer randomly selects a number and the user must guess it"""

__author__: str = "Weston Murdock, wlm0921@live.unc.edu"

"""
TO DO LIST:
    1: Handle floats in guess()
    2: Handle replays elegantly
"""

import random

def game_over(f):
    print("GAME OVER")
    while True:
        try:
            again: str = input("Would you like to play again? (Y/N) ").upper()
        except ValueError:
            print("I didn't understand that, please either type Y or N.")
        if again == "Y":
            f()
        elif again == "N":
            print("Goodbye!")
        else:
            print("I didn't understand that, please either type Y or N.")
        exit()

def guess():
    print("Let's play a game! I'll think of a random number, and you'll try and guess it!")
       
    # Want To Play?
    while True:
        try:
            want_to_play: str = input("Do you want to play? (Y/N) ").upper()
        except ValueError:
            print("I didn't understand that, please either type Y or N.")
        if not ((want_to_play == "Y") or (want_to_play == "N")):
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
            print(f"Please give me a number larger than {x}.")
        elif x == y:
            print(f"Ok... the game won't be much fun with those numbers, but whatever.")
            break
        else:
            break

    # Set the random number
    random_number: int = random.randint(x,y)
    
    # Gameplay loop
    while True:
        try:
            guess_number: str = input(f"Guess a number between {x} and {y}! (Give up with G) ").upper()
            if guess_number == "G":
                while True:
                    try:
                        give_up: str = input("Are you sure you want to give up? (Y/N) ").upper()
                    except ValueError:
                        print("I didn't understand that, please type either Y or N!")
                    if give_up == "Y":
                        print("Ok, maybe you'll get it next time!")
                        break
                    elif give_up == "N":
                        print("Ok then, let's keep going!")
                    else:
                        print("I didn't understand that, please type either Y or N!")
            else:
                guess_number = int(guess_number)
        except ValueError:
            print("I didn't understand that, please either give me a number or G.")
        if guess_number < random_number:
            print("Too low!")
        elif guess_number > random_number:
            print("Too high!")
        else:
            print(f"Correct! I was thinking of {random_number}! You win!")
            break
        
    game_over(guess)

if __name__ == '__main__':
    guess()
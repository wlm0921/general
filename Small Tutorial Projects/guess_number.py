"""Number Guessing Game, where the computer randomly selects a number and the user must guess it"""

__author__: str = "Weston Murdock, wlm0921@live.unc.edu"

import random

def guess():
    print("Let's play a game! I'll think of a random number, and you'll try and guess it!")
    want_to_play: str = input("Do you want to play? (Y/N) ")
    counter: int = 0
    # Want To Play chunk goes here, implement counter

    x: int = int(input("Great! First, what is the largest number you'd be fine with me choosing? "))
    # Add in fail-safe here for x

    random_number: int = random.randint(1,x)
    guess_number: int = 0
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
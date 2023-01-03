"""Determine the probability of finding n Black Liver Beans in Xenoblade Chronicles.
    Assumes exactly 13 spawn points with probability 0.02, 13 spawn points with probability 0.08,
    and one chance of finding a BLB at each spawn point (i.e. 26 binomial trials total, with p = 0.02
    and p = 0.04 for half the trials."""

from math import comb

__author__ = "Weston Murdock"


def blb_pmf(n: int) -> float:
    """The probability mass function of finding n Black Liver Beans in Xenoblade Chronicles."""
    prob: float = 0
    for i in range(n + 1):
        prob += comb(13, n - i) * (0.02)**(n - i) * (1 - 0.02)**(13 - n + i) * comb(13, i) * (0.08)**(i) * (1 - 0.08)**(13 - i)
    
    return prob


def blb_cmf(n: int) -> float:
    """The cumulative mass function of finding n or fewer Black Liver Beans in Xenoblade Chronicles."""
    prob: float = 0
    for i in range(n + 1):
        prob += blb_pmf(i)
    
    return prob


def blb_n_or_more(n: int) -> float:
    """Returns the probability of finding n or more Black Liver Beans in Xenoblade Chronicles."""
    prob: float = 0
    prob += 1 - blb_cmf(n)
    prob += blb_pmf(n)

    return prob


if __name__ == "__main__":
    n: int = int(input("How many Black Liver Beans? "))
    print(f"Probability of finding {n} Black Liver Beans: {blb_pmf(n)}")
    print(f"Probability of finding {n} or fewer Black Liver Beans: {blb_cmf(n)}")
    print(f"Probability of finding {n} or more Black Liver Beans: {blb_n_or_more(n)}")
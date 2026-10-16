# Random Variables — Representative Exam-Review Practice

> **Scope:** Seven selected problems from *Homework 4* and *Homework 5*, cross-referenced against the uploaded MATH 309 class notes and Lectures 11–13. These are representative practice exercises, **not predictions of exam content**.
>
> **Use:** Problem statements only; no solutions or answer keys. Problem numbers refer to the original homework, and subparts retain their original labels. Selection rationales are editorial metadata, not part of the original questions.

## 1. Binomial Distribution: Independent Trials and PMFs

**Source:** Homework 4, Problem 2(a)–(b), pp. 1–2  
**Topic:** Binomial model; independent Bernoulli trials; probability mass functions  
**Lecture alignment:** Class notes on Bernoulli/binomial distributions; Lecture 13 distribution summary

### Original problem statement

**2. (The lady tasting tea)** Your great-great-grandmother Pancracia (from the greek pankratios, pan (all) and kratos (power), i.e., “the almighty”), always so prone to brag about her sophistication, claims her taste buds can distinguish between two possible methods to prepare a cup of tea:

- Method 1: First add the tea, then add the milk.
- Method 2: First add the milk, then add the tea.

While nobody is looking, you decide to test Pancracia’s extraordinary ability. For that, you prepare 8 cups of tea using method 1. Then you ask Pancracia to taste all tea cups and to tell you which method she thinks was used for each cup. Of course, you make sure Pancracia gets some water between tastings so that all tastings can be assumed to be independent of each other.

**(a)** If Pancracia had no clue about which method you used for each cup, i.e., if she was simply randomly guessing, what is the probability that Pancracia guesses correctly on all 8 cups? What is the most likely number of cups that she will guess correctly?

**(b)** What does this question have to do with computing pmfs of random variables?

**Why selected:** A concrete, short application of independent binary trials and the binomial PMF, including interpretation of the random variable.

---

## 2. PMF of a Transformed Random Variable: Option Payoffs

**Source:** Homework 4, Problem 5(a), pp. 3–4  
**Topic:** Discrete random variables as functions of outcomes; PMFs of payoff variables  
**Lecture alignment:** Class notes introducing random variables through the binomial asset-pricing model

### Original problem statement (setup and part a)

**5.** Consider the binomial model for asset pricing with 4 time periods ($t=0,1,2,3$). In this 4-time period model, a given asset is priced over time as the outcomes of 3 independent and fair coin tosses get revealed. More precisely, at time $t=0$ the price of the asset is $A_0=a_0$, where $a_0$ is a constant. After that, the price of the asset at time $t+1$ is determined by

$$
A_t=\begin{cases}
u A_{t-1}, & \text{if the }t\text{-th coin toss is H},\\
d A_{t-1}, & \text{if the }t\text{-th coin toss is T},
\end{cases}
$$

where $u>1$ and $0<d<1$ are two constants.

Finally, let $C_3$ and $P_3$ be the random variables

$$
C_3:=\begin{cases}A_3-K,&A_3\ge K,\\0,&\text{else},\end{cases}
\qquad
P_3:=\begin{cases}K-A_3,&K\ge A_3,\\0,&\text{else},\end{cases}
$$

where $K$ is a constant. They represent, respectively, the payoffs at time $t=3$ of a call option and of a put option with strike price $K$.

**(a)** If $a_0=50$, $K=65$, $u=1.2$, and $d=0.7$, what are the pmfs of $C_3$ and $P_3$?

**Why selected:** Tests construction of PMFs from a finite sample space and a function of outcomes, using a model explicitly introduced in the class notes. Part (b), which changes the probability measure, is omitted to keep the exercise focused.

---

## 3. CDF to PMF: Minimum of Two Die Rolls

**Source:** Homework 5, Problem 1(a)–(b), p. 1  
**Topic:** Cumulative distribution functions; recovery of a PMF from a CDF  
**Lecture alignment:** Lecture 11, CDF properties and PMF–CDF relationship

### Original problem statement

**1.** A $n$-sided fair die with sides labeled $1,2,\ldots,n$ is tossed twice. Assume that the two rolls are independent. Let $X$ be the minimum of the two rolls.

**(a)** Find the CDF of $X$.

**(b)** Use the CDF to compute the PMF of $X$.

**Why selected:** Directly exercises two core lecture skills in sequence: deriving a CDF and using it to obtain the PMF.

---

## 4. Independent Binomial Random Variables: Sum and Independence

**Source:** Homework 5, Problem 2(a)–(b), p. 1  
**Topic:** Sum of independent discrete random variables; role of independence  
**Lecture alignment:** Lecture 11, independent random variables; Lecture 13, operations on random variables

### Original problem statement

**2.** Let $X,Y$ be two independent $\operatorname{bin}(n,p)$ random variables.

**(a)** What is the distribution of $X+Y$? If your answer is a distribution discussed in class, identify its parameters. Otherwise, give a formula for the PMF of the distribution.

**(b)** Does your answer to the previous question continue to hold if you drop the independence assumption? If your answer is yes, prove it, if not, give a counterexample.

**Why selected:** Tests both calculation/identification of a resulting distribution and conceptual understanding of why independence matters.

---

## 5. Independent Binomial Random Variables: Difference

**Source:** Homework 5, Problem 3(a), p. 1  
**Topic:** PMF of the difference of discrete random variables  
**Lecture alignment:** Lecture 13, arithmetic operations on random variables

### Original problem statement (part a)

**3.** Let $X,Y$ be two independent $\operatorname{bin}(n,p)$ random variables.

**(a)** What is the distribution of $X-Y$? If your answer is a distribution discussed in class, identify its parameters. Otherwise, give a formula for the PMF of the distribution.

**Why selected:** Complements the sum problem with a different random-variable operation. Part (b), a second independence-removal proof/counterexample question, is omitted to avoid repetition.

---

## 6. Independent Poisson Random Variables: Sum

**Source:** Homework 5, Problem 5(a), p. 2  
**Topic:** Poisson distribution; combining independent random variables  
**Lecture alignment:** Lecture 13, Poisson distribution and random-variable operations

### Original problem statement (part a)

**5.** Let $X,Y$ be two independent $\operatorname{Poisson}(\lambda)$ random variables.

**(a)** What is the distribution of $X+Y$? If your answer is a distribution discussed in class, identify its parameters. Otherwise, give a formula for the PMF of the distribution.

**Why selected:** Applies the same distribution-combination skill to the Poisson family, giving broader coverage without repeating the independence counterexample exercise.

---

## 7. Poisson PMF: Location of the Maximum

**Source:** Homework 5, Problem 6, p. 2  
**Topic:** Poisson PMF; parameter-dependent behavior of a discrete distribution  
**Lecture alignment:** Lecture 13, Poisson distribution and its PMF

### Original problem statement

**6.** For what values of $\lambda$ does the PMF of the $\operatorname{Pois}(\lambda)$ distribution has its maximum at $x=0$? Justify your answers with mathematical proofs. If it helps to plot the PMF of $\operatorname{Pois}(\lambda)$ for different values of $\lambda$ to get some intuition, by all means do so.

**Why selected:** A compact, standard exercise on interpreting and comparing probabilities from the Poisson PMF.

---

## Source and Selection Notes

- **Problem wording:** Original questions are preserved, except for Markdown/LaTeX formatting and the explicit transcription clarification in Homework 4, Problem 5. Original grammatical quirks are retained.
- **Partial selections:** Homework 4 Problem 5(a), Homework 5 Problem 3(a), and Homework 5 Problem 5(a) intentionally exclude their other subparts; each selected subpart is labeled accordingly.
- **Excluded material:** The long limiting argument in Homework 5 Problem 4, the specialized urn stopping-time question in Homework 5 Problem 7, the entropy/KL-divergence exploration in Homework 4 Problem 4, and honors problems were not prioritized for this compact review set. Exclusion does not imply these topics cannot appear on an exam.
- **Diagram/table dependencies:** None of the seven selected questions requires an unreproduced diagram or table.
- **Exam relevance:** The supplied materials establish that these are assigned problems and lecture topics, not that any specific problem will appear on an exam.

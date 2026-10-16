# MATH 309 — Discrete Random Variables and Distributions

> **Source scope:** `math309(1).pdf` (11 pages), `math309.pdf` (Discussion 6, 2 pages), `Lecture11.pdf` (17 pages), `Lecture12.pdf` (18 pages), and `Lecture13.pdf` (18 pages). This document consolidates overlapping material rather than repeating it. Page references refer to PDF page numbers. Statements labeled **Source issue** identify ambiguities or apparent errors in the supplied notes, rather than silently correcting them.

## 1. Random Variables

### 1.1 Definition and distribution

Given a probability space $(S,P)$, a **random variable** is a function

$$X:S\to\mathbb{R},\qquad \omega\mapsto X(\omega).$$

A random variable assigns a real number to each sample-space outcome. Its **range** is

$$\operatorname{Range}(X)=\{X(\omega):\omega\in S\}.$$

The distribution of $X$ depends on the probability model $P$; the same random variable can have different distributions under different probability assignments.

**Sources:** `math309(1).pdf`, pp. 1–3.

### 1.2 Discrete random variables

A random variable is **discrete** when its range is finite or countable. If $S$ is finite or countable, any real-valued random variable on $S$ is discrete. A sample space need not itself be countable for a random variable defined on it to be discrete.

**Example — Two coin flips.** With $S=\{HH,HT,TH,TT\}$, define $X$ as the number of heads. Then $\operatorname{Range}(X)=\{0,1,2\}$, so $X$ is discrete.

**Example — First head.** Let $X$ count flips until the first head. Its possible values are $1,2,3,\ldots$, a countable set.

**Sources:** `math309(1).pdf`, pp. 2–3.

### 1.3 Functions of random variables

An asset-price example defines a random variable $A_t$ giving an asset's price at time $t$ under different coin-flip outcomes. A call-option payoff is another random variable:

$$G(\omega)=\begin{cases}A_t(\omega)-K,&A_t(\omega)\ge K,\\0,&A_t(\omega)<K.\end{cases}$$

Here $K$ is the strike price used in the handwritten example.

**Source:** `math309(1).pdf`, pp. 1–2.

## 2. Probability Mass Functions (PMFs)

### 2.1 Definition and support

For a discrete random variable $X$, its **probability mass function** is

$$p_X(x)=P(X=x),\qquad x\in\mathbb{R}.$$

Its **support** is

$$\operatorname{Supp}(X)=\{x\in\mathbb{R}:p_X(x)>0\}.$$

**PMF properties:**

$$0\le p_X(x)\le1\quad\text{for every }x\in\mathbb{R},$$

$$\sum_{x\in\operatorname{Supp}(X)}p_X(x)=1.$$

The range and support need not be identical: a value may be attainable but have zero probability.

**Sources:** `math309.pdf`, p. 1; `math309(1).pdf`, pp. 3, 6; `Lecture11.pdf`, pp. 11–12.

### 2.2 Computing event probabilities from a PMF

For a set $A\subseteq\mathbb{R}$,

$$P(X\in A)=\sum_{x\in A\cap\operatorname{Supp}(X)}p_X(x).$$

**Example — Sum of two four-sided dice.** For independent equally likely rolls with values $1,2,3,4$, let $X$ be their sum. There are 16 equally likely ordered outcomes.

| $x$ | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
|---|---:|---:|---:|---:|---:|---:|---:|
| $p_X(x)$ | $1/16$ | $2/16$ | $3/16$ | $4/16$ | $3/16$ | $2/16$ | $1/16$ |

Thus,

$$P(X\text{ is odd})=p_X(3)+p_X(5)+p_X(7)=\frac{8}{16}=\frac12.$$

**Source:** `math309(1).pdf`, pp. 4–5.

### 2.3 Indicator random variables

For an event $E\subseteq S$, define

$$\mathbf{1}_E(\omega)=\begin{cases}1,&\omega\in E,\\0,&\omega\notin E.\end{cases}$$

Then $P(\mathbf{1}_E=1)=P(E)$ and $P(\mathbf{1}_E=0)=1-P(E)$. This is the Bernoulli PMF with parameter $p=P(E)$.

**Source:** `math309(1).pdf`, p. 5.

## 3. Cumulative Distribution Functions (CDFs)

### 3.1 Definition

The **cumulative distribution function** of $X$ is

$$F_X(x)=P(X\le x),\qquad F_X:\mathbb{R}\to[0,1].$$

### 3.2 Properties

1. $0\le F_X(x)\le1$ for all real $x$.
2. $\lim_{x\to-\infty}F_X(x)=0$ and $\lim_{x\to+\infty}F_X(x)=1$.
3. $F_X$ is nondecreasing.
4. $F_X$ is **right-continuous**: $\lim_{y\to x^+}F_X(y)=F_X(x)$.

For a discrete variable, its CDF is a step function; a positive jump at $x$ corresponds to positive probability mass at $x$.

**Sources:** `math309.pdf`, p. 1; `math309(1).pdf`, pp. 6–8; `Lecture11.pdf`, pp. 1–5.

### 3.3 Convert PMF to CDF

$$F_X(x)=\sum_{y\in\operatorname{Supp}(X):\,y\le x}p_X(y).$$

### 3.4 Convert CDF to PMF

$$p_X(x)=F_X(x)-\lim_{y\to x^-}F_X(y).$$

Equivalently,

$$P(X=x)=P(X\le x)-P(X<x).$$

Thus $x\in\operatorname{Supp}(X)$ exactly when $F_X$ has a positive jump at $x$.

**Sources:** `math309.pdf`, p. 1; `Lecture11.pdf`, pp. 4–6.

### 3.5 Tail probabilities

$$P(X>x)=1-F_X(x),$$

$$P(X\ge x)=1-F_X(x)+p_X(x).$$

The distinction between $>$ and $\ge$ matters at points with nonzero PMF.

**Source:** `Lecture13.pdf`, pp. 8–9.

## 4. Independence of Discrete Random Variables

### 4.1 Mutual independence

Discrete random variables $X_1,\ldots,X_n$ are **independent** if, for every choice of real values $x_1,\ldots,x_n$, the events

$$\{X_1=x_1\},\ldots,\{X_n=x_n\}$$

are independent. In particular,

$$P(X_1=x_1,\ldots,X_n=x_n)=\prod_{i=1}^{n}P(X_i=x_i).$$

### 4.2 Pairwise independence

The variables are **pairwise independent** if each distinct pair $X_i,X_j$ is independent. Pairwise independence alone does **not** guarantee mutual independence of the entire collection.

**Example — Two coin flips.** For $S=\{HH,HT,TH,TT\}$ under the equally likely outcome model, let $X_1$ indicate a head on the first flip and $X_2$ indicate a head on the second flip. The two indicator variables are independent.

**Sources:** `Lecture11.pdf`, pp. 6–9, 17; `math309(1).pdf`, pp. 8–9.

## 5. Bernoulli Distribution

### 5.1 Definition, parameter, and PMF

Write $X\sim\operatorname{Bernoulli}(p)$, with $p\in[0,1]$, when

$$p_X(x)=\begin{cases}1-p,&x=0,\\p,&x=1,\\0,&\text{otherwise}.\end{cases}$$

A Bernoulli variable models a single binary outcome (success $=1$, failure $=0$).

### 5.2 CDF

$$F_X(x)=\begin{cases}0,&x<0,\\1-p,&0\le x<1,\\1,&x\ge1.\end{cases}$$

**Endpoint note:** The notes sometimes describe the support as $\{0,1\}$. If $p=0$ or $p=1$, the actual positive-probability support has only one point, although the possible-value set remains $\{0,1\}$.

**Sources:** `math309.pdf`, p. 2; `Lecture11.pdf`, pp. 10–12; `math309(1).pdf`, pp. 5, 9.

## 6. Binomial Distribution

### 6.1 Modeling conditions

The binomial model counts successes in **$n$ independent Bernoulli trials** with a common success probability $p$. Its conditions are:

- Each trial has two outcomes (success/failure).
- The number of trials $n$ is fixed.
- Each trial has the same success probability $p$.
- The trials are mutually independent.

If $X_1,\ldots,X_n$ are independent $\operatorname{Bernoulli}(p)$ variables, then

$$X=X_1+\cdots+X_n\sim\operatorname{Bin}(n,p).$$

### 6.2 PMF

For $n\in\mathbb{N}$, $p\in[0,1]$,

$$p_X(x)=\begin{cases}\displaystyle\binom{n}{x}p^x(1-p)^{n-x},&x=0,1,\ldots,n,\\0,&\text{otherwise}.\end{cases}$$

The coefficient $\binom{n}{x}$ counts which $x$ trials are successes. The normalization follows from the binomial theorem:

$$\sum_{x=0}^n\binom nx p^x(1-p)^{n-x}=(p+1-p)^n=1.$$

**Example — Independent coin flips.** If a coin lands heads with probability $p$ and is flipped independently $n$ times, the number of heads has distribution $\operatorname{Bin}(n,p)$.

**Important condition:** Pairwise independence is not sufficient to conclude the sum is binomial.

**Sources:** `math309.pdf`, p. 2; `Lecture11.pdf`, pp. 13–17; `math309(1).pdf`, pp. 9–10.

## 7. Hypergeometric Distribution

### 7.1 When to use it

Use the hypergeometric model when sampling **without replacement** from a finite population.

Let $N$ be the total number of objects, $b$ the number of blue (or otherwise designated) objects, and $n\le N$ the number sampled. Let $X$ count blue objects among the $n$ draws. The individual draw indicators are generally **not independent**.

### 7.2 Range

$$\ell=\max\{0,n-(N-b)\},\qquad u=\min\{n,b\},$$

$$\operatorname{Range}(X)=\{\ell,\ell+1,\ldots,u\}.$$

The upper bound reflects that one cannot draw more blue objects than exist or more than the sample size. The lower bound reflects that only $N-b$ nonblue objects exist.

### 7.3 PMF

Write $X\sim\operatorname{HG}(N,b,n)$, where $0\le b\le N$ and $0\le n\le N$ are integers. Then

$$p_X(x)=\begin{cases}\displaystyle\frac{\binom bx\binom{N-b}{n-x}}{\binom Nn},&x\in\{\ell,\ldots,u\},\\0,&\text{otherwise}.\end{cases}$$

**Counting interpretation:** The numerator counts samples containing exactly $x$ blue and $n-x$ nonblue objects; the denominator counts all samples of size $n$.

### 7.4 Example — Aces in a hand of cards

A 12-card hand is drawn from a standard 52-card deck. Let $X$ count the aces. The lecture identifies

$$X\sim\operatorname{HG}(52,4,12),$$

with range $\{0,1,2,3,4\}$ and

$$P(X\ge2)=p_X(2)+p_X(3)+p_X(4).$$

**Sources:** `Lecture12.pdf`, pp. 1–11; `math309(1).pdf`, pp. 10–11.

## 8. Geometric Distribution

### 8.1 When to use it

Repeat **independent trials**, each with the same probability $p$ of success, until the **first success**. Let $X$ be the trial number on which that success occurs.

### 8.2 PMF

For $p\in(0,1]$, write $X\sim\operatorname{Geom}(p)$, with

$$p_X(x)=\begin{cases}p(1-p)^{x-1},&x=1,2,3,\ldots,\\0,&\text{otherwise}.\end{cases}$$

The first $x-1$ trials must fail and trial $x$ must succeed.

**Parameter boundary:** The lecture's table uses $p\in(0,1]$. At $p=1$, $X=1$ with probability one; the formula remains meaningful for $x\ge1$.

### 8.3 Example — Rolling until the first 1

For independent rolls of a fair $k$-sided die, let $X$ count rolls until the first 1. Then

$$X\sim\operatorname{Geom}(1/k).$$

For $k=8$, the lecture asks for the probability of needing more than 10 rolls:

$$P(X>10)=1-\sum_{x=1}^{10}\frac18\left(\frac78\right)^{x-1}\approx0.263.$$

**Sources:** `Lecture12.pdf`, pp. 12–18; `math309(1).pdf`, p. 11.

## 9. Poisson Distribution

### 9.1 Definition and PMF

Write $X\sim\operatorname{Po}(\lambda)$ for parameter $\lambda\ge0$, with

$$p_X(x)=\begin{cases}\displaystyle\frac{e^{-\lambda}\lambda^x}{x!},&x=0,1,2,\ldots,\\0,&\text{otherwise}.\end{cases}$$

The lecture describes the Poisson distribution as a model for **counts of random events**.

### 9.2 Normalization

Using the exponential series,

$$\sum_{x=0}^{\infty}p_X(x)=e^{-\lambda}\sum_{x=0}^{\infty}\frac{\lambda^x}{x!}=e^{-\lambda}e^{\lambda}=1.$$

**Endpoint note:** When $\lambda=0$, the mass is concentrated at $0$ (using the standard $0^0=1$ convention in this PMF); the displayed range $\{0,1,2,\ldots\}$ in the lecture is a possible-value set, not the strictly positive support at that endpoint.

**Source issue — mislabeled sentence:** `Lecture13.pdf`, p. 1 introduces a **Poisson** random variable and displays the Poisson PMF, but a parenthetical sentence calls it a “hypergeometric distribution.” This is an internal terminology conflict in the source. The section heading, formula, and notation all say Poisson; the conflicting wording is recorded here rather than silently reproduced as a definition.

**Sources:** `Lecture13.pdf`, pp. 1–4.

## 10. Expectation of a Discrete Random Variable

### 10.1 Definition

For a discrete random variable $X$, the lecture defines its **expectation** (or **expected value**) as

$$E[X]=\sum_x xP(X=x)=\sum_{x\in\operatorname{Supp}(X)}x\,p_X(x).$$

Expectation is a probability-weighted average; it need not be one of the values in the range of $X$.

**Scope note:** The lecture introduces this formula directly for discrete random variables. It does not develop the general convergence conditions for infinite sums in the pages supplied; these are not added here.

### 10.2 Example — Equally likely values

If $X$ takes $x_1,\ldots,x_n$ with equal probability $1/n$, then

$$E[X]=\frac1n\sum_{i=1}^{n}x_i.$$

### 10.3 Example — General weighted average

If $P(X=x_i)=p_i$, with $p_i\ge0$ and $\sum_{i=1}^np_i=1$, then

$$E[X]=\sum_{i=1}^n x_i p_i.$$

### 10.4 Bernoulli expectation

For $X\sim\operatorname{Bernoulli}(p)$,

$$E[X]=0\cdot(1-p)+1\cdot p=p.$$

### 10.5 Binomial expectation

For $X\sim\operatorname{Bin}(n,p)$,

$$E[X]=\sum_{x=0}^n x\binom nx p^x(1-p)^{n-x}=np.$$

The lecture derives this by rewriting $x\binom nx=n\binom{n-1}{x-1}$ and applying the binomial theorem.

**Sources:** `Lecture13.pdf`, pp. 10–18.

## 11. Comparing the Five Discrete Distributions

| Distribution | What $X$ counts | Main conditions | PMF support / possible values |
|---|---|---|---|
| Bernoulli$(p)$ | Success in one binary trial | Success probability $p$ | $0,1$ |
| Binomial$(n,p)$ | Successes across $n$ trials | Fixed $n$, common $p$, independent trials | $0,\ldots,n$ |
| Hypergeometric$(N,b,n)$ | Designated objects in a sample | Finite population, sampling without replacement | $\max(0,n-N+b),\ldots,\min(n,b)$ |
| Geometric$(p)$ | Trial of first success | Independent repeated trials, common $p$ | $1,2,\ldots$ |
| Poisson$(\lambda)$ | Random-event count | PMF parameter $\lambda\ge0$ | $0,1,2,\ldots$ |

**Important distinction:** Binomial sampling uses independent trials; hypergeometric sampling without replacement produces dependent draw indicators.

**Sources:** `Lecture11.pdf`, pp. 13–17; `Lecture12.pdf`, pp. 1–18; `Lecture13.pdf`, pp. 1–4.

## 12. Source-Based Questions and Topics Not Fully Worked Out

These are retained as questions or contextual remarks rather than answered using material outside the supplied notes.

- `Lecture13.pdf`, p. 3: A homework problem will discuss the relationship between $\operatorname{Bin}(n,p)$ and $\operatorname{Po}(\lambda)$. The lecture does not provide the derivation here.
- `Lecture13.pdf`, pp. 5–7: Given independent $X,Y\sim\operatorname{Bin}(n,p)$, the lecture asks for the PMF of $X+Y$ and defines $(X+Y)(\omega)=X(\omega)+Y(\omega)$. The provided pages do not give a completed distribution formula; none is invented here.
- `Lecture13.pdf`, p. 14: The notes mention a later interpretation of expectation involving repeated samples and the law of large numbers, but do not develop that theorem.

## 13. Source Quality and Reconciliation Notes

1. **Deduplication:** PMF/CDF definitions, Bernoulli/binomial formulas, and independence appear in multiple uploads and are merged into single sections.
2. **Terminology conflict:** The Poisson definition on `Lecture13.pdf`, p. 1 contains the hypergeometric label in one parenthetical sentence. See Section 9.2.
3. **Range versus support:** Some notes write $\operatorname{Supp}(X)=\{0,1\}$ for Bernoulli variables even at parameter endpoints; see Section 5.2. Similar endpoint considerations apply to Poisson at $\lambda=0$.
4. **Handwriting/transcription:** Only legible definitions, formulas, conditions, and examples that could be checked against the supplied page images were consolidated. Partially obscured side notes or calculations were not guessed or silently turned into additional results.
5. **No outside additions:** The document intentionally omits unsupplied formulas for variance, moment-generating functions, and other later material.

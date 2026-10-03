# Part C — Concept Answers (Session 9, Abstraction)

## Question 1 — Abstraction in your own words + real-life example

Abstraction means exposing *what* an operation does while hiding *how* it is
done, so callers depend only on a small stable contract. For example, an ATM
screen shows `withdraw(amount)`, `checkBalance()`, and `changePin()` buttons
with simple success/failure messages. Hidden underneath are account ledgers,
PIN hashing, network retries to the bank server, cash-dispenser hardware
control, and fraud checks — none of which the user sees or can break by
accident. If the bank swaps its backend, the buttons stay the same.

## Question 2 — Abstraction vs encapsulation, and how they cooperate

Abstraction is about the *interface* (hiding implementation complexity by
showing only essential operations), while encapsulation is about *access
control* (bundling data with code and guarding the data with `private` +
validated methods). In one class they cooperate: e.g. a `MessWallet` exposes
the abstract operations `topUp()` / `deduct()` / `getBalance()` (abstraction —
callers need no ledger logic), while the `balance` field stays `private` and
`deduct()` rejects overdrafts so the balance can never go negative
(encapsulation). Abstraction simplifies *use*; encapsulation protects
*integrity*.

## Question 3 — Why an abstract class has a constructor, and when it runs

An abstract class often holds shared state (fields like `deviceId`,
`owner`, `units`) that every subclass needs initialized the same way, so it
provides a constructor to centralize that setup and avoid duplication. It runs
whenever a concrete subclass object is created: the subclass constructor must
call `super(...)` (explicitly or implicitly) as its first step, chaining up
to the abstract constructor before the subclass fields initialize. It never
runs standalone because `new AbstractType()` itself is forbidden.

## Question 4 — Why `private`, `static`, `final` are banned on abstract methods

An abstract method is a promise that a *subclass instance* will supply the
body via overriding and dynamic dispatch. `private` hides the method from
subclasses, so no override is possible — the promise could never be kept.
`static` binds the method to the class rather than an instance and is resolved
at compile time, so polymorphic overriding/dispatch cannot apply. `final`
explicitly forbids overriding, which directly contradicts `abstract`'s demand
to override. Hence all three modifiers are compile errors on abstract methods.

## Question 5 — The 'diamond problem' and how Java avoids it

The diamond problem arises with multiple *state* inheritance: class D extends
B and C, both extending A and each carrying their own copy of A's fields, so
D inherits two conflicting copies and it is ambiguous which one a read/write
refers to. Java avoids this by allowing `extends` of only ONE class (single
chain of instance state, never duplicated) while permitting `implements` of
MANY interfaces, because interfaces carry no instance state — only method
contracts (and `public static final` constants). The only residual conflict,
two interfaces supplying the same `default` method, is resolved by forcing the
implementing class to write its own override, turning ambiguity into an
explicit compile-time decision.

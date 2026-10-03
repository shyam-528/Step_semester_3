# Part B — Quiz Answers (Session 9, Abstraction)

Single best answer per question, with a one-line reason.

| Q | Answer | Why |
|---|--------|-----|
| Q1 | **C.** Hiding how an object performs its operations and showing only what it does | Abstraction = what-it-does interface, not how. A = opposite; B = encapsulation; D = inheritance. |
| Q2 | **C.** It cannot be instantiated directly | True even with zero abstract methods. A is false (zero abstract methods allowed); B is false; D is false (single `extends` only). |
| Q3 | **B.** The class must be declared abstract, or the code will not compile | Concrete subclass must implement every inherited abstract method; otherwise it stays abstract — compile-time rule, not runtime. |
| Q4 | **C.** `private` | `abstract` means "subclass must override", but `private` is invisible to subclasses — contradictory, so forbidden. `protected`, `public`, package-private are all allowed. (`static`/`final` are also forbidden, but not listed here.) |
| Q5 | **C.** `public, static, and final` | Interface fields are constants by default. A/B/D get the modifiers wrong (never `private`/`protected`/instance-specific). |
| Q6 | **C.** Any number of interfaces | A class can `implements A, B, C, ...` with no limit, even while extending one class. |
| Q7 | **D.** `public` | Interface methods are implicitly `public`; an implementation may not reduce visibility, so it must be `public`. |
| Q8 | **C.** Interfaces carry no instance state, avoiding the 'diamond problem' ambiguity with conflicting data inheritance | Multiple class inheritance would duplicate fields; interfaces (no instance state pre-Java-8, and explicit default-method resolution after) avoid that. |
| Q9 | **D.** A compile-time error occurs until the class overrides the method | Java forces the class to resolve the default-method conflict with its own override; neither interface wins automatically and it is not deferred to runtime. |
| Q10 | **B.** Abstract classes can have constructors that run when a subclass object is created | The constructor initializes inherited state via `super(...)`. A/C/D are false: concrete classes have constructors, interfaces have none, and an abstract constructor never creates the abstract type directly. |

Quick key: **C, C, B, C, C, C, D, C, D, B**

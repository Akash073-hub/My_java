# My_java

A small collection of clear, focused Java example programs for learners. Each folder contains short, self-contained examples that demonstrate a single concept so you can compile, run, and experiment quickly.

This repository is intended for learners who want simple, practical examples covering basic Java concepts (conditionals, loops, methods, OOP, exceptions, threads, and more). Each example is small and focused so you can run it, change it, and learn by doing.

## What this repository contains

- `Conditional_problems` — if / else and decision-making examples
- `Encapsulation` — access modifiers and encapsulation examples
- `Exception_handling` — try / catch and basic exception examples
- `inheritance` — simple inheritance examples
- `Loops` — for, while, and loop examples
- `Methods` — recursion and method examples
- `OOPs` — basic object-oriented programming examples
- `Polymorphism` — method overriding and polymorphism examples
- `Strings` — string handling and manipulation examples
- `Thread_Synchronized` — basic threads and synchronization examples

Each folder usually has one or more `.java` files that are small and focused so you can learn one idea at a time.

## Requirements

- Java Development Kit (JDK) 11 or newer
- A terminal (macOS Terminal, iTerm, or similar) using `zsh` or another shell

Check Java is installed with `java -version` and `javac -version`. If `javac` is missing, install a JDK.

## Quick start (learner-friendly)

1. Open a terminal and go to the repository root.

2. Run a single example (safe and simple):

 - Change into the example folder, compile, then run:

```bash
cd Conditional_problems
javac program1.java
java program1
```

This approach is the least error-prone for beginners because you don't need to worry about package names or classpaths.

3. One-step run (Java 11+):

```bash
java Conditional_problems/program1.java
```

This command compiles and runs that file directly — very convenient for small experiments.

4. Compile many files at once (when you want to build several examples):

```bash
javac $(find . -name "*.java")
```

This will compile all `.java` files found under the current directory. After compiling, run a specific example by changing into its folder and running `java ClassName` (if the class is in the default package), or by using the fully-qualified name if the file declares a `package`.

5. If examples use `package` statements:

- Compile to an output directory, then run with classpath:

```bash
javac -d out $(find . -name "*.java")
java -cp out com.example.MainClass
```

The `-d out` flag tells `javac` to place compiled classes into the `out` directory while preserving package folders.

## Common errors and quick fixes

- `javac: command not found` — Java is not installed or not in PATH. Install the JDK and ensure `javac` works in the terminal.
- `NoClassDefFoundError` / `ClassNotFoundException` — Run `java` from the correct directory or use the correct package-qualified class name.
- `package does not exist` / `cannot find symbol` — You likely compiled from the wrong folder or didn’t preserve package structure with `-d`.

## Tips for learning

- Start by running one file at a time. Read the code, change it, and run again.
- Add short comments explaining what each part does — writing helps memory.
- Use the single-file `java` run for quick tests; use `javac` + `-d` when learning about packages.
- When you see multiple errors, start by fixing the first one — later errors often come from the first issue.

## How to contribute

- Add small, focused examples that match the repository style (one concept per file).
- Name files clearly, e.g., `loops_for_example.java`.
- Add a short comment at the top of the file explaining what it demonstrates and how to run it.
- Open a pull request with a brief description of the new example.

## License

This repository is for learning and examples. Add a `LICENSE` file if you want to apply an open-source license.

---

If you want, I can also:

- Add a `run-all.sh` script that compiles and runs a selection of examples.
- Add short README headers inside each folder with per-folder run instructions.

Tell me which of these you'd like next and I'll implement it.

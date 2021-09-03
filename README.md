# 03 - Static Code Analysis P2

In this section, we'll look at the static code analysis tools PMD (Programming Mistakes Detector) & SpotBugs.

## PMD
As per the PMD [website](https://pmd.github.io/) - 

PMD is a source code analyzer. It finds common programming flaws like unused variables, empty catch blocks, unnecessary object creation, and so forth.

## SpotBugs
As per the SpotBugs [website](https://spotbugs.readthedocs.io/en/stable/introduction.html) - 

SpotBugs is a program to find bugs in Java programs. It looks for instances of “bug patterns” — code instances that are likely to be errors.

## Gradle Plugin

The gradle plugin for PMD can be added to a project by following instructions [here](https://docs.gradle.org/current/userguide/pmd_plugin.html)

The gradle plugin for PMD can be added to a project by following instructions [here](https://plugins.gradle.org/plugin/com.github.spotbugs)

Once added and after reloading the Gradle project in the Gradle tool window, the following tasks should show up -

pmdMain 
pmdTest
spotbugsMain
spotbugsTest

## Results

Unlike with Checkstyle, these plugins require no additional files. When each task finds violations, it exits with failure. This is important because, eventually, when we setup the CI pipeline for this repository, we want builds to fail if the code does not pass these quality gates. 

As an easy-to-understand example, add the below function to any class. You will find that both PMD and SpotBugs tasks will fail, thereby protecting against buggy code being released - 

```
void bug() {
    List obj = null;
    while (obj.contains(true)) {

    }
  }
```

While this may be an oversimplification, exceptions like these can sneak into your code base. Though these tools may not foolproof your code base by 100%, they provide a measure of confidence while releasing code. 

## Summary 

You are now aware of how live environments can be protected from code perhaps written by a tired developer (in dire need of some coffee) can be    

Thank you for reading this!

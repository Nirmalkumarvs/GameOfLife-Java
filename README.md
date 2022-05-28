# Game Of Life 


# Problem Description
```
The Game of Life, also known simply as Life, is a cellular
automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells,
where each cell has an initial state: live (represented by a 1) or dead 
(represented by a 0). Each cell interacts with its eight neighbors 
(horizontal, vertical, diagonal) using the following 
four rules (taken from the above Wikipedia article):

    - Any live cell with fewer than two live neighbors dies 
      as if caused by under-population.
      
    - Any live cell with two or three live neighbors 
      lives on to the next generation.
      
    - Any live cell with more than three live 
      neighbors dies, as if by over-population.

    - Any dead cell with exactly three live neighbors 
      becomes a live cell, as if by reproduction.

    - The next state is created by applying the above 
      rules simultaneously to every cell in the current state, 
      where births and deaths occur simultaneously. 
```

# Prerequisites
* java version "17"
* Gradle 7.4.2


# Build instructions
Build the project : `gradle build` <br>
Build the project after cleaning : `gradle clean build`


# Run instructions
Run all test : `gradle test` <br>
Run all test after cleaning : `gradle test` 


#### Add these to show testcases passing in console

```import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

test {

    testLogging {
        events TestLogEvent.FAILED,
                TestLogEvent.PASSED,
                TestLogEvent.SKIPPED,
                TestLogEvent.STANDARD_ERROR,
                TestLogEvent.STANDARD_OUT
        exceptionFormat TestExceptionFormat.FULL
        showCauses true
        showExceptions true
        showStackTraces true
    }
    useJUnitPlatform()
}
```
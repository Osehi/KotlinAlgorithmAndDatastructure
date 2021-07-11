package whatisalgorithm


/**
 * Lesson 1: Difference between Algorithm and Program
 * In my own words Algorithm is a step-by-step instruction given
 * to perform a task.
 * Program is the execution of the written algorithm.
 * => The first step to programming is to design it.
 * => I will give a quick summary of it.
 * Algorithm VERSUS Program
 * Design => Implementation
 * Domain Knowledge => Programmer
 * Any Language => Programming Language
 * No HW & OS => Needs a HW & OS
 * Analysis => Testing
 * +++ Characteristics of Algorithm
 * a. Input, Output, Definiteness, Finiteness, Effectiveness
 *
 */
fun main(){

}

fun howToAnalyzeAlgorithm(firstElem:Int, secondElem:Int){
    var captureFirst = firstElem
    var captureSecond = secondElem
    /**
     * Basically you use TIME and SPACE complexity to analyze an
     * algorithm.
     * => How do you analyze the TIME.
     * => Every statement in algorithm takes 1unit of tome.
     *
     */

    // this is a statement
    var temp = captureFirst   // --------- the time instance of this statement is 1
     captureFirst = captureSecond // --- the time instance of this statement is 1
    captureSecond = temp // --- the time instance of this statement is 1

    // the time complexity
    // f(t) = 3.

    // to measure space complexity
    // this means the number of variables used or created
    // temp --- 1, captureFirst --- 2, captureSecond --- 3
    // f(s) = 3.


}
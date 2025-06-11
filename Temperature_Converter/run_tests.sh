#!/bin/bash

# This script automates the compilation and execution of JUnit 4 tests
# It expects to be run from the directory containing your Java source files
# (e.g., Calculator.java, CalculatorTest.java) and a 'lib' subdirectory
# containing the JUnit and Hamcrest JARs.

# --- Configuration ---
# Define the path to your JUnit 4 JARs relative to this script's location
JUNIT_JAR="/home/ramirez/Java_Language/lib/junit-4.13.2.jar"
HAMCREST_JAR="/home/ramirez/Java_Language/lib/hamcrest-core-1.3.jar"

# --- Function to display usage ---
usage() {
    echo "Usage: $0 <TestClassName>"
    echo "Example: $0 CalculatorTest"
    echo "This will compile all .java files in the current directory"
    echo "and then run the specified JUnit test class."
    exit 1
}

# --- Check for arguments ---
if [ -z "$1" ]; then
    usage
fi

TEST_CLASS_NAME="$1"

# --- Verify JARs exist ---
if [ ! -f "$JUNIT_JAR" ] || [ ! -f "$HAMCREST_JAR" ]; then
    echo "Error: JUnit or Hamcrest JARs not found!"
    echo "Please ensure '$JUNIT_JAR' and '$HAMCREST_JAR' exist in your current directory."
    echo "You might need to download them and place them in the 'lib/' folder."
    exit 1
fi

# Construct the classpath
CLASSPATH=".:${JUNIT_JAR}:${HAMCREST_JAR}"

echo "--- Compiling Java files ---"
# Compile all .java files in the current directory
# This ensures both Calculator.java and CalculatorTest.java (and any others) are compiled
javac -cp "$CLASSPATH" *.java

# Check if compilation was successful
if [ $? -ne 0 ]; then
    echo "Compilation failed. Please fix errors in your Java code."
    exit 1
fi
echo "Compilation successful!"

echo "--- Running JUnit tests for ${TEST_CLASS_NAME} ---"
# Run the JUnit tests using JUnitCore runner
java -cp "$CLASSPATH" org.junit.runner.JUnitCore "$TEST_CLASS_NAME"

# Check if tests ran successfully (JUnitCore itself might exit with 0 even if tests fail)
if [ $? -ne 0 ]; then
    echo "Tests encountered an issue during execution."
else
    echo "Tests completed. Check JUnit output above for results."
fi



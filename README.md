<h1>Study Of Java Unit Tests</h1>
<p>
  Repository focused on the study and practice of Java unit testing using the <strong>JUnit 5</strong> framework.<br />
  Includes simple examples, assertions, class validation, and integration with code coverage tools like EclEmma.
</p>
<h2>🔍 Covered Concepts</h2>
<ul>
  <li>Project structure for unit testing (<code>src/main/java</code> and <code>src/test/java</code>);</li>
  <li>Basic unit tests using <code>assertEquals</code> and <code>assertNotEquals</code>;</li>
  <li>Test classes simulating real-world entities (like <code>Client</code>);</li>
  <li>Filtering logic validation through unit tests (<code>FilterByGenderTest</code>);</li>
  <li>Code coverage analysis using EclEmma plugin (Eclipse);</li>
  <li>Javadoc and inline comments included for clarity.</li>
</ul>
<h2>🗂️ Project Structure</h2>
<ul>
  <li><code>br.com.eaugusto</code>: Base package containing the <code>ClientTest</code> class and its test counterpart;</li>
  <li><code>br.com.eaugusto.coursetask</code>: Contains the <code>Person</code> class and the <code>FilterByGender</code> logic, as well as its corresponding test class.</li>
</ul>
<h2>🚀 How to Run</h2>
<ol>
  <li>Clone this repository;</li>
  <li>Import into an IDE that supports JUnit 5 (e.g., Eclipse with EclEmma, IntelliJ);</li>
  <li>Right-click test classes (e.g., <code>FirstTest</code>, <code>TestClientTest</code>, <code>FilterByGenderTest</code>) and run them as JUnit tests;</li>
  <li>Use EclEmma to view code coverage and validate test effectiveness.</li>
</ol>
<h2>📅 Commit Highlights</h2>
<h3>June 20, 2025</h3>
<ul>
  <li>Created <code>FilterByGenderTest</code> to verify correct filtering of a list of people by gender.</li>
  <li>Implemented <code>FilterByGender</code> and <code>Person</code> classes in the <code>coursetask</code> package with simple parsing logic.</li>
  <li>Developed <code>ClientTest</code> and <code>TestClientTest</code> to simulate and test a basic data class, organized under the main/test packages.</li>
  <li>Set up the project for testing with JUnit 5 and created the initial <code>FirstTest</code> with basic assertions.</li>
</ul>
<h2>📚 Learning Goals</h2>
<ul>
  <li>Understand the structure of Java projects with unit testing in place;</li>
  <li>Learn how to write meaningful assertions and interpret test results;</li>
  <li>Get started with test coverage tools to measure how well your code is tested;</li>
  <li>Apply unit testing to real-world-like business logic, such as filtering operations.</li>
</ul>

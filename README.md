<h1>Study Of Java Unit Tests</h1>
<p>
  Repository focused on the study and practice of Java unit testing using the <strong>JUnit 5</strong> framework.<br />
  Includes practical examples of assertions, layered architecture with services and DAOs, and integration with code coverage tools like EclEmma.
  Made using Spring Tools Suite 4.
</p>
<h2>🔍 Covered Concepts</h2>
<ul>
  <li>Project structure for unit testing (<code>src/main/java</code> and <code>src/test/java</code>);</li>
  <li>Basic unit tests using <code>assertEquals</code> and <code>assertNotEquals</code>;</li>
  <li>Tests for business logic through service and DAO abstraction layers;</li>
  <li>Use of <code>Mock</code> implementations to simulate success and failure scenarios;</li>
  <li>Filtering logic validation through unit tests (<code>FilterByGenderTest</code>);</li>
  <li>Code coverage analysis using EclEmma plugin (Eclipse);</li>
  <li>Javadoc and inline comments included for clarity.</li>
</ul>
<h2>🗂️ Project Structure</h2>
<ul>
  <li><code>br.com.eaugusto</code>: Contains <code>ClientTest</code> and its unit test <code>TestClientTest</code>;</li>
  <li><code>br.com.eaugusto.coursetask</code>: Contains <code>Person</code>, <code>FilterByGender</code>, and related tests;</li>
  <li><code>br.com.eaugusto.mocks.dao</code> / <code>service</code>: DAO and service layer interfaces and mock implementations for <code>Client</code> testing;</li>
  <li><code>br.com.eaugusto.mockstests.service</code>: Unit tests for client service behavior (success/failure);</li>
  <li><code>br.com.eaugusto.contract.dao</code> / <code>service</code>: Interface definitions and mock/realistic DAO implementations for <code>Contract</code> logic;</li>
  <li><code>br.com.eaugusto.contracttests</code>: Contains <code>ContractServiceTest</code>, testing all contract-related functionality.</li>
</ul>
<h2>🚀 How to Run</h2>
<ol>
  <li>Clone this repository;</li>
  <li>Import into an IDE that supports JUnit 5 (e.g., Eclipse with EclEmma, IntelliJ);</li>
  <li>Run test classes (e.g., <code>FirstTest</code>, <code>TestClientTest</code>, <code>ClientServiceTest</code>, <code>ContractServiceTest</code>);</li>
  <li>Use EclEmma to verify test coverage and validate implementation.</li>
</ol>
<h2>📅 Commit Highlights</h2>
<h3>June 20, 2025</h3>
<ul>
  <li>Added search, delete, and edit methods to <code>ContractService</code>, with full unit test coverage.</li>
  <li>Created service and DAO layers for <code>Contract</code>, including mock and exception-based implementations.</li>
  <li>Developed <code>ClientService</code> and corresponding unit tests with dependency injection and mock DAO use.</li>
</ul>
<h3>June 19, 2025</h3>
<ul>
  <li>Added <code>FilterByGenderTest</code> to check gender-based filtering accuracy;</li>
  <li>Created <code>FilterByGender</code> and <code>Person</code> in the <code>coursetask</code> package with parsing logic;</li>
  <li>Implemented <code>ClientTest</code> and <code>TestClientTest</code> with basic structure and coverage;</li>
  <li>Initialized the project with <code>FirstTest</code> and integrated JUnit 5 and EclEmma.</li>
</ul>
<h2>📚 Learning Goals</h2>
<ul>
  <li>Understand and structure Java projects with unit testing and test source folders;</li>
  <li>Learn to write assertions using JUnit 5 and analyze code behavior through testing;</li>
  <li>Practice service and DAO patterns with mock implementations and exception handling;</li>
  <li>Use test coverage tools to ensure testing effectiveness and code reliability.</li>
</ul>

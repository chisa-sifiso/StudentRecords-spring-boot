<h1>StudentRecords Spring Boot</h1>

<p>This is a Spring Boot application for managing student records. The app allows you to create, update, delete, and view student information. It uses Spring Data JPA to connect to an H2 in-memory database and provides a RESTful API with Swagger for easy testing and documentation.</p>

<h2>Features</h2>
<ul>
    <li>Create, Read, Update, and Delete (CRUD) operations for student records</li>
    <li>RESTful API endpoints</li>
    <li>H2 in-memory database for testing and development</li>
    <li>Swagger integration for API documentation</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li>Java 17</li>
    <li>Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>H2 Database</li>
    <li>Swagger (Springdoc OpenAPI)</li>
</ul>

<h2>Getting Started</h2>
<p>Follow these steps to get the application up and running on your local machine.</p>

<h3>Prerequisites</h3>
<ul>
    <li>Java 17 installed</li>
    <li>Maven installed</li>
</ul>

<h3>Installation</h3>
<ol>
    <li>Clone the repository:
        <pre><code>git clone https://github.com/chisa-sifiso/StudentRecords-spring-boot.git</code></pre>
    </li>
    <li>Navigate to the project directory:
        <pre><code>cd StudentRecords-spring-boot</code></pre>
    </li>
    <li>Build the project using Maven:
        <pre><code>mvn clean install</code></pre>
    </li>
    <li>Run the application:
        <pre><code>mvn spring-boot:run</code></pre>
    </li>
</ol>

<h2>Using the API</h2>
<p>Once the application is running, you can access the API documentation through Swagger at:</p>
<pre><code>http://localhost:8080/swagger-ui.html</code></pre>

<h3>Example API Endpoints</h3>
<ul>
    <li><strong>Get all students</strong>: <code>GET /api/students</code></li>
    <li><strong>Add a new student</strong>: <code>POST /api/students</code></li>
    <li><strong>Get a student by ID</strong>: <code>GET /api/students/{id}</code></li>
    <li><strong>Update a student</strong>: <code>PUT /api/students/{id}</code></li>
    <li><strong>Delete a student</strong>: <code>DELETE /api/students/{id}</code></li>
</ul>

<h2>Database Configuration</h2>
<p>The application uses an H2 in-memory database, which can be accessed at:</p>
<pre><code>http://localhost:8080/h2-console</code></pre>
<p>Use the following credentials:</p>
<ul>
    <li><strong>JDBC URL</strong>: <code>jdbc:h2:mem:testdb</code></li>
    <li><strong>Username</strong>: <code>sa</code></li>
    <li><strong>Password</strong>: <code>password</code></li>
</ul>

<h2>Contributing</h2>
<p>Contributions are welcome! Please fork the repository and create a pull request with your changes.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

# TornadoFX Multiplatform Fat Jar Example (Maven)

This project shows an example of packaging a TornadoFX application into a fat jar with maven that can be run on Windows, Mac or Linux.

### Building
`mvn install`

### Running
Make sure you have java installed

#### Linux & Mac
`java -jar target/tornadofx-multiplatform-fat-jar-1.0-SNAPSHOT.jar`
#### Windows
`java -jar target\tornadofx-multiplatform-fat-jar-1.0-SNAPSHOT.jar`


## Inspiration
I wanted to find a simple example like this when writing a TornadoFX application but failed to find anything. Decided someone else might be frustrated with all the mismatched documentation lurking around for TornadoFX and so I share my solution here. 
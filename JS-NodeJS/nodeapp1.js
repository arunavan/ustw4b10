console.log("welcome to node js");
var http = require("http");

//import http from 'http'
http.createServer(function (request, response) {
       response.writeHead(200, {'Content-Type': 'text/plain'});
       response.end('Hello World\n');
 }).listen(8086);
 
 // Console will print the message
 console.log('Server running at http://127.0.0.1:8086/');

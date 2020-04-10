const { BehaviorSubject } = require('rxjs');

// ---------------------------------------------------------------------

// Observe a target object. Do something, when the object is manipulated


function doSomethingA(obj) { console.log("I do like " + obj); }
function doSomethingB(obj) { console.log("I don't like " + obj); }
var targetObject = "strawberry";

var subject = new BehaviorSubject(targetObject);
subject.subscribe(doSomethingA);

// output:
// I do like strawberry

subject.subscribe(doSomethingB);

// output
// I don't like strawberry

subject.next("cheesecake");

// output: 
// I do like cheesecake
// I don't like cheesecake 

subject.next("nutella");

// output: 
// I do like nutella
// I don't like nutella

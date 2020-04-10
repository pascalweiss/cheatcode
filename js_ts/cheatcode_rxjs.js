const { BehaviorSubject } = require('rxjs');

// ---------------------------------------------------------------------

// Observe a target object. Do something, when the object is manipulated


function doSomethingA(obj) { console.log("I do like " + obj); }
function doSomethingB(obj) { console.log("I don't like " + obj); }
var targetObject = "";

var subject = new BehaviorSubject(targetObject);
subject.subscribe(doSomethingA);
subject.subscribe(doSomethingB);

subject.next("cheesecake");

// output: 
// I do like cheesecake
// I don't like cheesecake 

subject.next("nutella");

// output: 
// I do like nutella
// I don't like nutella

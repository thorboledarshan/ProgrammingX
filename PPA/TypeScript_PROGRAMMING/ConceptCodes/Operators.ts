import PromptSync from "prompt-sync";

const accept = PromptSync();

//Arithematic
let a:number = 10;
let b:number = 3;

console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);
console.log(a % b);

// Assignment 
let x:number = 10;
x += 5;
console.log(x);

//Relational
console.log(a < b);      //return true or false

//Logical
let age:number = 23;
let hasID:boolean = true;

console.log(age >= 18 && hasID);

//Increment/ Decrement
let i:number = 5;
console.log(i++);
console.log(i);

//Ternary
let age1:number = 23;

let result =
(age1 >= 18) ? "Adult" : "Minor";

console.log(result);

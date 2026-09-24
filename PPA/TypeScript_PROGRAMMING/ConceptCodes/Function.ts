import PromptSync from "prompt-sync";

const accept = PromptSync();

//Normal Function
function CheckEven(no:number):boolean
{
    return (no % 2 === 0);
}

let result:boolean = CheckEven(10);

console.log(result);


//Arrow Function

//Parameterized
const Add = (a:number,b:number):number =>
{
    return a+b;
}

let Ans:number = Add(10,20);
console.log(`Addition is : ${Ans}`);

//Default 
const Display = ():void =>
{
    console.log("Hello");
}

Display();



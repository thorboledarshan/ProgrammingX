import PromptSync from "prompt-sync";

const accept = PromptSync();

//if-else
let age:number = 15;

if(age >= 18)
{
    console.log("Adult");
}
else
{
    console.log("Minor");
}


//Switch
let day:number = 1;

switch(day)
{
    case 1:
        console.log("Monday");
        break;

    case 2:
        console.log("Tuesday");
        break;

    default:
        console.log("Invalid");
}
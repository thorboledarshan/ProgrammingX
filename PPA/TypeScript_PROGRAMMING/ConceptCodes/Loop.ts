import PromptSync from "prompt-sync";

const accept = PromptSync();


//For loop
let i:number = 0;
for(i = 1; i <= 5; i++)
{
    console.log(i);
}

//for...of loop(gives values of array)
let arr:number[] = [10,20,30];
for(let value of arr)
{
    console.log(value);
}

//for...in loop(gives index of array)
let arr1:number[] = [10,20,30];
for(let index in arr1)
{
    console.log(index);
}
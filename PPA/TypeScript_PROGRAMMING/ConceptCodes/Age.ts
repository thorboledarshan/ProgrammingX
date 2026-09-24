import PromptSync from "prompt-sync";


class CheckAge
{
  public CheckAge(Age:number):boolean
  {
    return Age >= 18;  
  }
}
const accept = PromptSync();

let Value:number = 0;
Value = Number(accept("Enter your age : "));

let obj = new CheckAge();

let Result:boolean = false;
Result = obj.CheckAge(Value);

if(Result)
{
  console.log("Adult");
}
else
{
    console.log("Not Adult");
}        


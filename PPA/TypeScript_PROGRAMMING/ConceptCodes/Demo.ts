import PromptSync from "prompt-sync";

class Add
{
    public Add(No1:number,No2:number)
    {
        return No1 + No2;
    }
}

//Scanner sc = new Scanner(System.in)
const accept = PromptSync();

//System.out.println("Enter first number : ")
//int No1 = sc.nextInt();
let Value1:number = 0;
Value1 = Number(accept("Enter first number :"));

//System.out.println("Enter second number : ")
//int No2 = sc.nextInt();
let Value2:number = 0;
Value2 = Number(accept("Enter second number :"));

let obj = new Add();

let Result:number = 0;
Result = obj.Add(Value1,Value2);
console.log("Sum is :",Result);

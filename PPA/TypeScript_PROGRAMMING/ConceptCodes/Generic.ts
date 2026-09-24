//Generic Function

function Identity<T>(value:T):T
{
    return value;
}

console.log(Identity<number>(100));

console.log(Identity<string>("Darshan"));

console.log(Identity<boolean>(true));


//Generic Class
class Box<T>
{
    value:T;

    constructor(value:T)
    {
        this.value = value;
    }

    Display():void
    {
        console.log(this.value);
    }
}

let box = new Box<number>(100);

box.Display();

//Example
class Stack<T>
{
    private items:T[] = [];

    Push(item:T):void
    {
        console.log(item);
        this.items.push(item);
    }

    Pop():T | undefined
    {
        return this.items.pop();
    }
    
}

let Sobj = new Stack<number>(); 
Sobj.Push(1);
Sobj.Push(11);
console.log(Sobj.Pop());
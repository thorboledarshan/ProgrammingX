abstract class Demo
{
    abstract Display():void;
}

class Child extends Demo
{
    Display():void
    {
        console.log("Hello");
    }
}

let obj = new Child();
obj.Display();
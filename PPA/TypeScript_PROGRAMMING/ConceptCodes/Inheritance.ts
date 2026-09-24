class Parent
{
    Display():void
    {
        console.log("Parent");
    }
}

class Child extends Parent
{
}

let obj = new Child();

obj.Display();
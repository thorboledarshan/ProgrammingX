//interface
interface Student
{
    name:string;
    age:number;

    Display():void;
}

let obj:Student = 
{
  name:"Darshan",
  age:23,

  Display() 
  {
    console.log("Hello");
    console.log(obj.name);
    console.log(this.age);
  }
};

obj.Display();

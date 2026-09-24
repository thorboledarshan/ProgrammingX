//Default Constructor
class Student
{
    constructor()
    {
        console.log("Constructor Called");
    }
}



//Parameterized
class Student1
{
    name:string;

    constructor(name:string)
    {
        this.name = name;
        console.log(name);
    }
}

let obj = new Student();
let obj1 = new Student1("Darshan");


//Object Literal
let student = {
    name : "Darshan",
    age : 23
};

console.log(student.name);

//Update
student.age = 24;
console.log(student.age);

//Objects with Methods
let student1 =
{
    name: "Darshan",

    Display()
    {
        console.log(this.name);  //this keyword
    }
};

student1.Display();

//Nested objects
let student2 =
{
    name:"Darshan",

    address:
    {
        city:"Pune",
        state:"Maharashtra"
    }
};

console.log(student2.address.city);

//Array of objects
let students =
[
    {
        name:"Darshan",
        age:23
    },

    {
        name:"Amit",
        age:22
    }
];

console.log(students[0].name);

//Nested Objects (API example)
type User =
{
    id:number;
    username:string;
    email:string;

    address:
    {
        city:string;
        zipcode:string;
    };

    skills:string[];
};
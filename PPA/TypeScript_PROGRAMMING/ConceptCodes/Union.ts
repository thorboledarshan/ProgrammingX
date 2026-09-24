let data: number | string;

data = 100;
console.log(data);

data = "Hundred";
console.log(data);


//Type Narrowing
let value: string | number = "Darshan";

if(typeof value === "string")
{
    console.log(value.toUpperCase());
}

//Type Aliases
type Student = {
    name: string;
    age: number;
};

let s1: Student = {
    name: "Om",
    age: 23
};

console.log(s1.name);
const student =
{
    name:"Darshan",
    age:23,
    city:"pune"
};

type Student = typeof student;

const s:Student =
{
    name:"Amit",
    age:22,
    city:"Pune"
};

console.log(student);


//Generic example
function GetValue<T,K extends keyof T>
(
    obj:T,
    key:K
)
{
    return obj[key];
}
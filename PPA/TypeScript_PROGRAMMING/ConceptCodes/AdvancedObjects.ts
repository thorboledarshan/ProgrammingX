type Address =
{
    city:string;
    state:string;
    pincode?:number;
};

type Student =
{
    rollNo?:number;
    name:string;
    percentage:number;
    address:Address;
    skills:string[];
};

const s1:Student = 
{
    name:"Darshan",
    percentage:89,
    address:
    {
        city:"Pune",
        state:"Maharashtra"
    },
    skills:["java","Python","C"]
}

console.log(s1.name);
console.log(s1.percentage);
console.log(s1.address.city);
console.log(s1.skills[1]);

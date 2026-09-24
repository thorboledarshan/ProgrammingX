type employee = 
{
    id:number;
    name:string;
    salary:number;
    city:string
};

type student = 
{
    name:string;
    age:number
};

//update
let update:Partial<employee> = 
{
    city:"Mumbai"
}
console.log(update);

//required<T>
let s1:Required<student> = 
{
    name:"Darshan",
    age:23
}
console.log(s1);

//ReadOnly<T>
let s2:Readonly<student> = 
{
    name:"Ravi",
    age:21
}
console.log(s2);


//Pick<T,K>
type BasicInfo = Pick<employee,"name"|"city">;
const s3:BasicInfo = 
{
    name:"Tanya",
    city:"Pune"
}
console.log(s3);


//Omit<T,K>
type employeeWithoutCity = Omit<employee,"city">;
const s4:employeeWithoutCity = 
{
    id:1,
    name:"Darshan",
    salary:30000
}
console.log(s4);



//Record<K,T>  (Specified keys and values only)
type subject = Record<string,number>;
const marks:subject = 
{
    maths:87,
    hindi:89
}
console.log(marks);


type Result = "pass"|"fail"|"Pending";

//Exclude<T,U>
type FinalResult = Exclude<Result,"fail">;

//Extract<T,U>
type valid = Extract<Result,"pass">;

//NonNullable<T>
type name = string | null | undefined;

type validname = NonNullable<name>;
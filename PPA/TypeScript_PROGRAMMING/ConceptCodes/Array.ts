let arr:number[] = [10,20,30];

console.log(arr[0]);
console.log(arr[1]);
console.log(arr[2]);


//for-of Loop(gives values)
let arr1:number[] = [10,20,30];

for(let value of arr1)
{
    console.log(value);
}

//for-in Loop(gives index)
let arr2:number[] = [10,20,30];

for(let index in arr2)
{
    console.log(index);
}
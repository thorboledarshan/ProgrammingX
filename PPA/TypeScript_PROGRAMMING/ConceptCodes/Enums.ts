enum Status
{
    Success,
    Failed,
    Pending
}

function PrintStatus(status:Status):void
{
    console.log(status);
}

PrintStatus(Status.Success);
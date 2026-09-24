"use strict";
var Status;
(function (Status) {
    Status[Status["Success"] = 0] = "Success";
    Status[Status["Failed"] = 1] = "Failed";
    Status[Status["Pending"] = 2] = "Pending";
})(Status || (Status = {}));
function PrintStatus(status) {
    console.log(status);
}
PrintStatus(Status.Success);

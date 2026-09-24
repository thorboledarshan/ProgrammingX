const txtName =
document.querySelector("#name");

const txtAge =
document.querySelector("#age");

const txtAbout =
document.querySelector("#about");

const city =
document.querySelector("#city");

const chkAgree =
document.querySelector("#agree");

const btn =
document.querySelector("#btnShow");

document.body.classList.toggle("dark");

//style CSS
btn.style.backgroundColor = "green";
btn.style.color = "white";
btn.style.padding = "10px";
btn.style.border = "none";
btn.style.borderRadius = "5px";
btn.style.cursor = "pointer";
btn.style.height = "40px";


if(
    txtName &&
    txtAge &&
    txtAbout &&
    city &&
    chkAgree &&
    btn
)
{
    btn.addEventListener("click", () =>
    {
        console.log("Name :", txtName.value);
        console.log("Age :", txtAge.value);
        console.log("About :", txtAbout.value);
        console.log("City :", city.value);
        console.log("Agree :", chkAgree.checked);

        txtName.value = "Darshan";
        txtAge.value = "23";

    });
}




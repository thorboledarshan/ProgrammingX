    console.log("JavaScript Loaded"); //checking

    const form =
    document.querySelector("#studentForm");

    console.log(form); //checking

    const nameInput =
    document.querySelector("#name");

    const ageInput =
    document.querySelector("#age");

    const citySelect =
    document.querySelector("#city");

    const error =
    document.querySelector("#error");

    if(
        form &&
        nameInput &&
        ageInput &&
        citySelect &&
        error
    )
    {
        form.addEventListener("submit",(event)=>
        {
            event.preventDefault();
            console.log("Submit Clicked");   //checking
        
            const name = nameInput.value.trim();

            const age = Number(ageInput.value);

            const city = citySelect.value;

            if(name === "")
            {
                error.textContent = "Name Required";
                return;
            }

            if(age < 18)
            {
                error.textContent = "Age should be greater than 18";
                return;
            }
            if(city === "")
            {
                error.textContent = "Select at least one city";
                return;
            }

            const student =
            {
                name,

                age,

                city
            };
            console.log(student);

            alert("Registration Successful");
            form.reset();
            error.textContent = "";
        
        });
    }


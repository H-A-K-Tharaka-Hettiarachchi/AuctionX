async function logIn() {

    const loginDto = {
        username: document.getElementById("username").value,
        password: document.getElementById("password").value,
    };

    try {
        const response = await fetch("/auctionx-web/login", {
            method: "POST",
            body: JSON.stringify(loginDto),
            headers: {
                "Content-Type": "application/json"
            }
        });


        if (response.ok) {

            const json = await response.json();
            console.log(json);
            if (json.success) {
                window.location = "home.html"; // Redirect to home/dashboard
            } else {

                Swal.fire({
                    title: 'Error',
                    text: json.message,
                    icon: 'error',
                    confirmButtonText: 'Ok',
                    customClass: {
                        popup: 'swal2-popup',
                        confirmButton: 'swal2-confirm',
                        title: 'swal2-title'
                    }
                });

            }
        } else {
            Swal.fire({
                title: 'Error',
                text: "Oops, something went wrong.",
                icon: 'error',
                confirmButtonText: 'Ok',
                customClass: {
                    popup: 'swal2-popup',
                    confirmButton: 'swal2-confirm',
                    title: 'swal2-title'
                }
            });
        }
    } catch (error) {
        console.error("Login error:", error);
        Swal.fire({
            title: "Exception!",
            text: "Unable to connect to the server.",
            icon: "error",
            confirmButtonText: "Ok",
            customClass: {
                popup: 'swal2-popup',
                confirmButton: 'swal2-confirm',
                title: 'swal2-title'
            }
        });
    }
}


console.log('login.js loaded');
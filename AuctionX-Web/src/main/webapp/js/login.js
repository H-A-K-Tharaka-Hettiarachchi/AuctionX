// This is the external JavaScript file for your login page.
// The background animations are primarily handled by CSS.

document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('loginForm');

    // Example: Prevent default form submission and handle login via AJAX later
    loginForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Stop the browser from submitting the form normally

        // --- Add your login logic here ---
        // e.g., Get username and password
        // const username = document.getElementById('username').value;
        // const password = document.getElementById('password').value;

        // e.g., Send data to your Java EE backend using Fetch API or XMLHttpRequest
        // fetch('/login', {
        //     method: 'POST',
        //     headers: {
        //         'Content-Type': 'application/json',
        //     },
        //     body: JSON.stringify({ username: username, password: password }),
        // })
        // .then(response => response.json())
        // .then(data => {
        //     console.log('Login response:', data);
        //     // Handle success (e.g., redirect) or failure (e.g., show error message)
        // })
        // .catch((error) => {
        //     console.error('Error:', error);
        //     // Handle network errors
        // });
        // ----------------------------------

        console.log('Login form submitted (prevented default)');
        // You would typically perform validation and send an AJAX request here
    });

    // --- Add other JavaScript logic here ---
    // e.g., Animations on element visibility
    // e.g., Simple theme toggling (if implemented in CSS)
    // e.g., Input validation feedback
    // ------------------------------------

});

console.log('login.js loaded');
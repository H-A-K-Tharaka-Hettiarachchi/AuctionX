// This is the external JavaScript file for your signup page.
// The background animations are primarily handled by CSS.

document.addEventListener('DOMContentLoaded', function() {
    const signupForm = document.getElementById('signupForm');

    // Example: Prevent default form submission and handle signup via AJAX later
    signupForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Stop the browser from submitting the form normally

        // --- Add your signup logic here ---
        // e.g., Get username, email, password, confirm password
        // const username = document.getElementById('username').value;
        // const email = document.getElementById('email').value;
        // const password = document.getElementById('password').value;
        // const confirmPassword = document.getElementById('confirm-password').value;

        // e.g., Perform client-side validation (e.g., password match)
        // if (password !== confirmPassword) {
        //     alert("Passwords do not match!");
        //     return; // Stop submission
        // }

        // e.g., Send data to your Java EE backend using Fetch API or XMLHttpRequest
        // fetch('/signup', {
        //     method: 'POST',
        //     headers: {
        //         'Content-Type': 'application/json',
        //     },
        //     body: JSON.stringify({ username, email, password }), // Only send username, email, password
        // })
        // .then(response => response.json())
        // .then(data => {
        //     console.log('Signup response:', data);
        //     // Handle success (e.g., redirect to login) or failure (e.g., show error message)
        // })
        // .catch((error) => {
        //     console.error('Error:', error);
        //     // Handle network errors
        // });
        // ----------------------------------

        console.log('Signup form submitted (prevented default)');
        // You would typically perform validation and send an AJAX request here
    });

    // --- Add other JavaScript logic here ---
    // e.g., Real-time password validation feedback
    // e.g., Animations on element visibility
    // ------------------------------------

});

console.log('signup.js loaded');
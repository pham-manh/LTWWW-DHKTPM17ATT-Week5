function handleLogin(event) {
    event.preventDefault(); // Prevent the default form submission

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Simulate sending a request to the server
    fetch('/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: new URLSearchParams({
            'username': username,
            'password': password
        })
    })
    .then(response => {
        if (response.ok) {
            // Redirect to the candidate index page on successful login
            window.location.href = '/candidate/index';
        } else {
            // Show the fail dialog on login failure
            document.getElementById('login-fail-dialog').style.display = 'flex';
        }
    })
    .catch(error => {
        console.error('Error during login:', error);
        document.getElementById('login-fail-dialog').style.display = 'flex';
    });
}

function closeDialog() {
    document.getElementById('login-fail-dialog').style.display = 'none';
}
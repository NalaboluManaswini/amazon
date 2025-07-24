document.getElementById("loginForm").addEventListener("submit", function (e) {
  e.preventDefault();
  
  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value.trim();

  if (!username || !password) {
    alert("Please enter both username and password.");
    return;
  }

  // Dummy check – Replace this with actual backend authentication
  if (username === "admin" && password === "1234") {
    alert("Login successful!");
    // You can redirect here: window.location.href = "dashboard.html";
  } else {
    alert("Invalid username or password.");
  }
});

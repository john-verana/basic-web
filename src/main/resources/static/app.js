document.getElementById('hello-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    const name = document.getElementById('name').value || 'World';
    const res = await fetch(`/api/hello?name=${encodeURIComponent(name)}`);
    const data = await res.json();
    document.getElementById('output').textContent = `${data.message} (at ${data.time})`;
});

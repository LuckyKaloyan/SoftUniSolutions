function validate() {
    function validateEmail() {
        let input = document.getElementById('email').value;
        let regex = /^[a-z]+@[a-z]+\.[a-z]+$/;

        if (!regex.test(input)) {
            document.getElementById('email').classList.add('error');
        } else {
            document.getElementById('email').classList.remove('error');
        }
    }
    document.getElementById('email').addEventListener('change', validateEmail);
}
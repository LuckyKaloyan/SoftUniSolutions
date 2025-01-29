function focused() {
    let inputs = document.querySelectorAll('input');

    inputs.forEach(function(input) {
        input.addEventListener('focus', function(e) {
            document.querySelectorAll('div').forEach(function(div) {
                div.classList.remove('focused');
            });

            let parentDiv = e.target.closest('div');
            if (parentDiv) {
                parentDiv.classList.add('focused');
            }
        });

        input.addEventListener('blur', function(e) {
            let parentDiv = e.target.closest('div');
            if (parentDiv) {
                parentDiv.classList.remove('focused');
            }
        });
    });
}

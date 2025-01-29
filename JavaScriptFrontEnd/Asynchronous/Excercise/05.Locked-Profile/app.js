function lockedProfile() {
    fetch('http://localhost:3030/jsonstore/advanced/profiles')
        .then(response => response.json())
        .then(data => {
            let array = Object.values(data);
            const mainContainer = document.getElementById('main');
            mainContainer.innerHTML = '';

            array.forEach(profile => {

                let profileDiv = document.createElement('div');
                profileDiv.className = 'profile';
                profileDiv.innerHTML = `
                    <img src="./iconProfile2.png" class="userIcon" />
                    <label>Lock</label>
                    <input type="radio" name="userLocked${profile._id}" value="lock" checked>
                    <label>Unlock</label>
                    <input type="radio" name="userLocked${profile._id}" value="unlock"><br>
                    <hr>
                    <label>Username</label>
                    <input type="text" name="userUsername${profile._id}" value="${profile.username}" disabled readonly />
                    <div class="user1Username">
                        <hr>
                        <label>Email:</label>
                        <input type="email" name="userEmail${profile._id}" value="${profile.email}" disabled readonly />
                        <label>Age:</label>
                        <input type="text" name="userAge${profile._id}" value="${profile.age}" disabled readonly />
                    </div>
                    <button>Show more</button>
                `;

                mainContainer.appendChild(profileDiv);


                let showMoreBtn = profileDiv.querySelector('button');
                showMoreBtn.addEventListener('click', () => {
                    let isLocked = profileDiv.querySelector(`input[name="userLocked${profile._id}"]:checked`).value === 'lock';
                    if (!isLocked) {
                        let hiddenInfo = profileDiv.querySelector('.user1Username');
                        hiddenInfo.style.display = hiddenInfo.style.display === 'none' ? 'block' : 'none';
                    }
                });
            });
        })
        .catch(error => console.error('Error fetching profiles:', error));
}

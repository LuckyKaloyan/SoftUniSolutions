function createAccordionItem(article, details) {
    const accordionDiv = document.createElement('div');
    accordionDiv.classList.add('accordion');

    const headDiv = document.createElement('div');
    headDiv.classList.add('head');

    const titleSpan = document.createElement('span');
    titleSpan.textContent = article.title;

    const button = document.createElement('button');
    button.classList.add('button');
    button.textContent = 'More';
    button.setAttribute('data-id', article._id);

    headDiv.appendChild(titleSpan);
    headDiv.appendChild(button);

    const extraDiv = document.createElement('div');
    extraDiv.classList.add('extra');
    extraDiv.style.display = 'none';

    if (details) {
        const contentParagraph = document.createElement('p');
        contentParagraph.textContent = details.content;
        extraDiv.appendChild(contentParagraph);
    }

    accordionDiv.appendChild(headDiv);
    accordionDiv.appendChild(extraDiv);

    button.addEventListener('click', () => toggleContent(button, extraDiv));

    return accordionDiv;
}

function toggleContent(button, extraDiv) {
    const isHidden = extraDiv.style.display === 'none';
    extraDiv.style.display = isHidden ? 'block' : 'none';
    button.textContent = isHidden ? 'Less' : 'More';
}

function fetchArticleDetails(articleId) {
    return fetch(`http://localhost:3030/jsonstore/advanced/articles/details/${articleId}`)
        .then(response => response.json());
}

function fetchAllArticleDetails(articles) {
    const detailPromises = articles.map(article => fetchArticleDetails(article._id));
    return Promise.all(detailPromises);
}

function populateAccordion(articles, detailsArray) {
    const fragment = document.createDocumentFragment();

    articles.forEach((article, index) => {
        const accordionItem = createAccordionItem(article, detailsArray[index]);
        fragment.appendChild(accordionItem);
    });

    const mainSection = document.getElementById('main');
    mainSection.appendChild(fragment);
}

function fetchArticles() {
    fetch('http://localhost:3030/jsonstore/advanced/articles/list')
        .then(response => response.json())
        .then(articles => {
            return fetchAllArticleDetails(articles).then(detailsArray => ({
                articles,
                detailsArray
            }));
        })
        .then(({ articles, detailsArray }) => {
            populateAccordion(articles, detailsArray);
        })
        .catch(error => console.error('Error fetching articles:', error));
}

document.addEventListener('DOMContentLoaded', fetchArticles);

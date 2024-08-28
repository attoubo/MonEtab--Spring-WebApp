// script.js
document.addEventListener('DOMContentLoaded', function() {
    // Gestion de la connexion
    const loginForm = document.getElementById('loginForm');
    if (loginForm) {
        loginForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const username = document.getElementById('username').value;
            const password = document.getElementById('password').value;
            if (username === 'admin' && password === 'admin') {
                window.location.href = '/login';
            } else {
                alert('Identifiant ou mot de passe incorrect');
            }
        });
    }

    // Génération des boîtes de statistiques
    const statsContainer = document.getElementById('statsContainer');
    if (statsContainer) {
        const stats = [
            { title: "Nombre d'élève", value: "128,100" },
            { title: "Nombre de professeur", value: "128,100" },
            { title: "Nombre d'utilisateur", value: "128,100" },
            { title: "Élève par genre", value: "<div id='piechart'></div>" }
        ];

        stats.forEach(stat => {
            const statBox = document.createElement('div');
            statBox.className = 'stat-box';
            statBox.innerHTML = `<h3>${stat.title}</h3><p>${stat.value}</p>`;
            statsContainer.appendChild(statBox);
        });
    }

    // Gestion de la déconnexion
    const logoutBtn = document.getElementById('logout');
    if (logoutBtn) {
        logoutBtn.addEventListener('click', function() {
            window.location.href = 'login.html';
        });
    }
});



 google.charts.load('current', {'packages':['corechart']});
         google.charts.setOnLoadCallback(drawChart);

         function drawChart() {
             var data = google.visualization.arrayToDataTable([
                 ['Genre', 'Nombre'],
                 ['Homme', 70000],
                 ['Femme', 58100]
             ]);

             var options = {
                 title: 'Élève par genre'
             };

             var chart = new google.visualization.PieChart(document.getElementById('piechart'));
             chart.draw(data, options);
 }




<!-- Intégration de Google Charts -->
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
    var data = google.visualization.arrayToDataTable([
    ['Genre', 'Nombre'],
    ['Homme', /*[[${eleveHommeCount}]]*/ 70],
    ['Femme', /*[[${eleveFemmeCount}]]*/ 30]
    ]);

    var options = {
    title: 'Élèves par genre'
};

    var chart = new google.visualization.PieChart(document.getElementById('piechart'));
    chart.draw(data, options);
}







// script.js
document.addEventListener('DOMContentLoaded', function() {
    // Gestion de la déconnexion
    const logoutBtn = document.getElementById('logout');
    if (logoutBtn) {
        logoutBtn.addEventListener('click', function() {
            window.location.href = 'login.html';
        });
    }

    // Gestion de l'ajout d'un élève
    const addStudentForm = document.getElementById('addStudentForm');
    if (addStudentForm) {
        addStudentForm.addEventListener('submit', function(event) {
            event.preventDefault();
            // Logique pour ajouter un élève
            alert('Élève ajouté avec succès');
        });
    }

    // Gestion du bouton Annuler
    const cancelBtn = document.getElementById('cancel');
    if (cancelBtn) {
        cancelBtn.addEventListener('click', function() {
            window.location.href = '/';
        });
    }
});






// Fonction pour afficher le pop-up avec l'ID du professeur
// function showConfirmationPopup(teacherId) {
//     const popup = document.getElementById("confirmationPopup");
//     document.getElementById("teacherIdToDelete").value = teacherId; // Stocke l'ID du professeur
//     popup.style.display = "block"; // Affiche le pop-up
// }
//
// // Événements pour les boutons dans le pop-up
// document.getElementById("cancelBtn").addEventListener("click", hideConfirmationPopup);
// document.getElementById("confirmBtn").addEventListener("click", function() {
//     const teacherId = document.getElementById("teacherIdToDelete").value;
//     fetch(`/teachers/delete/${teacherId}`, {
//         method: 'DELETE',
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     })
//         .then(response => {
//             if (response.ok) {
//                 window.location.reload(); // Recharge la page pour refléter la suppression
//             } else {
//                 alert('Une erreur s\'est produite lors de la suppression du professeur.');
//             }
//         })
//         .catch(error => {
//             console.error('Erreur:', error);
//         });
//     hideConfirmationPopup(); // Cache le pop-up
// });
//
// // Fonction pour masquer le pop-up
// function hideConfirmationPopup() {
//     const popup = document.getElementById("confirmationPopup");
//     popup.style.display = "none"; // Cache le pop-up
// }



// Assurez-vous que le pop-up est caché au chargement de la page
window.onload = function() {
    hideConfirmationPopup();
};

function showConfirmationPopup(id, type) {
    const popup = document.getElementById("confirmationPopup");
    popup.style.display = "block"; // Afficher la pop-up

    const form = document.getElementById("deleteForm");
    form.action = (type === 'teacher' ? '/teachers/delete/' : '/students/delete/') + id;
}

function hideConfirmationPopup() {
    const popup = document.getElementById("confirmationPopup");
    popup.style.display = "none"; // Hide the pop-up
}

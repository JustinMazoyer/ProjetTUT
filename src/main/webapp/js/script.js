/*Affiche la réponse à la question cliquée*/
       for (let elem of document.querySelectorAll(".q")) {
                  elem.addEventListener("click",reponse);      
      function reponse(event){
        if (elem.nextElementSibling.style.display='none') {
            elem.nextElementSibling.style.display='block';
        } 
      }}
      for (let elem of document.querySelectorAll(".r")) {
                  elem.addEventListener("click",reponse);      
      function reponse(event){
        if (elem.style.display='block') {
            elem.style.display='none';
        } 
      }}



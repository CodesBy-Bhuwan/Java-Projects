console.log("here working fine!!!")


let currentTheme = getTheme();
changeTheme();



function changeTheme(){

    // This will add new class in html file called "currentTheme"
    document.querySelector("html").classList.add(currentTheme);

    // setting the event-listener so that when we click the button theme will be changed
    const changeThemeButton = document.querySelector("#change_theme");
    changeThemeButton.addEventListener("click", (event)=>{
        
        console.log("Button clicked");

        // className will be removed 
        document.querySelector("html").classList.remove(currentTheme);

        // return currentTheme=="dark" ? currentTheme="light" : currentTheme="dark";
        if(currentTheme=="dark"){
            currentTheme="light";
        }else{
            currentTheme="dark";
        }


        document.querySelector("html").classList.add(currentTheme);
    })

    // now we need to store changedData else it will always get set to 0 value;


}

function setTheme(theme) {
    localStorage.setItem("theme", theme);

}


function getTheme(theme){
    localStorage.getItem("theme");

    // if(theme){
    //     return theme;
    // }
    // else{
    //     return "light";
    // }


    // this is latest and is also good habit of using ternery operation 
    return theme ? theme : "light";


}
let link = localStorage["pets-data-link"];

$(function(){
    $.getJSON(link, displayPetData);
});

function displayPetData(pet) {

    $("#pet_name").text(pet.name);
    switch (pet.kind) {
        case 1:
            $("#pet_kind").text("Cat");
        case 2:
            $("#pet_kind").text("Dog");
        case 3:
            $("#pet_kind").text("Rabbit");
        default:
            $("#pet_kind").text("NULL");
    }

    $("#pet_age").text(pet.age);
    if(pet.vaccination){
        $("#pet_vaccination").text("Vaccinated");
    }else{
        $("#pet_vaccination").text("Not Vaccinated");
    }

}

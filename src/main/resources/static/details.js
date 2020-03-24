let link = localStorage["pet-data-link"];

$(function(){
    $.getJSON(link, displayPetData);
});

function displayPetData(pet) {

    console.log("test");
    $("#petName").text(pet.name);
    if(pet.kind == 1){
        $("#petKind").text("Cat");
    }else if(pet.kind == 2){
        $("#petKind").text("Dog");
    }else if(pet.kind == 3){
        $("#petKind").text("Rabbit");
    }

    $("#petAge").text(pet.age);
    if(pet.vaccination){
        $("#petVaccination").text("Yes");
    }else{
        $("#petVaccination").text("No");
    }

}

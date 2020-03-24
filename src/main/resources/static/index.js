$(function () {
    $.getJSON("pets", displayPetTable);
});

function displayPetTable(data) {

    let pets  = data["_embedded"].pets;

    if(pets.length > 0){
        $("#no_data_message").hide();
        let tbody$ = $("#data_table tbody");
        tbody$.html("");
        pets.forEach(function(pet, index){
            let link = pet["_links"].self.href;
            tbody$.append(
                `<tr>
                    <th scope="row" class="align-middle">${index + 1}</th>
                    <td class="align-middle">${pet.name}</td>
                    <td>
                        <ul class="nav justify-content-center">
                            <li class="nav-item">
                                <a class="nav-link" href="details.html" data-link="${link}">
                                    <i class="material-icons">info</i>&nbsp;Info</a>
                            </li>
                        </ul>
                    </td>
                </tr>`);
        });
        $("#data_table a").click(function(){
            localStorage["pet-data-link"] = $(this).data("link");
        });
    }else{
        $("#data_table").hide();
    }

}

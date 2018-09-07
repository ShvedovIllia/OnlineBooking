$(document).ready(function(){
    console.log("ready");
});



var getCoaches = $("#showAllCoaches");
var getEquipment = $("#showAllEquipment");
var getWater = $("#showAllWater");
var getGPP = $("#showAllGPP");
var server = "http://localhost:8088/";

function getCoaches(){
    var html = "<table>"
    $.ajax({
        url: server + "coach/getAll",
        method: 'get',
        contentType: 'application/json',
        dataType : 'json',
        success: function(result){
            console.log(result);
            $.each(result, function(i){
            html+= "<tr><td>" + result[i].id + "</td> <td>" + result[i].firstName + "</td>  </tr>";
            });
            html +="</table>";
            getCoaches.html(html);
            
        }
    });
} 
function getEquipment () {
        var html = "<table>"
    $.ajax({
        url: server + "equipment/getAll",
        method: 'get',
        contentType: 'application/json',
        dataType : 'json',
        success: function(result){
            console.log(result);
            $.each(result, function(i){
            html+= "<tr><td>" + result[i].id + "</td> <td>" + result[i].firstName + "</td>  </tr>";
            });
            html +="</table>";
            getCoaches.html(html);
            
        }
    });
}
function getWater (){
        var html = "<table>"
    $.ajax({
        url: server + "water/getAll",
        method: 'get',
        contentType: 'application/json',
        dataType : 'json',
        success: function(result){
            console.log(result);
            $.each(result, function(i){
            html+= "<tr><td>" + result[i].id + "</td> <td>" + result[i].firstName + "</td>  </tr>";
            });
            html +="</table>";
            getCoaches.html(html);
            
        }
    });
}
function getGroupPractice(){
        var html = "<table>"
    $.ajax({
        url: server + "gpp/getAll",
        method: 'get',
        contentType: 'application/json',
        dataType : 'json',
        success: function(result){
            console.log(result);
            $.each(result, function(i){
            html+= "<tr><td>" + result[i].id + "</td> <td>" + result[i].firstName + "</td>  </tr>";
            });
            html +="</table>";
            getCoaches.html(html);
            
        }
    });
}
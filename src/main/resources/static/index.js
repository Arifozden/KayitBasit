$(function (){
    tumMusterileriGetir();
});

function tumMusterileriGetir(){
    $.get("/musterileriGetir",function (musteriler){
        duzenleMusteriler(musteriler);
    });
}

function duzenleMusteriler(musteriler){
    let yaz="<table class='table table-striped'>"+
        "<tr>"+
        "<th>Isim</th><th>Soyisim</th><th>Marka</th><th>Ehliyet</th>"+
        "</tr>";
    for(const musteri of musteriler){
        let ehliyet="";
        if(musteri.ehliyet){
            ehliyet="Evet";
        }
        else {
            ehliyet="Hayir";
        }
        yaz+="<tr>"+
            "<td>"+musteri.isim+"</td>"+
            "<td>"+musteri.soyisim+"</td>"+
            "<td>"+musteri.arabaModel+"</td>"+
            "<td>"+ehliyet+"</td>"+
            "</tr>";
    }
    $("#musteriler").html(yaz);
}

function hepsiniSil(){
    $.get("/hepsiniSil",function (){
        window.location.href='/';
    });
}
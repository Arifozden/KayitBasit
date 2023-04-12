function musteriKayit(){
    const musteri={
        isim : $("#isim").val(),
        soyisim : $("#soyisim").val(),
        arabaModel:$('input[name=seciliAraba]:checked').val(),
        ehliyet : $('input[name=ehliyet]:checked').val()
    };
    const url="/musteriKayit";
    $.post(url,musteri,function (){
        window.location.href='/';
    });
}
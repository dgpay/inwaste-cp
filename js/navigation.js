function goBack() {
    window.history.back();
}


function ConfirmPopUp() {
    var txt;
    var r = confirm("Anda Tidak dapat mengakses halaman ini lagi! Yakin Akan Melanjutkan?! ");
    if (r == true) {
        return true;
    } else {
        return false;

    }
}